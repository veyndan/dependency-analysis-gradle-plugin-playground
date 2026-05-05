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
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
            implementation(libs.androidx.compose.runtime)
        }
    }
}
