package ru.endroad.feature.order.detail.entity

data class Receipt internal constructor(val shop: String, val number: String)

fun Undefined() = Receipt(shop = "Неизвестно", "Данные из сервисной книжки")

fun Exist(number: String) = Receipt("Exist", number)

fun Autoatlant() = Receipt("Autoatlant", "")

fun Hokkaido(number: String) = Receipt(shop = "Hokkaidokras", number = "Контракт, $number")
