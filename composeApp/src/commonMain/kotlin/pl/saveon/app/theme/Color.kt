package pl.saveon.app.theme

import androidx.compose.ui.graphics.Color

// Brand Colors
val PurplePrimary = Color(0xFF5D52FF)
val PurpleLight = Color(0xFFCECBFF)
val AppBackground = Color(0xFFF7F7F7)
val AppSurface = Color(0xFFF7F7F7)
val AppError = Color(0xFFE1075E)
val White = Color(0xFFFFFFFF)
val Black = Color(0xFF000000)

// Light Theme
val LightPrimary = PurplePrimary
val LightOnPrimary = White
val LightPrimaryContainer = PurpleLight
val LightOnPrimaryContainer = Black
val LightBackground = AppBackground
val LightOnBackground = Black
val LightSurface = AppSurface
val LightOnSurface = Black
val LightError = AppError
val LightOnError = White

// Dark Theme (simple inversion)
val DarkPrimary = PurpleLight
val DarkOnPrimary = Black
val DarkPrimaryContainer = PurplePrimary
val DarkOnPrimaryContainer = White
val DarkBackground = Black
val DarkOnBackground = White
val DarkSurface = Black
val DarkOnSurface = White
val DarkError = AppError
val DarkOnError = White
