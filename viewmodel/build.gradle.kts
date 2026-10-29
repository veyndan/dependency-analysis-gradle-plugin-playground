plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.dependency.analysis)
}

kotlin {
    jvm()

    sourceSets {
        commonMain {
            dependencies {
                api(projects.model)
            }
        }
    }
}
