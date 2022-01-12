package ru.endroad.shared.autopart.catalog

import ru.endroad.shared.autopart.base.PartGroup
import ru.endroad.shared.autopart.dsl.GroupContext
import ru.endroad.shared.autopart.dsl.HONDA
import ru.endroad.shared.autopart.dsl.accessories
import ru.endroad.shared.autopart.dsl.frontBrakes
import ru.endroad.shared.autopart.dsl.frontSuspension
import ru.endroad.shared.autopart.dsl.group
import ru.endroad.shared.autopart.dsl.part
import ru.endroad.shared.autopart.dsl.parts
import ru.endroad.shared.autopart.dsl.rearBrakes
import ru.endroad.shared.autopart.dsl.rearSuspension
import ru.endroad.shared.autopart.dsl.technicalFluids

object CivicCatalog {

	private fun GroupContext.OEM(number: String) = HONDA(number)

	val parts: List<PartGroup> =
		parts {
			technicalFluids {

			}

			accessories {
				part(name = "Дворник 500мм [Right]", OEM("76620-SH2-003"))
				part(name = "Дворник 450мм [Left]", OEM("76630-SF4-003"))
				part(name = "Дворник 375мм [Rear]", OEM("76630-SJ6-003"))
			}

			//https://honda.epcdata.ru/orthia/e-el2/24528/steering/1288/
			frontBrakes("[Orthia]") {
				part(name = "Тормозные колодки", OEM("45022-ST7-000"))
				part(name = "Тормозной диск", OEM("45251-SK7-J00"))
				part(name = "Ремкомплект суппорта", OEM("01463-ST7-000"))
				part(name = "Втулка суппорта [A]", OEM("45235-SR3-N31"))
				part(name = "Втулка суппорта [B]", OEM("45262-SR3-N31"))
				part("Подшипник ступицы", OEM("44300-S04-A01"))
			}

			//https://honda.epcdata.ru/integra/e-dc2/22074/steering/32721/
			rearBrakes("[DC2]") {
				part(name = "Тормозные колодки", OEM("43022-S04-020"))
				part(name = "Тормозной диск", OEM("42510-SR3-A11"))
				part(name = "Ремкомплект суппорта", OEM("01473-S04-000"))
				part(name = "Втулка суппорта [Нижняя]", OEM("43235-SD2-931"))
				part(name = "Втулка суппорта [Верхняя]", OEM("43262-SD2-931"))
				part(name = "Ступица колеса", OEM("42200-SR3-A53"))
			}

			//https://honda.epcdata.ru/civic/gf-ek9/26524/steering/553/
			//https://honda.epcdata.ru/civic/gf-ek9/26524/steering/554/
			frontSuspension("[EK9]") {
				part(name = "Втулка стабилизатора", OEM("51306-S04-N01"))
				part(name = "Держатель стабилизатора", OEM("51308-S10-010"))
				part(name = "Стойка стабилизатора", OEM("51320-S04-003"))
				part(name = "Шаровая опора [Нижняя]", OEM("51220-S04-003"))
				part(name = "Рычаг подвески [Верхний|Right]", OEM("51450-S04-023"))
				part(name = "Рычаг подвески [Верхний|Left]", OEM("51460-S04-023"))
			}

			//https://honda.epcdata.ru/civic/gf-ek9/26524/steering/556/
			rearSuspension("[EK9]") {
				part(name = "Держатель стабилизатора", OEM("52308-SS0-000"))
				part(name = "Втулка стабилизатора", OEM("52315-S03-Z01"))
				part(name = "Стойка стабилизатора [Right]", OEM("52320-S04-003"))
				part(name = "Стойка стабилизатора [Left]", OEM("52321-S04-003"))
				part(name = "Рычаг [Верхний|Right]", OEM("52390-SR3-000"))
				part(name = "Рычаг [Верхний|Left]", OEM("52400-SR3-000"))
			}

			//Двигатель (ГБЦ) https://honda.epcdata.ru/civic/e-eg4/23473/engine/
			group("Двигатель, общее") {
				part(name = "Прокладка колектора выпускного", OEM("18115-P00-004"))
				part(name = "Датчик кислородный", OEM("36531-P08-004"))
				part(name = "Ремень генератора", OEM("31110-P01-003"))
				part(name = "Фильтр масляный двигателя", OEM("15400-PR3-406"))
				part(name = "Наклейка сервисная", OEM("06142-P01-305"))
			}

			group("Зажигание") {
				part(name = "Крышка распределителя зажигания", OEM("30102-PT2-026"))
				part(name = "Бегунок трамблера", OEM("30103-P08-003"))
				part(name = "Кольцо уплотнительное распределителя зажигания", OEM("30110-PA1-732"))

				//TODO
				//98079-5514P	plug, spark (ZFR5J-11) (NGK)
				//98079-5515G	plug, spark (KJ16CR-L11) (DENSO)
				//98079-5614P	plug, spark (ZFR6J-11) (NGK)
				//98079-5615G	plug, spark (KJ20CR-L11) (DENSO)
				//98079-5714P	plug, spark (ZFR7J-11) (NGK)
				//98079-5715G	plug, spark (KJ22CR-L11) (DENSO)
			}
		}
}
