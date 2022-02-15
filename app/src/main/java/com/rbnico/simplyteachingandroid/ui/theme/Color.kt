package com.rbnico.simplyteachingandroid.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color



val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val _cardD = Color(0xFF005997)
val _cardL = Color(0xFFbee4ff)

val _primaryL = Color(0xFF4040FF)
val _primaryVariantL = Color(0xFF3700B3)
val _secondaryL = Color(0xFF03DAC5)
val _secondaryVariantL = Color(0xFF018786)
val _backgroundL = Color(0xFFFFFFFF)
val _surfaceL = _backgroundL
val _errorL = Color(0xFFB00020)
val _onPrimaryL = _backgroundL
val _onSecondaryL = Color(0xFF000000)
val _onBackgroundL = _onSecondaryL
val _onSurfaceL = _onBackgroundL
val _onErrorL = _backgroundL

val _primaryD = Color(0xFF9090FF)
val _primaryVariantD = Color(0xFF3700B3)
val _secondaryD = Color(0xFF03DAC6)
val _secondaryVariantD = _secondaryD
val _backgroundD = Color(0xFF121212)
val _surfaceD = _backgroundD
val _errorD = Color(0xFFCF6679)
val _onPrimaryD = _backgroundD
val _onSecondaryD = _backgroundD
val _onBackgroundD = Color(0xFFFFFFFF)
val _onSurfaceD= _onBackgroundD
val _onErrorD = Color(0xFF000000)

var cardColor: Color = _cardL

private val LightColors = lightColors(
    primary = _primaryL,
    secondary = _secondaryL,
    primaryVariant = _primaryVariantL,
    secondaryVariant = _secondaryVariantL,
    background = _backgroundL,
    surface = _surfaceL,
    error = _errorL,
    onPrimary = _onPrimaryL,
    onSecondary = _onSecondaryL,
    onBackground = _onBackgroundL,
    onSurface = _onSurfaceL,
    onError = _onErrorL

    // ...
)
private val DarkColors = darkColors(
    primary = _primaryD,
    secondary = _secondaryD,
    primaryVariant = _primaryVariantD,
    secondaryVariant = _secondaryVariantD,
    background = _backgroundD,
    surface = _surfaceD,
    error = _errorD,
    onPrimary = _onPrimaryD,
    onSecondary = _onSecondaryD,
    onBackground = _onBackgroundD,
    onSurface = _onSurfaceD,
    onError = _onErrorD
)


@Composable
fun MyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    cardColor = if(darkTheme) _cardD else _cardL
    MaterialTheme(
        colors = if (darkTheme) DarkColors else LightColors,
        /*...*/
        content = content
    )
}
