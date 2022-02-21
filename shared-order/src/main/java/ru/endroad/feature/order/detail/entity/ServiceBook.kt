package ru.endroad.feature.order.detail.entity

data class ServiceBook(
	val services: List<Service>,
	val purchasedPart: List<Order>,
	val zipPart: List<Order>,
)
