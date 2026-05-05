rootProject.name = "dependency-analysis-gradle-plugin-playground"

pluginManagement {
    enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include(":interface")
include(":foo")
