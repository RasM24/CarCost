package ru.endroad.feature.order.list

import ru.endroad.feature.order.detail.dsl.Bosch
import ru.endroad.feature.order.detail.dsl.Honda
import ru.endroad.feature.order.detail.dsl.January
import ru.endroad.feature.order.detail.dsl.Kangaroo
import ru.endroad.feature.order.detail.dsl.LynxAuto
import ru.endroad.feature.order.detail.dsl.MannFilter
import ru.endroad.feature.order.detail.dsl.Mobil
import ru.endroad.feature.order.detail.dsl.NGK
import ru.endroad.feature.order.detail.dsl.RUB
import ru.endroad.feature.order.detail.dsl.Reinz
import ru.endroad.feature.order.detail.dsl.ServiceBookDsl
import ru.endroad.feature.order.detail.dsl.km
import ru.endroad.feature.order.detail.entity.Autoatlant
import ru.endroad.feature.order.detail.entity.Denderov
import ru.endroad.feature.order.detail.entity.Exist
import ru.endroad.shared.autopart.base.Part

private val technicalFluidsHydraulicOil = Part("Гидравлическое PSF")
private val cleannessProfoam4000 = Part("Profoam4000", Kangaroo(""))
private val stepwgnFilterCabin = Part("Фильтр салонный", LynxAuto("LAC-1944C"))
private val stepwgnGasketVtecValve = Part("Фильтр клапана VTEC", Honda("15815-RAA-A02"))

private val stepwgnGasketValveCoverKit = Part("Прокладка клапанной крышки", Reinz("15-53806-01"))    //oem "12030-PNC-000"
private val stepwgnIgnitionSparkPlug = Part("Свеча зажигания x4", NGK("ZFR6K-11"))                    //oem
private val stepwgnFilterOil = Part("Фильтр масляный двигателя", MannFilter("W 610/3"))            //oem "15400-PLC-003"
private val stepwgnFilterAir = Part("Фильтр воздушный", MannFilter("C 1430"))                        //oem "17220-PNA-003"
private val stepwgnSensorOilPressure = Part("Датчик давления масла", Bosch("0 986 345 009"))        //oem "37240-PT0-023"
private val technicalFluidsMobil1 = Part("Моторное масло", Mobil("0w-30"))

internal val stepwgnServiceBook = ServiceBookDsl {
	service(mileage = 351400.km, date = 25 January 2021, workPay = Denderov(2000.RUB)) {
		Exist("К3-0002934") part stepwgnGasketValveCoverKit boughtFor 1_714.RUB
		Exist("К3-0002934") part stepwgnIgnitionSparkPlug boughtFor 1_316.RUB
		Exist("К3-0002934") part stepwgnFilterOil boughtFor 437.RUB
		Exist("К3-0002934") part stepwgnFilterAir boughtFor 755.RUB
		Exist("К3-0010855") part stepwgnSensorOilPressure boughtFor 572.RUB
		Autoatlant() part technicalFluidsMobil1 boughtFor 3_706.RUB
	}

	purchase {
		Autoatlant() part technicalFluidsHydraulicOil boughtFor 601.RUB
		Autoatlant() part cleannessProfoam4000 boughtFor 496.RUB
		Exist("К3 0002934") part stepwgnFilterCabin boughtFor 857.RUB
		Exist("К3 0002934") part stepwgnGasketVtecValve boughtFor 674.RUB
	}
}
