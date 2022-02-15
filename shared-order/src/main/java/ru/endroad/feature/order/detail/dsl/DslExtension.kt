package ru.endroad.feature.order.detail.dsl

import ru.endroad.feature.order.detail.entity.Order
import ru.endroad.feature.order.detail.entity.Service
import ru.endroad.shared.autopart.base.Manufacturer
import ru.endroad.shared.autopart.base.PartNumber

//region PartNumbers Extension
fun NGK(number: String): PartNumber =
	PartNumber(Manufacturer("NGK"), number)

fun Mobil(number: String): PartNumber =
	PartNumber(Manufacturer("Mobil"), number)

fun Reinz(number: String): PartNumber =
	PartNumber(Manufacturer("Reinz"), number)

fun MannFilter(number: String): PartNumber =
	PartNumber(Manufacturer("MannFilter"), number)

fun Bosch(number: String): PartNumber =
	PartNumber(Manufacturer("Bosch"), number)

fun Kangaroo(number: String): PartNumber =
	PartNumber(Manufacturer("Kangaroo"), number)

fun Honda(number: String): PartNumber =
	PartNumber(Manufacturer("Honda"), number)

fun LynxAuto(number: String): PartNumber =
	PartNumber(Manufacturer("LynxAuto"), number)

fun Shell(number: String): PartNumber =
	PartNumber(Manufacturer("Shell Helix"), number)

fun Vic(number: String): PartNumber =
	PartNumber(Manufacturer("VIC"), number)

fun Febest(number: String): PartNumber =
	PartNumber(Manufacturer("Febest"), number)

fun KYB(number: String): PartNumber =
	PartNumber(Manufacturer("KYB"), number)

fun NSK(number: String): PartNumber =
	PartNumber(Manufacturer("NSK"), number)

fun CTR(number: String): PartNumber =
	PartNumber(Manufacturer("CTR"), number)

fun Gbrake(number: String): PartNumber =
	PartNumber(Manufacturer("G-brake"), number)

fun Nisshinbo(number: String): PartNumber =
	PartNumber(Manufacturer("Nisshinbo"), number)

fun Nissin(number: String): PartNumber =
	PartNumber(Manufacturer("Nissin"), number)

fun NTN(number: String): PartNumber =
	PartNumber(Manufacturer("NTN"), number)

fun Five(number: String): PartNumber =
	PartNumber(Manufacturer("NTN"), number)
//endregion

//region Date Extension
infix fun Int.January(year: Int) = Service.Date(this, 0, year)
infix fun Int.February(year: Int) = Service.Date(this, 1, year)
infix fun Int.March(year: Int) = Service.Date(this, 2, year)
infix fun Int.April(year: Int) = Service.Date(this, 3, year)
infix fun Int.May(year: Int) = Service.Date(this, 4, year)
infix fun Int.June(year: Int) = Service.Date(this, 5, year)
infix fun Int.July(year: Int) = Service.Date(this, 6, year)
infix fun Int.August(year: Int) = Service.Date(this, 7, year)
infix fun Int.September(year: Int) = Service.Date(this, 8, year)
infix fun Int.October(year: Int) = Service.Date(this, 9, year)
infix fun Int.November(year: Int) = Service.Date(this, 10, year)
infix fun Int.December(year: Int) = Service.Date(this, 11, year)
//endregion

val Int.km get() = Service.Mileage(this)
val Int.RUB get() = Order.Cost(this)
