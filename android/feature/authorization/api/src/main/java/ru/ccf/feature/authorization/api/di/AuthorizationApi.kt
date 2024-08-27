package ru.ccf.feature.authorization.api.di

import ru.ccf.core.di.api.Api
import ru.ccf.feature.authorization.api.AuthorizationScreen

interface AuthorizationApi : Api {
    val authorizationScreen: AuthorizationScreen
}
