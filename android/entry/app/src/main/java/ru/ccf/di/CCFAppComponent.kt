package ru.ccf.di

import dagger.Component
import ru.ccf.core.di.impl.ApiRegistry
import ru.ccf.core.di.impl.ApiResolver
import ru.ccf.di.modules.FeatureAggregationModule
import ru.ccf.di.DaggerCCFAppComponent

@Component(
    modules = [
        FeatureAggregationModule::class,
    ]
)
interface CCFAppComponent {

    val apiResolver: ApiResolver
}

/**
 * Initialization of application's **DI graph**
 *
 */
fun initApis(): CCFAppComponent = DaggerCCFAppComponent
    .builder()
    .build()
    .also {
        ApiRegistry.init(it.apiResolver)
    }
