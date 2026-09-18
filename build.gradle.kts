plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.dependency.analysis)
}

dependencyAnalysis {
    reporting {
        printBuildHealth(true)
    }
}

dependencies {
    implementation(project(":bar"))
}
