package ru.endroad.library.compose.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color
import ru.endroad.library.compose.theme.MaterialColor.BlueGray
import ru.endroad.library.compose.theme.MaterialColor.Brown
import ru.endroad.library.compose.theme.MaterialColor.Red

internal val LightThemeColors = lightColors(
	primary = Brown.s400,
	primaryVariant = Brown.s600,
	onPrimary = Color.White,
	secondary = BlueGray.s600,
	secondaryVariant = BlueGray.s800,
	onSecondary = Color.White,
	error = Red.alternative400
)

internal val DarkThemeColors = darkColors(
	primary = Brown.s600,
	primaryVariant = Brown.s800,
	onPrimary = Color.Black,
	secondary = BlueGray.s700,
	secondaryVariant = BlueGray.s900,
	onSecondary = Color.White,
	error = Red.alternative100
)
