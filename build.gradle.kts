plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.dependency.analysis)
}

dependencies {
    implementation(projects.foo)
}

dependencyAnalysis {
    useTypesafeProjectAccessors(true)
}
