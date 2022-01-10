package ru.endroad.library.compose.widget

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import ru.endroad.library.compose.util.UnitListener

@Composable
fun FlatTopBar(
	title: String,
	navigationClick: UnitListener?,
) = TopAppBar(
	title = { Text(text = title) },
	navigationIcon = navigationClick?.let { navigationIcon(onClick = navigationClick) },
)

fun flatTopBar(
	title: String,
	navigationClick: UnitListener? = null,
) = @Composable {
	TopAppBar(
		title = { Text(text = title) },
		navigationIcon = navigationClick?.let { navigationIcon(onClick = navigationClick) },
	)
}
