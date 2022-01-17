package ru.endroad.shared.autopart.base

data class Part(
	val name: String,
	val partNumber: PartNumber = undefined,
) {

	companion object {

		val undefined: PartNumber = PartNumber(Manufacturer("Undefined"), "")
	}

}
