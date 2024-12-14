package com.sendiko.composeonfire

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Compose on Fire",
    ) {
        App()
    }
}