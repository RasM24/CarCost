package ru.endroad.carcost.application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.endroad.carcost.navigation.ScreenDestination.CATALOG_CIVIC_DESTINATION
import ru.endroad.carcost.navigation.ScreenDestination.CATALOG_STEPWGN_DESTINATION
import ru.endroad.carcost.navigation.ScreenDestination.SELECTION_HUB_DESTINATION
import ru.endroad.carcost.navigation.ScreenDestination.SERVICE_CIVIC_DESTINATION
import ru.endroad.carcost.navigation.ScreenDestination.SERVICE_STEPWGN_DESTINATION
import ru.endroad.feature.catalog.ui.CivicCatalogComposable
import ru.endroad.feature.catalog.ui.StepwgnCatalogComposable
import ru.endroad.feature.hub.ui.SelectionHubAction
import ru.endroad.feature.hub.ui.SelectionHubComposable
import ru.endroad.feature.order.list.CivicServiceComposable
import ru.endroad.feature.order.list.StepwgnServiceComposable
import ru.endroad.library.compose.theme.ApplicationTheme

class MainActivity : ComponentActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			ApplicationTheme {
				val navController = rememberNavController()
				NavHost(navController = navController, startDestination = SELECTION_HUB_DESTINATION) {
					composable(SELECTION_HUB_DESTINATION) { SelectionHubComposable(onAction = { handleAction(it, navController) }) }
					composable(CATALOG_STEPWGN_DESTINATION) { StepwgnCatalogComposable(onBackClicked = navController::popBackStack) }
					composable(CATALOG_CIVIC_DESTINATION) { CivicCatalogComposable(onBackClicked = navController::popBackStack) }
					composable(SERVICE_STEPWGN_DESTINATION) { StepwgnServiceComposable(onBackClicked = navController::popBackStack) }
					composable(SERVICE_CIVIC_DESTINATION) { CivicServiceComposable(onBackClicked = navController::popBackStack) }
				}
			}
		}
	}

	private fun handleAction(action: SelectionHubAction, navController: NavController) {
		when (action) {
			SelectionHubAction.CivicCatalogClicked       -> navController.navigate(CATALOG_CIVIC_DESTINATION)
			SelectionHubAction.CivicServiceBookClicked   -> navController.navigate(SERVICE_CIVIC_DESTINATION)
			SelectionHubAction.StepwgnCatalogClicked     -> navController.navigate(CATALOG_STEPWGN_DESTINATION)
			SelectionHubAction.StepwgnServiceBookClicked -> navController.navigate(SERVICE_STEPWGN_DESTINATION)
		}
	}
}
