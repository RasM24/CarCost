package ru.endroad.feature.order.detail.entity

data class Receipt internal constructor(val shop: String, val number: String)

fun Undefined() = Receipt(shop = "Неизвестно", "Данные из сервисной книжки")

fun AutoAtlant() = Receipt("AutoAtlant", "")

fun AutoMarket() = Receipt(shop = "Автомаркет", number = "Контракт")

fun AutoNahodka(number: String = "") = Receipt(shop = "АвтоНаходка", number = "Контракт, $number")

fun Carbonado() = Receipt("Carbonado", "")

fun Exist(number: String) = Receipt("Exist", number)

fun Hokkaido(number: String) = Receipt(shop = "Hokkaidokras", number = "Контракт, $number")

fun Sakura(number: String = "") = Receipt(shop = "Сакура Моторс", number = "Контракт, $number")

fun Spectr() = Receipt(shop = "Спектр", number = "")

fun VostokComplect() = Receipt(shop = "Восток-Комплект", number = "Контракт")

fun OffHand() = Receipt(shop = "Физ.лицо", number = "")
