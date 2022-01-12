package ru.endroad.shared.autopart.dsl

import ru.endroad.shared.autopart.base.Manufacturer
import ru.endroad.shared.autopart.base.PartNumber

fun PartsContext.technicalFluids(postfix: String = "", builder: GroupContext.() -> Unit) = group("Технические жидкости $postfix", builder)
fun PartsContext.accessories(postfix: String = "", builder: GroupContext.() -> Unit) = group("Аксессуары $postfix", builder)
fun PartsContext.frontBrakes(postfix: String = "", builder: GroupContext.() -> Unit) = group("Передние тормоза $postfix", builder)
fun PartsContext.rearBrakes(postfix: String = "", builder: GroupContext.() -> Unit) = group("Задние тормоза $postfix", builder)
fun PartsContext.frontSuspension(postfix: String = "", builder: GroupContext.() -> Unit) = group("Передняя подвеска $postfix", builder)
fun PartsContext.rearSuspension(postfix: String = "", builder: GroupContext.() -> Unit) = group("Задняя подвеска $postfix", builder)

fun GroupContext.NGK(number: String): PartNumber =
	PartNumber(Manufacturer("NGK"), number)

fun GroupContext.MOBIL(number: String): PartNumber =
	PartNumber(Manufacturer("Mobil"), number)

fun GroupContext.HONDA(number: String): PartNumber =
	PartNumber(Manufacturer("Honda"), number)
