package ru.ccf.consts

/**
 * [Dependencies] is designed to store all the dependencies that are needed in this project
 *
 * @author Egor Danilov
 * @since 17.02.2024
 */
object Dependencies {

    object AndroidCore {
        private const val APPCOMPAT_VERSION = "1.6.1"
        private const val CORE_VERSION = "1.12.0"

        private const val APPCOMPAT = "androidx.appcompat:appcompat:$APPCOMPAT_VERSION"
        private const val CORE = "androidx.core:core-ktx:$CORE_VERSION"

        val allDeps = listOf(APPCOMPAT, CORE)
    }

    object Coroutines {
        private const val CORE_VERSION = "1.8.0"
        private const val ANDROID_VERSION = "1.3.9"

        private const val CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$CORE_VERSION"
        private const val ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$ANDROID_VERSION"

        val allDeps = listOf(CORE, ANDROID)
    }

    object Compose {

        // ===========================================================================================
        // BE VERY CAREFUL WHEN UPDATING COMPOSE DEPENDENCIES, BECAUSE THEY CAN USE DIFFERENT VERSION!
        // ===========================================================================================

        const val COMPOSE_BOM = "androidx.compose:compose-bom:2024.02.00"

        object Core {
            private const val ACTIVITY_COMPOSE_VERSION = "1.8.2"

            private const val ACTIVITY_COMPOSE =
                "androidx.activity:activity-compose:$ACTIVITY_COMPOSE_VERSION"

            const val UI = "androidx.compose.ui:ui"
            private const val UI_UTILS = "androidx.compose.ui:ui-util"

            private const val UI_TOOLING = "androidx.compose.ui:ui-tooling" // debugImplementation
            private const val UI_TOOLING_DATA = "androidx.compose.ui:ui-tooling-data"
            private const val UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview"

            val allCoreDeps = listOf(
                ACTIVITY_COMPOSE, UI, UI_UTILS, UI_TOOLING, UI_TOOLING_DATA,
                UI_TOOLING_PREVIEW
            )
        }

        object Navigation {
            private const val VERSION = "2.7.7"

            private const val NAVIGATION_COMPOSE = "androidx.navigation:navigation-compose:$VERSION"

            val allNavigationDeps = listOf(NAVIGATION_COMPOSE)
        }

        object Foundation {
            private const val COMPOSE_FOUNDATION = "androidx.compose.foundation:foundation"
            private const val COMPOSE_FOUNDATION_LAYOUT = "androidx.compose.foundation:foundation-layout"

            val allFoundationDeps = listOf(COMPOSE_FOUNDATION, COMPOSE_FOUNDATION_LAYOUT)
        }

        object Material {
            private const val MATERIAL = "androidx.compose.material3:material3"
            private const val MATERIAL_ICONS = "androidx.compose.material:material-icons-extended"

            val allMaterialDeps = listOf(MATERIAL, MATERIAL_ICONS)
        }

        object Lifecycle {
            private const val LIFECYCLE_VERSION = "2.7.0"

            private const val RUNTIME = "androidx.lifecycle:lifecycle-runtime-ktx:$LIFECYCLE_VERSION"
            private const val RUNTIME_COMPOSE =
                "androidx.lifecycle:lifecycle-runtime-compose:$LIFECYCLE_VERSION"
            private const val VIEW_MODEL =
                "androidx.lifecycle:lifecycle-viewmodel-compose:$LIFECYCLE_VERSION"
            private const val VIEW_MODEL_SAVED_STATE =
                "androidx.lifecycle:lifecycle-viewmodel-savedstate:$LIFECYCLE_VERSION"

            val allLifecycleDeps = listOf(
                RUNTIME, VIEW_MODEL, RUNTIME_COMPOSE,
                VIEW_MODEL_SAVED_STATE
            )
        }

        object Coil {
            private const val VERSION = "2.5.0"

            private const val COIL_COMPOSE = "io.coil-kt:coil-compose:$VERSION"

            val allCoilDeps = listOf(COIL_COMPOSE)
        }

        val allDeps = Core.allCoreDeps + Navigation.allNavigationDeps +
            Foundation.allFoundationDeps + Material.allMaterialDeps +
            Lifecycle.allLifecycleDeps + Coil.allCoilDeps
    }

    object Redux {
        private const val VERSION = "0.5.5"

        private const val MULTIPLATFORM = "org.reduxkotlin:redux-kotlin-threadsafe:$VERSION"

        val allDeps = listOf(MULTIPLATFORM)
    }

    object Dagger {
        private const val VERSION = "2.50"

        private const val DAGGER = "com.google.dagger:dagger:$VERSION"
        private const val ANDROID = "com.google.dagger:dagger-android:$VERSION"

        private const val COMPILER = "com.google.dagger:dagger-compiler:$VERSION"
        private const val PROCESSOR = "com.google.dagger:dagger-android-processor:$VERSION"

        val implDeps = listOf(DAGGER, ANDROID)
        val kaptDeps = listOf(COMPILER, PROCESSOR)
    }

    object Logger {
        private const val TIMBER_VERSION = "5.0.1"

        private const val TIMBER = "com.jakewharton.timber:timber:$TIMBER_VERSION"

        val allDeps = listOf(TIMBER)
    }

    object Network {
        private const val MOSHI_KOTLIN_VERSION = "1.15.0"
        private const val OKHTTP_VERSION = "4.12.0"

        private const val MOSHI_KOTLIN = "com.squareup.moshi:moshi-kotlin:$MOSHI_KOTLIN_VERSION"

        private const val OKHTTP = "com.squareup.okhttp3:okhttp:$OKHTTP_VERSION"
        private const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:$OKHTTP_VERSION"

        private const val MOSHI_CODEGEN = "com.squareup.moshi:moshi-kotlin-codegen:$MOSHI_KOTLIN_VERSION"

        val allDeps = listOf(MOSHI_KOTLIN, OKHTTP, LOGGING_INTERCEPTOR)
        val allKaptDeps = listOf(MOSHI_CODEGEN)
    }

    object UI {
        private const val MATERIAL_VERSION = "1.9.0"
        private const val SPLASH_SCREEN_VERSION = "1.0.0"

        private const val MATERIAL = "com.google.android.material:material:$MATERIAL_VERSION"
        private const val SPLASH_SCREEN = "androidx.core:core-splashscreen:$SPLASH_SCREEN_VERSION"

        val allDeps = listOf(MATERIAL, SPLASH_SCREEN)
    }

    object Plugins {
        const val DETEKT_VERSION = "1.23.5"

        const val DETEKT_FORMATTING =
            "io.gitlab.arturbosch.detekt:detekt-formatting:$DETEKT_VERSION"
    }
}
