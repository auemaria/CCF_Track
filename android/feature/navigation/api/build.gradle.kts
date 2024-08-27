plugins {
    conventions.`module-compose-impl`
}

android {
    namespace = "ru.ccf.feature.navigation.impl"
}

dependencies {
    implementation(project(":android:common:designSystem"))
}