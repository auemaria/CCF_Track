package ru.ccf.feature.registration.impl.di

import dagger.Component
import ru.ccf.feature.registration.impl.di.DaggerRegistrationScreenComponent
import ru.ccf.feature.registration.api.di.RegistrationApi

@Component(
    modules = [
        RegistrationScreenModule::class
    ],
)
interface RegistrationScreenComponent : RegistrationApi {
    companion object {
        fun create(): RegistrationApi = DaggerRegistrationScreenComponent.builder().build()
    }
}
