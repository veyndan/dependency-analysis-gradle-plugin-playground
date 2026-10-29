plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.dependency.analysis)
}

dependencyAnalysis {
    reporting {
        printBuildHealth(true)
    }
}

kotlin {
    jvm()

    sourceSets {
        commonMain {
            dependencies {
                api(project(":model"))
            }
        }
    }
}
