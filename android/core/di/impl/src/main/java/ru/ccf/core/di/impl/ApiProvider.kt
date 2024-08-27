package ru.ccf.core.di.impl

import ru.ccf.core.di.api.Api

/**
 * [ApiProvider] - SAM interface for wrapping implementation of [Api] and subsequent addition
 * to general **DI Map** of [ApiResolver]
 *
 * Use like this:
 * ApiProvider { SomeFeatureApiProvider.create() }
 * or ApiProvider(SomeFeatureApiProvider::create)
 *
 * @see ApiResolver
 *
 * @author Ianke Anastasiia
 */
fun interface ApiProvider {
    fun get(): Api
}
