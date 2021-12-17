package ru.endroad.component.navigation

class ScreenStack<S> {

	private var stack: MutableList<S> = mutableListOf()

	fun push(screen: S) {
		stack.add(screen)
	}

	fun pop(): S? =
		stack
			.run {
				if (isEmpty()) {
					null
				} else {
					removeAt(lastIndex)
					if (isEmpty()) {
						null
					} else
						last()
				}
			}
}
