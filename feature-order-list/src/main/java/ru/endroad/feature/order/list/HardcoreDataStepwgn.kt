package ru.endroad.feature.order.list

import ru.endroad.feature.order.detail.dsl.April
import ru.endroad.feature.order.detail.dsl.Bosch
import ru.endroad.feature.order.detail.dsl.CTR
import ru.endroad.feature.order.detail.dsl.December
import ru.endroad.feature.order.detail.dsl.Febest
import ru.endroad.feature.order.detail.dsl.February
import ru.endroad.feature.order.detail.dsl.Five
import ru.endroad.feature.order.detail.dsl.Gbrake
import ru.endroad.feature.order.detail.dsl.Honda
import ru.endroad.feature.order.detail.dsl.January
import ru.endroad.feature.order.detail.dsl.June
import ru.endroad.feature.order.detail.dsl.KYB
import ru.endroad.feature.order.detail.dsl.Kangaroo
import ru.endroad.feature.order.detail.dsl.LynxAuto
import ru.endroad.feature.order.detail.dsl.MannFilter
import ru.endroad.feature.order.detail.dsl.May
import ru.endroad.feature.order.detail.dsl.Mobil
import ru.endroad.feature.order.detail.dsl.NGK
import ru.endroad.feature.order.detail.dsl.NSK
import ru.endroad.feature.order.detail.dsl.NTN
import ru.endroad.feature.order.detail.dsl.Nisshinbo
import ru.endroad.feature.order.detail.dsl.Nissin
import ru.endroad.feature.order.detail.dsl.November
import ru.endroad.feature.order.detail.dsl.October
import ru.endroad.feature.order.detail.dsl.RUB
import ru.endroad.feature.order.detail.dsl.Reinz
import ru.endroad.feature.order.detail.dsl.September
import ru.endroad.feature.order.detail.dsl.ServiceBookDsl
import ru.endroad.feature.order.detail.dsl.Shell
import ru.endroad.feature.order.detail.dsl.Vic
import ru.endroad.feature.order.detail.dsl.km
import ru.endroad.feature.order.detail.entity.AutoAtlant
import ru.endroad.feature.order.detail.entity.AutoLegion
import ru.endroad.feature.order.detail.entity.AutoMarket
import ru.endroad.feature.order.detail.entity.AutoNahodka
import ru.endroad.feature.order.detail.entity.Carbonado
import ru.endroad.feature.order.detail.entity.Denderov
import ru.endroad.feature.order.detail.entity.Exist
import ru.endroad.feature.order.detail.entity.Hokkaido
import ru.endroad.feature.order.detail.entity.Kornet
import ru.endroad.feature.order.detail.entity.KrasTuning
import ru.endroad.feature.order.detail.entity.OffHand
import ru.endroad.feature.order.detail.entity.Rulevoy
import ru.endroad.feature.order.detail.entity.Sakura
import ru.endroad.feature.order.detail.entity.Spectr
import ru.endroad.feature.order.detail.entity.Standart
import ru.endroad.feature.order.detail.entity.Undefined
import ru.endroad.feature.order.detail.entity.VostokAuto25
import ru.endroad.feature.order.detail.entity.VostokComplect
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

	private val tractionTransverseRear = Part("Тяга поперечная [Rear] х2", Febest("0325-RA3"))
	private val bushRearLowerArm = Part("Сайлентблок нижнего поперечного рычага [Rear] х2", Febest("HAB-037"))
	private val bushLateralControlArm = Part("Сайлентблок продольного рычага [Rear] x2", Febest("HAB-028"))
	private val bushRearShockAbsorber = Part("Сайлентблок цапфы [Rear] x2", Febest("HAB-029"))
	private val bushRearUpperArm = Part("Сайлентблок верхнего поперечного рычага [Rear] х2", Febest("HAB-143"))
	private val tieRod = Part("Тяга рулевая [Front] х2", Five("SRH-210"))
	private val bushFrontLowerArm1 = Part("Сайлентблок нижнего рычага [Front] x2", CTR("GV0234"))
	private val ballBearing = Part("Опора шаровая [Rear] х2", Febest("0320-ODR"))
	private val tieRodEnd = Part("Наконечник рулевой тяги [Front] х2", Honda("53540-SWA-A01"))
	private val stabilizerLink = Part("Стойка стабилизатора [Front] х2", KYB("KSLF1100"))
	private val stabilizerBush = Part("Втулка стабилизатора [Front] х2", LynxAuto("B8138"))
	private val bushFrontLowerArm2 = Part("Сайлентблок нижнего рычага (большой) [Front] х2", LynxAuto("C8293"))
	private val caliperRepairKitRear = Part("Ремкомплект суппорта [Rear]", Gbrake("GK-024"))
	private val caliperRepairKitFront = Part("Ремкомплект суппорта [Front]", Gbrake("GK-067"))
	private val brakeDiskRear = Part("Диск тормозной [Rear] х2", Nisshinbo("ND8008K"))
	private val brakeDiskFront = Part("Диск тормозной вентилируемый [Front] х2", Nisshinbo("ND8024K"))
	private val brakePadFront = Part("Колодки тормозные дисковые [Front]", Nissin("NPO-105W-SA"))
	private val brakePadRear = Part("Колодки тормозные дисковые [Rear]", Nissin("NPO-110W-SB"))
	private val hubBearingRear = Part("Подшипник ступичный [Rear] х2", NSK("ZA-38BWD10BCA41**"))
	private val hubBearingFront = Part("Подшипник ступичный [Front] х2", NTN("GB.35281"))
	private val hubRearLeft = Part("Ступица сборе [Left]", Honda("Contract"))   //ступица левая 4_200.RUB
	private val antherRearLeft = Part("Пыльник привода [Rear][Left]", Honda("Contract"))   //пыльник 300.RUB
	private val rearSprings = Part("Пружины [Rear] x2", Honda("Contract"))   //пружины   1_600.RUB
	private val wiperBlade = Part("Дворники [Front]", LynxAuto(""))   //дворники 800.RUB
	private val rearUpperArm = Part("Верхний рычаг х2", Honda("Contract"))   //верхний рычаг 2_000.RUB

	internal val serviceBook = ServiceBookDsl {
		purchase {
			Rulevoy() part "Масло АКПП, Honda ATF Z1".Honda boughtFor 5_500.RUB //TODO глянуть точную цену
			Rulevoy() part "DPSF".Honda boughtFor 2_000.RUB //TODO  глянуть точную цену
			Rulevoy() part "Фильтр АКПП, проточный".Undefined boughtFor 1_465.RUB
			KrasTuning() part "Пламегаситель".Undefined boughtFor 2_100.RUB
			KrasTuning() part "МиниКатализатор (обманка)".Undefined boughtFor 900.RUB
			Exist("К3 0002934") part filterCabin boughtFor 857.RUB
			AutoAtlant() part hydraulicOil boughtFor 601.RUB
		}

		zip {
			Exist("К3-0011656") part bushLateralControlArm boughtFor 1_380.RUB
			Exist("К3-0011656") part bushRearShockAbsorber boughtFor 636.RUB
			Exist("К3-0011656") part bushRearUpperArm boughtFor 590.RUB
			Exist("К3-0011606") part caliperRepairKitRear boughtFor 744.RUB
			Exist("К3-0011656") part hubBearingRear boughtFor 4_080.RUB
			Exist("К3-0011606") part caliperRepairKitFront boughtFor 744.RUB
			Exist("К3-0011606") part hubBearingFront boughtFor 3_774.RUB
			Exist("К3-0011656") part ballBearing boughtFor 1_748.RUB
			Exist("К3-0011656") part tieRodEnd boughtFor 2_844.RUB
			Exist("К3-0011656") part tieRod boughtFor 2_432.RUB
			Exist("К3-0011656") part stabilizerLink boughtFor 1_214.RUB
			Exist("К3 0002934") part gasketVtecValve boughtFor 674.RUB
		}

		service(mileage = 35428.km, date = 20 February 2022, workPay = Denderov(5000.RUB)) {
			Exist("К3-0011606") part brakeDiskFront boughtFor 5_668.RUB
			Exist("К3-0011606") part brakePadFront boughtFor 3_876.RUB
			Exist("К3-0011656") part stabilizerBush boughtFor 544.RUB
			Exist("К3-0011656") part bushFrontLowerArm1 boughtFor 812.RUB
			Exist("К3-0011656") part bushFrontLowerArm2 boughtFor 946.RUB
			Carbonado() part "Болты колесные".Undefined boughtFor 1300.RUB
			VostokComplect() part "Нижние рычаги [Front]".Honda boughtFor 3600.RUB
			AutoMarket() part "Стойки передние в сборе".Honda boughtFor 4600.RUB
			OffHand() part "Прокачка стоек".Undefined boughtFor 400.RUB
			Spectr() part "Пыльники + отбойники на стойки".Lynx boughtFor 900.RUB
		}

		service(mileage = 354184.km, date = 13 February 2022, workPay = Denderov(6000.RUB)) {
			Exist("К3-0011606") part brakeDiskRear boughtFor 4_558.RUB
			Exist("К3-0011606") part brakePadRear boughtFor 2_332.RUB
			Exist("К3-0011693") part bushRearLowerArm boughtFor 1_024.RUB
			Exist("К3-0011693") part tractionTransverseRear boughtFor 3_084.RUB
			Sakura() part hubRearLeft boughtFor 4_200.RUB
			AutoNahodka() part rearSprings boughtFor 1_600.RUB
			AutoNahodka() part rearUpperArm boughtFor 2_000.RUB
			OffHand() part antherRearLeft boughtFor 300.RUB
		}

		service(mileage = 354184.km, date = 12 February 2022) {
			AutoLegion() part wiperBlade boughtFor 1_200.RUB
			VostokAuto25() part "Сидения, 2 и 3 ряд".Honda boughtFor 13_700.RUB
		}

		service(mileage = 353367.km, date = 26 January 2022) {
			Hokkaido("Drom: 149-413-20") part seatFront boughtFor 24000.RUB
			AutoAtlant() part profoam4000 boughtFor 496.RUB
		}

		service(mileage = 351400.km, date = 25 December 2021, workPay = Denderov(2000.RUB)) {
			Exist("К3-0002934") part gasketValveCoverKit boughtFor 1_714.RUB
			Exist("К3-0002934") part ignitionSparkPlug boughtFor 1_316.RUB
			Exist("К3-0002934") part filterOil boughtFor 437.RUB
			Exist("К3-0002934") part filterAir boughtFor 755.RUB
			Exist("К3-0010855") part sensorOilPressure boughtFor 572.RUB
			AutoAtlant() part mobil0w30 boughtFor 3_706.RUB
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
