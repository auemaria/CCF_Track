package ru.ccf.feature.registration.api.di

import ru.ccf.core.di.api.Api
import ru.ccf.feature.registration.api.RegistrationScreen

interface RegistrationApi : Api {
    val registrationScreen: RegistrationScreen
}
