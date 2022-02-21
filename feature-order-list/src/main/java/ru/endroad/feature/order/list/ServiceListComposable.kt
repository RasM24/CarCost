package ru.endroad.feature.order.list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import ru.endroad.feature.order.detail.entity.Order
import ru.endroad.feature.order.detail.entity.Service
import ru.endroad.library.compose.widget.Hole
import ru.endroad.library.compose.widget.flatTopBar

@Composable
fun StepwgnServiceComposable(onBackClicked: () -> Unit) {
	ServiceListComposable(
		title = "Сервисная книжка [StepWGN]",
		services = HardcoreDataStepwgn.serviceBook.services,
		orders = HardcoreDataStepwgn.serviceBook.purchasedPart,
		zip = HardcoreDataStepwgn.serviceBook.zipPart,
		onBackClicked = onBackClicked,
	)
}

@Composable
fun CivicServiceComposable(onBackClicked: () -> Unit) {
	ServiceListComposable(
		title = "Сервисная книжка [Civic]",
		services = HardcoreDataCivic.serviceBook.services,
		orders = HardcoreDataCivic.serviceBook.purchasedPart,
		zip = HardcoreDataCivic.serviceBook.zipPart,
		onBackClicked = onBackClicked,
	)
}

@Composable
private fun ServiceListComposable(
	title: String,
	services: List<Service>,
	orders: List<Order>,
	zip: List<Order>,
	onBackClicked: () -> Unit
) {
	val expandedCardIds = remember { mutableStateListOf<Int>() }

	Scaffold(topBar = flatTopBar(title = title, navigationClick = onBackClicked)) {
		LazyColumn {
			item { Hole(12.dp) }

			item { PurchaseItemComposable(title = "Закуп", orders = orders) }

			item { PurchaseItemComposable(title = "ZIP", orders = zip) }

			itemsIndexed(services) { index, service ->
				ServiceItemComposable(service, onCardClick = { expandedCardIds.switchExpanded(index) }, expanded = expandedCardIds.contains(index))
			}

			item { Hole(12.dp) }
		}
	}
}

private fun MutableList<Int>.switchExpanded(index: Int) {
	if (contains(index)) remove(index) else add(index)
}
