package ru.endroad.feature.order.detail.entity

data class Receipt internal constructor(val shop: String, val number: String)

fun Exist(number: String) = Receipt("Exist", number)

fun Autoatlant() = Receipt("Autoatlant", "")
