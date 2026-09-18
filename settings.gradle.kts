rootProject.name = "dependency-analysis-gradle-plugin-playground"

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include(":bar")
