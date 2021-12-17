package ru.endroad.carcost.di

import org.koin.dsl.module
import ru.endroad.component.navigation.ComposeScreen
import ru.endroad.component.navigation.ScreenStack
import ru.endroad.component.navigation.StateHolder

val navigationModule = module {
	single { ScreenStack<ComposeScreen>() }
	single { StateHolder(get()) }
}
