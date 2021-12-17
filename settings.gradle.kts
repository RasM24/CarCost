pluginManagement {
	repositories {
		google()
		mavenCentral()
	}

	resolutionStrategy {
		eachPlugin {
			val pluginId = requested.id.id

			when {
				pluginId.startsWith("org.jetbrains.kotlin") -> useVersion("1.5.21")
				pluginId.startsWith("com.android.")         -> useModule("com.android.tools.build:gradle:7.0.0")
			}
		}
	}
}

dependencyResolutionManagement {
	repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
	repositories {
		google()
		mavenCentral()
	}
}

rootProject.name = "CarCost"

includeBuild("gradle-convection")

include(":app")
include(":component-compose")
include(":component-navigation")
