package ru.ccf.feature.authorization.impl.di

import dagger.Binds
import dagger.Module
import ru.ccf.feature.authorization.api.AuthorizationScreen
import ru.ccf.feature.authorization.impl.AuthorizationScreenImpl

@Module
interface AuthorizationScreenModule {

    @Binds
    fun provideAuthorizationScreen(impl: AuthorizationScreenImpl): AuthorizationScreen
}
