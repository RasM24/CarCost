package ru.endroad.shared.autopart.catalog

import ru.endroad.shared.autopart.base.PartGroup
import ru.endroad.shared.autopart.dsl.GroupContext
import ru.endroad.shared.autopart.dsl.HONDA
import ru.endroad.shared.autopart.dsl.MOBIL
import ru.endroad.shared.autopart.dsl.NGK
import ru.endroad.shared.autopart.dsl.accessories
import ru.endroad.shared.autopart.dsl.frontBrakes
import ru.endroad.shared.autopart.dsl.frontSuspension
import ru.endroad.shared.autopart.dsl.group
import ru.endroad.shared.autopart.dsl.part
import ru.endroad.shared.autopart.dsl.parts
import ru.endroad.shared.autopart.dsl.rearBrakes
import ru.endroad.shared.autopart.dsl.technicalFluids

object StepwgnCatalog {

	private fun GroupContext.OEM(number: String) = HONDA(number)

	val parts: List<PartGroup> =
		parts {
			technicalFluids {
				part(name = "Масло Mobil1 0w-30", MOBIL("0w-30 Eco"))
				part(name = "Гидравлическое масло PSF", HONDA("PSF-Hydraulic"))
			}

			accessories {
				part(name = "Дворник 600мм", OEM("76620-S7S-003"))
				part(name = "Дворник 400мм", OEM("76630-S7S-003"))
				part(name = "Дворник 350мм", OEM("76730-S7S-J01"))
			}

			frontBrakes {
				part(name = "Подшипник ступичный", OEM("44300-S47-008"))
				part(name = "Тормозные колодки", OEM("45022-SX0-J02"))
				part(name = "Тормозной диск", OEM("45251-S7A-N10"))
				part(name = "Ремкомплект суппорта", OEM("01463-SV4-000"))
				part(name = "Втулка суппорта [A]", OEM("45235-S0K-A01"))
				part(name = "Втулка суппорта [B]", OEM("45262-S0K-A01"))
			}

			rearBrakes {
				part(name = "Ступица", OEM("42210-S7T-000 "))
				part(name = "Тормозные колодки", OEM("43022-S7S-010"))
				part(name = "Тормозной диск", OEM("42510-SZ3-900"))
				part(name = "Ремкомплект суппорта", OEM("01473-SP0-000 "))
				part(name = "Втулка суппорта [Верхняя]", OEM("43262-S84-A51"))
				part(name = "Втулка суппорта [Нижняя]", OEM("43235-S84-A51"))
			}

			group("Зажигание") {
				part(name = "Свеча зажигания", NGK("ZFR6K-11"))
				part(name = "Катушка зажигания", OEM("30520-PNC-004"))
			}

			group("Расходники") {
				part(name = "Фильтр салона", OEM("-"))
				part(name = "Фильтр воздушный", OEM("17220-PNA-003"))
				part(name = "Фильтр масляный двигателя", OEM("15400-PLC-003"))
				part(name = "Ксеноновая лампа", OEM("33116-S0A-J11"))
			}

			group("Двигатель, разное") {
				part(name = "Фильтр VTC", OEM("15845-PNA-003"))
				part(name = "Фильтр клапана VTEC", OEM("15815-RAA-A02"))
				part(name = "Комплект прокладок клапанной крышки", OEM("12030-PNC-000"))
				part(name = "Датчик давления масла", OEM("37240-PT0-023"))
				part(name = "Крышка бачка омывателя", OEM("38513-SB0-961"))
				part(name = "Болт для крепления бачка (утерянный)", OEM("93405-06016-08"))
				part(name = "Форсунки омывателя [A]", OEM("76815-S7S-961ZA"))
				part(name = "Форсунки омывателя [B]", OEM("76810-S7S-961ZA"))
				part(name = "Ремкомплект ГТЦ", OEM("01462-S84-A50"))
			}

			frontSuspension {
				part(name = "Стойка амортизационная [Right]", OEM("51605-S7T-J02"))
				part(name = "Стойка амортизационныя [Left]", OEM("51606-S7T-J02"))
				part(name = "Втулка стабилизатора", OEM("51306-S7S-003"))
				part(name = "Линка стабилизатора", OEM("51320-S7S-003"))
			}
		}
}
