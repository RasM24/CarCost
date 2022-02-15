package ru.endroad.feature.order.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ru.endroad.feature.order.detail.entity.Order
import ru.endroad.feature.order.detail.entity.Service
import ru.endroad.library.compose.widget.Hole
import ru.endroad.library.compose.widget.PrimaryBoldText
import ru.endroad.library.compose.widget.PrimaryText
import ru.endroad.library.compose.widget.TitleText

private val itemModifier = Modifier
	.fillMaxWidth()
	.wrapContentHeight()
	.padding(horizontal = 16.dp, vertical = 4.dp)

@Composable
fun ServiceItemComposable(service: Service) {
	GroupedCard(
		modifier = itemModifier,
		dataList = service.orders,
		header = { ServiceHeader(service) },
		item = { OrderItemComposable(it) },
		footer = { ServiceFooter(service) },
		elevation = 6.dp,
	)
}

@Composable
private fun ServiceHeader(service: Service) {
	Row(modifier = Modifier.padding(horizontal = 16.dp)) {
		TitleText(text = service.mileage?.format() ?: "-")
		Spacer(modifier = Modifier.weight(1f))
		PrimaryText(text = service.date?.format() ?: "-")
	}
}

@Composable
private fun ServiceFooter(service: Service) {
	Column {
		GroupedCardItem(service.workPay.master, service.workPay.cost?.format() ?: "")
		Hole(16.dp)
		Row(modifier = Modifier.padding(horizontal = 16.dp)) {
			Spacer(modifier = Modifier.weight(1f))
			PrimaryText(text = "сумма:   ")
			PrimaryBoldText(text = service.summary.format())
		}
	}
}

@Composable
fun PurchaseItemComposable(orders: List<Order>) {
	GroupedCard(
		modifier = itemModifier,
		dataList = orders,
		item = { OrderItemComposable(it) },
		elevation = 0.dp,
	)
}

@Composable
private fun OrderItemComposable(order: Order) =
	GroupedCardItem(title = order.part.name, explanation = order.cost.format())

@Composable
fun GroupedCardItem(title: String, explanation: String) {
	Row(modifier = Modifier.padding(horizontal = 16.dp)) {
		PrimaryText(modifier = Modifier.weight(10f), text = title, maxLines = 2)
		Spacer(modifier = Modifier.weight(1f))
		PrimaryText(modifier = Modifier.wrapContentWidth(), text = explanation)
	}
}

@Composable
private fun <T> GroupedCard(
	modifier: Modifier = Modifier,
	dataList: List<T>,
	header: (@Composable () -> Unit)? = null,
	item: @Composable (T) -> Unit,
	footer: (@Composable () -> Unit)? = null,
	elevation: Dp = 1.dp,
) {
	Card(
		modifier = modifier,
		elevation = elevation
	) {

		Column {
			Hole(16.dp)

			if (header != null) {
				header()
				Hole(8.dp)
				Divider(modifier = Modifier.padding(horizontal = 16.dp), color = Color.Gray, thickness = 2.dp) //TODO ColorHardcode
				Hole(24.dp)
			}

			dataList.forEachIndexed { index, data ->
				Hole(16.dp)

				item(data)

				Hole(16.dp)
				if (index != dataList.lastIndex) Divider(startIndent = 16.dp)
			}

			if (footer != null) {
				Hole(8.dp)
				Divider(modifier = Modifier.padding(horizontal = 16.dp), color = Color.Gray, thickness = 1.dp) //TODO ColorHardcode
				Hole(16.dp)
				footer()
				Hole(24.dp)
			}
		}
	}
}

