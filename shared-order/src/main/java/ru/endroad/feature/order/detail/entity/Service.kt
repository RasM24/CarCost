package ru.endroad.feature.order.detail.entity

import ru.endroad.feature.order.detail.entity.Order.Cost
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

data class Service(
	val workPay: WorkPay,
	val orders: List<Order>,
	val mileage: Mileage?,
	val date: Date?,
) {

	private val workPayCost get() = workPay.cost ?: Cost(0)
	val summary: Cost get() = orders.sumOf { it.cost.origin }.let(::Cost) + workPayCost

	@JvmInline
	value class Mileage(val origin: Int) {

		fun format(): String =
			"$origin км"
	}

	@JvmInline
	value class Date(val timestamp: Long) {

		constructor(day: Int, mouth: Int, year: Int) : this(rawDateToUnixTime(day, mouth, year))

		fun format(): String =
			java.util.Date(timestamp * 1000L)
				.let(OUTPUT_DATE_FORMAT::format)

		private companion object {

			private val OUTPUT_DATE_FORMAT = SimpleDateFormat("d MMM yyyy", Locale.getDefault())

			fun rawDateToUnixTime(day: Int, mouth: Int, year: Int): Long =
				Calendar.getInstance().apply { set(year, mouth, day) }.timeInMillis / 1000
		}
	}
}
