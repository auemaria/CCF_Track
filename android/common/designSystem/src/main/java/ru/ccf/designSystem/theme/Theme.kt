package ru.ccf.designSystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColorScheme(
    primary = psychoPrimary,
    onPrimary = Color.White,
    secondary = psychoDarkBackground,
    primaryContainer = psychoPrimaryDark,
    onPrimaryContainer = Color.White,
    onSecondaryContainer = Color.White,
    surfaceVariant = psychoPrimary.copy(alpha = 0.1f),
    inverseSurface = Color.White,
    inverseOnSurface = Color.Black,
    tertiary = psychoPrimaryGray,
    onTertiary = Color.White,
    background = psychoDarkBackground,
    onBackground = Color.White,
    surface = psychoDarkBackground
)

private val LightColorPalette = lightColorScheme(
    primary = psychoPrimary,
    onPrimary = Color.Black,
    secondary = psychoPrimaryLight,
    primaryContainer = psychoPrimaryLight,
    onPrimaryContainer = Color.Black,
    onSecondaryContainer = Color.Black,
    surfaceVariant = psychoPrimary.copy(alpha = 0.1f),
    inverseSurface = Color.White,
    inverseOnSurface = Color.Black,
    tertiary = psychoPrimaryGray,
    onTertiary = psychoOnGray,
    background = psychoLightGrayBackground,
    onBackground = Color.Black,
    surface = psychoLightGrayBackground
)

@Composable
fun PsychoEvaluationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
