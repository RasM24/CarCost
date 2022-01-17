package ru.endroad.feature.order.detail.entity

data class WorkPay(val cost: Order.Cost?, val master: String)

fun Standart() = WorkPay(null, """СТО "Стандарт"""")
fun Kornet() = WorkPay(null, """СТО "Корнет"""")
fun Denderov(cost: Order.Cost) = WorkPay(cost, "Denderov customs")
fun Independently() = WorkPay(null, "Самостоятельно")
