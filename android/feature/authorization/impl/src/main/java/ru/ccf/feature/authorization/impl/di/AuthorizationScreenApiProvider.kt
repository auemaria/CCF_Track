package ru.ccf.feature.authorization.impl.di

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import ru.ccf.core.di.impl.ApiKey
import ru.ccf.core.di.impl.ApiProvider
import ru.ccf.feature.authorization.api.di.AuthorizationApi

@Module
class AuthorizationScreenApiProvider {

    @Provides
    @IntoMap
    @ApiKey(AuthorizationApi::class)
    fun providesAuthorizationScreenApiProvider() = ApiProvider(AuthorizationScreenComponent::create)
}
