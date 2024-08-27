package ru.ccf.feature.registration.impl.di

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import ru.ccf.core.di.impl.ApiKey
import ru.ccf.core.di.impl.ApiProvider
import ru.ccf.feature.registration.api.di.RegistrationApi

@Module
class RegistrationScreenApiProvider {

    @Provides
    @IntoMap
    @ApiKey(RegistrationApi::class)
    fun providesRegistrationScreenApiProvider() = ApiProvider(RegistrationScreenComponent.Companion::create)
}
