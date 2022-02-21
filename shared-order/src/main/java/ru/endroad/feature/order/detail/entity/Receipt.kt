package ru.endroad.feature.order.detail.entity

data class Receipt internal constructor(val shop: String, val number: String)

fun Undefined() = Receipt(shop = "Неизвестно", "Данные из сервисной книжки")

fun AutoAtlant() = Receipt("AutoAtlant", "")

fun AutoLegion() = Receipt(shop = "АвтоЛегион", number = "Контракт")

fun AutoMarket() = Receipt(shop = "АвтоМаркет", number = "Контракт")

fun AutoNahodka(number: String = "") = Receipt(shop = "АвтоНаходка", number = "Контракт, $number")

fun Carbonado() = Receipt("Carbonado", "")

fun Exist(number: String) = Receipt("Exist", number)

fun Hokkaido(number: String) = Receipt(shop = "Hokkaidokras", number = "Контракт, $number")

fun KrasTuning() = Receipt(shop = "KrasTuning", number = "")

fun Rulevoy() = Receipt(shop = "Рулевой [автомаркет]", number = "")

fun Sakura(number: String = "") = Receipt(shop = "Сакура Моторс", number = "Контракт, $number")

fun Spectr() = Receipt(shop = "Спектр", number = "")

fun VostokAuto25() = Receipt(shop = "Восток-Авто, Улан-Уде", number = "Контракт")

fun VostokComplect() = Receipt(shop = "Восток-Комплект", number = "Контракт")

fun OffHand() = Receipt(shop = "Физ.лицо", number = "")
