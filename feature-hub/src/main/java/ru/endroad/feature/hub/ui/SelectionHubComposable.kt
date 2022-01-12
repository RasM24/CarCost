package ru.endroad.feature.hub.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import ru.endroad.feature.hub.ui.SelectionHubAction.CivicCatalogClicked
import ru.endroad.feature.hub.ui.SelectionHubAction.CivicServiceBookClicked
import ru.endroad.feature.hub.ui.SelectionHubAction.StepwgnCatalogClicked
import ru.endroad.feature.hub.ui.SelectionHubAction.StepwgnServiceBookClicked
import ru.endroad.library.compose.widget.Hole
import ru.endroad.library.compose.widget.PrimaryText
import ru.endroad.library.compose.widget.flatTopBar

@Composable
fun SelectionHubComposable(onAction: (SelectionHubAction) -> Unit) {
	Scaffold(topBar = flatTopBar(title = "Каталог")) {
		Column {
			SelectionButton(icon = Icons.Outlined.Info, text = "Civic, Каталог", onClick = { onAction(CivicCatalogClicked) })
			Divider(startIndent = 32.dp)
			SelectionButton(icon = Icons.Outlined.Info, text = "Stepwgn, Каталог", onClick = { onAction(StepwgnCatalogClicked) })
			Divider(startIndent = 32.dp)
			SelectionButton(icon = Icons.Outlined.Person, text = "Civic, Сервисная книжка", onClick = { onAction(CivicServiceBookClicked) })
			Divider(startIndent = 32.dp)
			SelectionButton(icon = Icons.Outlined.Person, text = "Stepwgn, Сервисная книжка", onClick = { onAction(StepwgnServiceBookClicked) })
		}
	}
}

@Composable
fun SelectionButton(
	icon: ImageVector,
	text: String,
	onClick: () -> Unit,
) {
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.height(72.dp)
			.clickable(onClick = { onClick() })
	) {
		Row(
			modifier = Modifier
				.fillMaxWidth()
				.padding(vertical = 16.dp, horizontal = 16.dp)
				.align(Alignment.Center)
		) {
			Icon(imageVector = icon, contentDescription = text)
			Hole(12.dp)
			PrimaryText(text = text)
		}
	}
}
