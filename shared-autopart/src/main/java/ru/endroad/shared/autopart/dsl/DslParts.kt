package ru.endroad.shared.autopart.dsl

import ru.endroad.shared.autopart.base.Part
import ru.endroad.shared.autopart.base.PartGroup
import ru.endroad.shared.autopart.base.PartNumber

fun parts(builder: PartsContext.() -> Unit): List<PartGroup> =
	PartsContext()
		.apply(builder)
		.build()

class PartsContext {

	private val partGroups = mutableListOf<PartGroup>()

	fun addPartGroup(partGroup: PartGroup) {
		partGroups.add(partGroup)
	}

	fun build(): List<PartGroup> = partGroups
}

fun PartsContext.group(groupName: String, builder: GroupContext.() -> Unit) {
	GroupContext(groupName)
		.apply(builder)
		.build()
		.let(::addPartGroup)
}

class GroupContext(private val groupName: String) {

	private val parts = mutableListOf<Part>()

	fun addPart(part: Part) {
		parts.add(part)
	}

	fun build() = PartGroup(groupName.trim(), parts)
}

fun GroupContext.part(name: String, partNumber: PartNumber) {
	Part(name = name, partNumber = partNumber)
		.let(::addPart)
}
