plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.dependency.analysis)
}

kotlin {
    jvm()
    iosArm64()
    iosSimulatorArm64()
}
