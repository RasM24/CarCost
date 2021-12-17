package ru.endroad.component.navigation

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class StateHolder(
	initialState: ComposeScreen
) {

	private val singleStack = ScreenStack<ComposeScreen>()

	private val _applicationState: MutableStateFlow<ComposeScreen> = MutableStateFlow(initialState)
	val applicationState: StateFlow<ComposeScreen> = _applicationState

	fun openScreen(state: ComposeScreen) {
		singleStack.push(state)
		_applicationState.tryEmit(state)
	}

	fun back(): Boolean =
		singleStack.pop()
			?.also(_applicationState::tryEmit) != null

}
