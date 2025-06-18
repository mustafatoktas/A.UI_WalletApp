package com.mustafatoktas.walletappui.common

import androidx.compose.ui.graphics.Color
import kotlin.random.Random

fun getRandomRenk (minBrightness: Int = 80): Color {
    val random = Random.Default
    val red = random.nextInt(minBrightness, 256)
    val green = random.nextInt(minBrightness, 256)
    val blue = random.nextInt(minBrightness, 256)
    return Color(red, green, blue)
}