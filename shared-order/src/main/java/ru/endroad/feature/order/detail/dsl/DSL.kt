package ru.endroad.feature.order.detail.dsl

import ru.endroad.feature.order.detail.entity.Independently
import ru.endroad.feature.order.detail.entity.Order
import ru.endroad.feature.order.detail.entity.Receipt
import ru.endroad.feature.order.detail.entity.Service
import ru.endroad.feature.order.detail.entity.ServiceBook
import ru.endroad.feature.order.detail.entity.WorkPay
import ru.endroad.shared.autopart.base.Part

object ServiceBookDsl : (ServiceBookDsl.() -> Unit) -> ServiceBook {

	private val services = mutableListOf<Service>()
	private val purchasedPart = mutableListOf<Order>()

	override fun invoke(dsl: ServiceBookDsl.() -> Unit): ServiceBook {
		this.dsl()
		return ServiceBook(services, purchasedPart)
	}

	fun service(
		mileage: Service.Mileage? = null,
		date: Service.Date? = null,
		workPay: WorkPay = Independently(),
		body: ServiceDsl.() -> Unit
	) {
		ServiceDsl(mileage, date, workPay)
			.invoke(body)
			.let(services::add)
	}

	fun purchase(body: PurchaseDsl.() -> Unit) {
		PurchaseDsl()
			.invoke(body)
			.let(purchasedPart::addAll)
	}

	infix fun Receipt.part(part: Part): Pair<Receipt, Part> = Pair(this, part)
}

class ServiceDsl(
	private val mileage: Service.Mileage?,
	private val date: Service.Date?,
	private val workPay: WorkPay,
) : (ServiceDsl.() -> Unit) -> Service {

	override fun invoke(dsl: ServiceDsl.() -> Unit): Service {
		dsl()
		return Service(workPay, orders, mileage, date)
	}

	private val orders = mutableListOf<Order>()

	infix fun Pair<Receipt, Part>.boughtFor(cost: Order.Cost) {
		Order(second, first, cost).also(orders::add)
	}
}

class PurchaseDsl : (PurchaseDsl.() -> Unit) -> List<Order> {

	private val purchasedPart = mutableListOf<Order>()

	override fun invoke(dsl: PurchaseDsl.() -> Unit): List<Order> {
		dsl()
		return purchasedPart
	}

	infix fun Pair<Receipt, Part>.boughtFor(cost: Order.Cost) {
		Order(second, first, cost).also(purchasedPart::add)
	}
}
