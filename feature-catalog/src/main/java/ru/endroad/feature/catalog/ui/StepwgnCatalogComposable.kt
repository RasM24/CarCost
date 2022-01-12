package ru.endroad.feature.catalog.ui

import androidx.compose.runtime.Composable
import ru.endroad.shared.autopart.catalog.StepwgnCatalog

@Composable
fun StepwgnCatalogComposable(onBackClicked: () -> Unit) {
	CatalogComposable(title = "Партномера [StepWGN]", StepwgnCatalog.parts, onBackClicked = onBackClicked)
}
