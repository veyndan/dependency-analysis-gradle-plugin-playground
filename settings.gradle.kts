rootProject.name = "dependency-analysis-gradle-plugin-playground"

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
    }
}

include("model")
include("viewmodel")
