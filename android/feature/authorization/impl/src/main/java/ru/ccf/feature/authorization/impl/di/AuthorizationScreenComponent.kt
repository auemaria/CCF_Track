package ru.ccf.feature.authorization.impl.di

import dagger.Component
import ru.ccf.feature.authorization.api.di.AuthorizationApi

@Component(
    modules = [
        AuthorizationScreenModule::class
    ],
)
interface AuthorizationScreenComponent : AuthorizationApi {
    companion object {
        fun create(): AuthorizationApi = ru.ccf.feature.authorization.impl.di.DaggerAuthorizationScreenComponent.builder().build()
    }
}
