package ru.endroad.feature.order.detail.entity

import ru.endroad.shared.autopart.base.Part

data class Order(
	val part: Part,
	val receipt: Receipt,
	val cost: Cost,
) {

	@JvmInline
	value class Cost(val origin: Int) {

		fun format(): String =
			"$origin RUB"
	}
}
