import ru.ccf.consts.Dependencies

plugins {
    conventions.`base-impl`
}

android {
    namespace = "ru.ccf.core.di.impl"
}

dependencies {

    // Coroutines
    Dependencies.Coroutines.allDeps.forEach { implementation(it) }

    // Common libs
    // Dagger 2
    Dependencies.Dagger.implDeps.forEach { implementation(it) }
    Dependencies.Dagger.kaptDeps.forEach { kapt(it) }

    // Core layer
    // DI API
    api(project(":android:core:di:api"))
}
