package ru.endroad.feature.order.list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
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
		onBackClicked = onBackClicked,
	)
}

@Composable
fun CivicServiceComposable(onBackClicked: () -> Unit) {
	ServiceListComposable(
		title = "Сервисная книжка [Civic]",
		services = listOf(),
		orders = listOf(),
		onBackClicked = onBackClicked,
	)
}

@Composable
private fun ServiceListComposable(
	title: String,
	services: List<Service>,
	orders: List<Order>,
	onBackClicked: () -> Unit
) {
	Scaffold(topBar = flatTopBar(title = title, navigationClick = onBackClicked)) {
		LazyColumn {
			item { Hole(12.dp) }

			item { PurchaseItemComposable(orders = orders) }

			items(services) { service -> ServiceItemComposable(service) }

			item { Hole(12.dp) }
		}
	}
}
