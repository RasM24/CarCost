package ru.endroad.feature.order.list

import ru.endroad.feature.order.detail.dsl.April
import ru.endroad.feature.order.detail.dsl.Bosch
import ru.endroad.feature.order.detail.dsl.December
import ru.endroad.feature.order.detail.dsl.Honda
import ru.endroad.feature.order.detail.dsl.June
import ru.endroad.feature.order.detail.dsl.Kangaroo
import ru.endroad.feature.order.detail.dsl.LynxAuto
import ru.endroad.feature.order.detail.dsl.MannFilter
import ru.endroad.feature.order.detail.dsl.May
import ru.endroad.feature.order.detail.dsl.Mobil
import ru.endroad.feature.order.detail.dsl.NGK
import ru.endroad.feature.order.detail.dsl.November
import ru.endroad.feature.order.detail.dsl.October
import ru.endroad.feature.order.detail.dsl.RUB
import ru.endroad.feature.order.detail.dsl.Reinz
import ru.endroad.feature.order.detail.dsl.September
import ru.endroad.feature.order.detail.dsl.ServiceBookDsl
import ru.endroad.feature.order.detail.dsl.Shell
import ru.endroad.feature.order.detail.dsl.Vic
import ru.endroad.feature.order.detail.dsl.km
import ru.endroad.feature.order.detail.entity.Autoatlant
import ru.endroad.feature.order.detail.entity.Denderov
import ru.endroad.feature.order.detail.entity.Exist
import ru.endroad.feature.order.detail.entity.Hokkaido
import ru.endroad.feature.order.detail.entity.Kornet
import ru.endroad.feature.order.detail.entity.Standart
import ru.endroad.feature.order.detail.entity.Undefined
import ru.endroad.shared.autopart.base.Part

object HardcoreDataStepwgn {

	private val hydraulicOil = Part("Жидкость ГУР, PSF")
	private val profoam4000 = Part("Profoam4000", Kangaroo(""))
	private val filterCabin = Part("Фильтр салонный", LynxAuto("LAC-1944C"))
	private val gasketVtecValve = Part("Фильтр клапана VTEC", Honda("15815-RAA-A02"))
	private val atfDPSF = Part("ATF DPSF (Дифференциал)")
	private val atfZ1 = Part("ATF Z1 (АКПП)")
	private val seatFront = Part("Поворотные сидения [Front]")

	private val gasketValveCoverKit = Part("Прокладка клапанной крышки", Reinz("15-53806-01"))    //oem "12030-PNC-000"
	private val ignitionSparkPlug = Part("Свеча зажигания x4", NGK("ZFR6K-11"))                    //oem
	private val filterOil = Part("Фильтр масляный двигателя", MannFilter("W 610/3"))            //oem "15400-PLC-003"
	private val filterAir = Part("Фильтр воздушный", MannFilter("C 1430"))                        //oem "17220-PNA-003"
	private val sensorOilPressure = Part("Датчик давления масла", Bosch("0 986 345 009"))        //oem "37240-PT0-023"
	private val mobil0w30 = Part("Моторное масло", Mobil("Eco 0w-30"))

	private val filterOilVic = Part("Фильтр масляный двигателя", Vic("C-809"))
	private val shell0w40 = Part("Моторное масло", Shell("Ultra 0w40"))
	private val shell5w40 = Part("Моторное масло", Shell("Ultra 5w40"))

	internal val serviceBook = ServiceBookDsl {
		purchase {
			Autoatlant() part hydraulicOil boughtFor 601.RUB
			Autoatlant() part profoam4000 boughtFor 496.RUB
			Exist("К3 0002934") part filterCabin boughtFor 857.RUB
			Exist("К3 0002934") part gasketVtecValve boughtFor 674.RUB
			Hokkaido("Drom: 149-413-20") part seatFront boughtFor 24000.RUB
		}

		service(mileage = 351400.km, date = 25 December 2021, workPay = Denderov(2000.RUB)) {
			Exist("К3-0002934") part gasketValveCoverKit boughtFor 1_714.RUB
			Exist("К3-0002934") part ignitionSparkPlug boughtFor 1_316.RUB
			Exist("К3-0002934") part filterOil boughtFor 437.RUB
			Exist("К3-0002934") part filterAir boughtFor 755.RUB
			Exist("К3-0010855") part sensorOilPressure boughtFor 572.RUB
			Autoatlant() part mobil0w30 boughtFor 3_706.RUB
		}

		//region Сервисная книжка прошлого владельца
		service(mileage = 313000.km, date = 27 September 2019, workPay = Kornet()) {
			Undefined() part shell5w40 boughtFor 0.RUB
			Undefined() part filterOilVic boughtFor 0.RUB
		}

		service(mileage = 300900.km, date = 1 November 2018, workPay = Kornet()) {
			Undefined() part shell5w40 boughtFor 0.RUB
			Undefined() part filterOilVic boughtFor 0.RUB
		}

		service(mileage = 292500.km, date = 2 April 2018, workPay = Kornet()) {
			Undefined() part atfZ1 boughtFor 0.RUB
		}

		service(mileage = 290500.km, date = 13 November 2017, workPay = Kornet()) {
			Undefined() part shell5w40 boughtFor 0.RUB
			Undefined() part filterOilVic boughtFor 0.RUB
		}

		service(mileage = 273000.km, date = 21 October 2015, workPay = Kornet()) {
			Undefined() part shell5w40 boughtFor 0.RUB
			Undefined() part filterOilVic boughtFor 0.RUB
		}

		service(mileage = 197000.km, date = 30 November 2010, workPay = Kornet()) {
			Undefined() part shell0w40 boughtFor 0.RUB
			Undefined() part filterOilVic boughtFor 0.RUB
		}

		service(mileage = 185770.km, date = 4 May 2010, workPay = Standart()) {
			Undefined() part shell0w40 boughtFor 0.RUB
			Undefined() part filterOilVic boughtFor 0.RUB
		}

		service(mileage = 175700.km, date = 29 October 2009, workPay = Standart()) {
			Undefined() part shell0w40 boughtFor 0.RUB
			Undefined() part filterOilVic boughtFor 0.RUB
		}

		service(mileage = 166100.km, date = 25 May 2009, workPay = Standart()) {
			Undefined() part shell5w40 boughtFor 0.RUB
			Undefined() part filterOilVic boughtFor 0.RUB
			Undefined() part atfDPSF boughtFor 0.RUB
		}

		service(mileage = 156150.km, date = 1 December 2008, workPay = Standart()) {
			Undefined() part shell0w40 boughtFor 0.RUB
			Undefined() part filterOilVic boughtFor 0.RUB
		}

		service(mileage = 146610.km, date = 28 June 2008, workPay = Standart()) {
			Undefined() part shell5w40 boughtFor 0.RUB
			Undefined() part filterOilVic boughtFor 0.RUB
			Undefined() part hydraulicOil boughtFor 0.RUB
		}
		//endregion
	}
}
