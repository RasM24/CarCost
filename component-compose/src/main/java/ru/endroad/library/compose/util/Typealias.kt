package ru.endroad.library.compose.util

typealias UnitListener = (() -> Unit)
typealias ValueListener<T> = (T) -> Unit
typealias ContextListener<T> = T.() -> Unit
