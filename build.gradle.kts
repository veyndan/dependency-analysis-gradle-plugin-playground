plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.dependencyAnalysis)
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
                api(project(":bar"))
            }
        }
    }
}
