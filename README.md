# QR Rounder

**QR Rounder** is a modern, lightweight Android application built with **Jetpack Compose**, designed to make QR code scanning and generation fast, easy, and accessible.

Whether you're trying to scan a QR code to visit a link or share a contact, or you need to generate your own QR code from any text or URL, QR Rounder has you covered.

---

## Features

- **Scan QR Codes**
  - Scan any QR code using your device’s camera.
  - Uses **ML Kit from Google** for fast and reliable detection.
  - Automatically detects and extracts QR content.
  - Quickly **copy** or **share** scanned data.

-  **Generate QR Codes**
  - Input any text or URL and instantly generate a QR code.
  - High-quality QR code generation using **ZXing**.
  - QR code preview displayed in-app.

-  **Jetpack Compose UI**
  - Built entirely with **Jetpack Compose** for a clean, responsive, and modern UI.
  - Smooth transitions using **Compose Navigation**.

-  **MVVM Architecture**
  - Clean separation of concerns using **ViewModel** and **State Hoisting**.
  - Scalable and testable structure.

---

## Built With

- **Kotlin**
- **Jetpack Compose** – Declarative UI framework
- **ViewModel** – Lifecycle-aware view logic
- **Compose Navigation** – In-app navigation
- **ML Kit (Barcode Scanning)** – Google ML Kit for real-time QR scanning
- **ZXing** – For QR code generation
- **Material 3 (M3)** – For modern UI components

### ML Kit QR Scanning

#### QR Rounder uses Google's ML Kit Barcode Scanning API, which provides:
  - Real-time detection
  - High accuracy
  - No internet required
  - Support for all standard barcode types (QR, AZTEC, PDF417, etc.)

#### Share or Copy Scanned Results
When a QR code is scanned, the app gives you instant options to:
  - Copy to clipboard
  - Share via messaging, email, or other apps
