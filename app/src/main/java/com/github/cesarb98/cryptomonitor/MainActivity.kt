package com.github.cesarb98.cryptomonitor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.github.cesarb98.cryptomonitor.ui.theme.CryptoMonitorTheme
import com.github.cesarb98.cryptomonitor.ui.theme.screens.CryptoMonitorScreen
import com.github.cesarb98.cryptomonitor.viewmodel.CryptoViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: CryptoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CryptoMonitorTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    CryptoMonitorScreen(viewModel = viewModel)
                }
            }
        }
    }
}