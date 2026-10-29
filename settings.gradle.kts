rootProject.name = "dependency-analysis-gradle-plugin-playground"

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
    }

    enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
}

include("model")
include("viewmodel")
