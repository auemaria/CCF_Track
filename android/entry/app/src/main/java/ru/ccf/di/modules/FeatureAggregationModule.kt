package ru.ccf.di.modules

import dagger.Module
import ru.ccf.feature.authorization.impl.di.AuthorizationScreenApiProvider
import ru.ccf.feature.registration.impl.di.RegistrationScreenApiProvider

@Module(
    includes = [
        AuthorizationScreenApiProvider::class,
        RegistrationScreenApiProvider::class,
    ]
)
interface FeatureAggregationModule
