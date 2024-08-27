import ru.ccf.consts.CompileVersions
import ru.ccf.consts.Dependencies

/**
 * Convension for extending [conventions.base-impl] to provide Compose's function
 *
 * @author Egor Danilov
 * @since 17.02.2024
 */
plugins {
    id("conventions.base-impl")
}

android {
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = CompileVersions.COMPOSE_COMPILE_VERSION
    }
}

dependencies {

    implementation(platform(Dependencies.Compose.COMPOSE_BOM))
    implementation(Dependencies.Compose.Core.UI)
    Dependencies.Compose.Navigation.allNavigationDeps.forEach { implementation(it) }

    // Core
    // DI
    api(project(":android:core:di:api"))
}
