package ru.endroad.feature.catalog.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import ru.endroad.library.compose.extension.setClipboard
import ru.endroad.library.compose.widget.Hole
import ru.endroad.library.compose.widget.PrimaryBoldText
import ru.endroad.library.compose.widget.PrimaryText
import ru.endroad.library.compose.widget.TitleText
import ru.endroad.library.compose.widget.flatTopBar
import ru.endroad.shared.autopart.base.Part
import ru.endroad.shared.autopart.base.PartGroup
import ru.endroad.shared.autopart.base.PartNumber

private val itemModifier = Modifier
	.fillMaxWidth()
	.wrapContentHeight()
	.padding(horizontal = 16.dp, vertical = 4.dp)

@Composable
fun CatalogComposable(
	title: String,
	partGroups: List<PartGroup>,
	onBackClicked: () -> Unit
) {
	Scaffold(topBar = flatTopBar(title = title, navigationClick = onBackClicked)) {
		val context = LocalContext.current

		LazyColumn {

			item { Hole(12.dp) }

			items(partGroups) { partGroup ->
				CatalogGroupItem(
					modifier = itemModifier,
					groupName = partGroup.name,
					parts = partGroup.parts,
					onPartNumberDetailClick = { part -> context.setClipboard("PartNumber", part.partNumber.number) },
				)
			}

			item { Hole(12.dp) }
		}
	}
}

@Composable
fun CatalogGroupItem(
	modifier: Modifier = Modifier,
	groupName: String,
	parts: List<Part>,
	onPartNumberDetailClick: (Part) -> Unit,
) {
	Card(modifier = modifier) {
		Column {
			Hole(16.dp)
			TitleText(modifier = Modifier.padding(horizontal = 16.dp), text = groupName)
			Hole(8.dp)
			Divider(modifier = Modifier.padding(horizontal = 16.dp), color = Gray, thickness = 2.dp) //TODO ColorHardcode
			Hole(24.dp)

			parts.forEachIndexed { index, part -> PartDetailItem(part = part, isLast = index == parts.lastIndex, onItemClick = onPartNumberDetailClick) }
		}
	}
}

@Composable
fun PartDetailItem(
	part: Part,
	isLast: Boolean,
	onItemClick: (Part) -> Unit,
) {
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.clickable(onClick = { onItemClick(part) })
	) {
		Column(modifier = Modifier.padding(horizontal = 16.dp)) {
			Hole(16.dp)

			PrimaryBoldText(text = part.name)
			Hole(8.dp)
			PartNumberDetail(partNumber = part.partNumber)

			Hole(16.dp)
			if (!isLast) Divider(startIndent = 16.dp)
		}
	}
}

@Composable
fun PartNumberDetail(partNumber: PartNumber) {
	Row(
		modifier = Modifier
			.fillMaxWidth()
	) {
		PrimaryText(partNumber.manufacturer.name)
		Hole(12.dp)
		PrimaryText(partNumber.number)
		Hole(12.dp)

		Spacer(modifier = Modifier.weight(1f))
	}
}
