pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                inclusettings.gradle.ktsdeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AutoClicker"
include(":app")
