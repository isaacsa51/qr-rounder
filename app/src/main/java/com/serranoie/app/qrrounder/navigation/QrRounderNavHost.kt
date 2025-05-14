package com.serranoie.app.qrrounder.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.serranoie.app.qrrounder.ui.home.HomeScreen
import com.serranoie.app.qrrounder.ui.home.HomeViewModel
import com.serranoie.app.qrrounder.ui.qr.QRCodeScannerWithBottomSheet
import com.serranoie.app.qrrounder.ui.qr.ScannerViewModel

@Composable
fun QrRounderNavHost(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            val homeViewModel = viewModel<HomeViewModel>()
            HomeScreen(
                viewModel = homeViewModel,
                onScanClicked = { navController.navigate(Screen.Scanner.route) }
            )
        }

        composable(Screen.Scanner.route) {
            val scannerViewModel = viewModel<ScannerViewModel>()
            QRCodeScannerWithBottomSheet(
                viewModel = scannerViewModel,
                onBackPressed = { navController.navigateUp() }
            )
        }
    }
}