package ru.endroad.feature.hub.ui

sealed class SelectionHubAction {
	object CivicCatalogClicked : SelectionHubAction()
	object StepwgnCatalogClicked : SelectionHubAction()
	object CivicServiceBookClicked : SelectionHubAction()
	object StepwgnServiceBookClicked : SelectionHubAction()
}
