plugins {
    conventions.`module-compose-app`
}

android {
    namespace = "ru.ccf"

    buildFeatures {
        buildConfig = true
    }
}

dependencies {

    // ==== Core layer ====

    // DI
    implementation(project(":android:core:di:impl"))

    // ==== Common layer ====

    implementation(project(":android:common:designSystem"))

    // ==== Feature layer ====

    // Navigation
    implementation(project(":android:feature:navigation:impl"))

    implementation(project(":android:feature:authorization:api"))
    implementation(project(":android:feature:authorization:impl"))

    implementation(project(":android:feature:registration:api"))
    implementation(project(":android:feature:registration:impl"))
}