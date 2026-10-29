plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.dependency.analysis)
}

dependencyAnalysis {
    useTypesafeProjectAccessors(true)
    reporting {
        printBuildHealth(true)
    }
}
