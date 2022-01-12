package ru.endroad.feature.catalog.ui

import androidx.compose.runtime.Composable
import ru.endroad.shared.autopart.catalog.CivicCatalog

@Composable
fun CivicCatalogComposable(onBackClicked: () -> Unit) {
	CatalogComposable(title = "Партномера [Civic]", CivicCatalog.parts, onBackClicked = onBackClicked)
}
