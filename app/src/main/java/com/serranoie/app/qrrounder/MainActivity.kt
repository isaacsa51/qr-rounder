package com.serranoie.app.qrrounder

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.serranoie.app.qrrounder.ui.theme.QRRounderTheme

class MainActivity : ComponentActivity() {
    private val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { granted ->
        if (!granted) {
            Toast.makeText(this, "Camera permission denied", Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            enableEdgeToEdge(
                statusBarStyle =
                    SystemBarStyle.auto(
                        Color.Transparent.toArgb(),
                        Color.Transparent.toArgb(),
                    ),
                navigationBarStyle =
                    SystemBarStyle.auto(
                        Color.Transparent.toArgb(),
                        Color.Transparent.toArgb(),
                    ),
            )

            QRRounderTheme {
                var showScanner by remember { mutableStateOf(false) }
                
                if (showScanner) {
                    // Request camera permission when switching to scanner
                    requestPermissionLauncher.launch(android.Manifest.permission.CAMERA)
                    QRCodeScannerWithBottomSheet(
                        onBackPressed = { showScanner = false }
                    )
                } else {
                    HomeScreen(
                        onScanClicked = { showScanner = true }
                    )
                }
            }
        }
    }
}