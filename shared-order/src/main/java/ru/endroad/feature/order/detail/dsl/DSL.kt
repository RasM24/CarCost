package ru.endroad.feature.order.detail.dsl

import ru.endroad.feature.order.detail.entity.Independently
import ru.endroad.feature.order.detail.entity.Order
import ru.endroad.feature.order.detail.entity.Receipt
import ru.endroad.feature.order.detail.entity.Service
import ru.endroad.feature.order.detail.entity.ServiceBook
import ru.endroad.feature.order.detail.entity.WorkPay
import ru.endroad.shared.autopart.base.Part

fun serviceBook(body: ServiceBookContext.() -> Unit): ServiceBook =
	ServiceBookContext().apply(body).build()

class ServiceBookContext {

	private val services = mutableListOf<Service>()
	private val purchasedPart = mutableListOf<Order>()

	fun service(
		mileage: Service.Mileage? = null,
		date: Service.Date? = null,
		workPay: WorkPay = Independently(),
		body: ServiceContext.() -> Unit
	) {
		ServiceContext(mileage, date, workPay)
			.apply(body)
			.build()
			.let(services::add)
	}

	fun purchase(body: PurchaseContext.() -> Unit) {
		PurchaseContext()
			.apply(body)
			.build()
			.let(purchasedPart::addAll)
	}

	fun build() = ServiceBook(services, purchasedPart)

	infix fun Receipt.part(part: Part): Pair<Receipt, Part> = Pair(this, part)
}

class ServiceContext(
	private val mileage: Service.Mileage?,
	private val date: Service.Date?,
	private val workPay: WorkPay,
) {

	private val orders = mutableListOf<Order>()

	infix fun Pair<Receipt, Part>.boughtFor(cost: Order.Cost) {
		Order(second, first, cost).also(orders::add)
	}

	fun build(): Service =
		Service(workPay, orders, mileage, date)
}

class PurchaseContext {

	private val purchasedPart = mutableListOf<Order>()

	infix fun Pair<Receipt, Part>.boughtFor(cost: Order.Cost) {
		Order(second, first, cost).also(purchasedPart::add)
	}

	fun build(): List<Order> =
		purchasedPart
}
