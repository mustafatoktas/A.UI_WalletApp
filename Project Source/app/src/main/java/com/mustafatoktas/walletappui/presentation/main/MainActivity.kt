package com.mustafatoktas.walletappui.presentation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.mustafatoktas.walletappui.presentation.anasayfa.AnasayfaScreen
import com.mustafatoktas.walletappui.ui.WalletAppUITheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()
        enableEdgeToEdge()

        setContent {
            WalletAppUITheme {

                Surface (
                    modifier = Modifier.fillMaxSize()
                ) {
                    AnasayfaScreen()
                }
            }
        }
    }
}