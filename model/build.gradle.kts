plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.dependency.analysis)
}

kotlin {
    jvm()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain {
            dependencies {
                api(projects.account.model)
                api(libs.kotlinx.datetime)
            }
        }
    }
}
