package ru.endroad.feature.order.detail.entity

data class WorkPay(val cost: Order.Cost?, val master: String)

fun Denderov(cost: Order.Cost) = WorkPay(cost, "Denderov customs")
fun Independently() = WorkPay(null, "Самостоятельно")
