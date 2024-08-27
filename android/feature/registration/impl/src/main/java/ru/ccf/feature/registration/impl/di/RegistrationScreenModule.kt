package ru.ccf.feature.registration.impl.di

import dagger.Binds
import dagger.Module
import ru.ccf.feature.registration.api.RegistrationScreen
import ru.ccf.feature.registration.impl.RegistrationScreenImpl

@Module
interface RegistrationScreenModule {

    @Binds
    fun provideAuthorizationScreen(impl: RegistrationScreenImpl): RegistrationScreen
}
