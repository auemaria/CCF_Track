package ru.ccf

import android.app.Application
import android.os.StrictMode
import ru.ccf.di.CCFAppComponent
import ru.ccf.di.initApis
import timber.log.Timber

class CCFApp : Application() {

    override fun onCreate() {
        initStrictMode()
        super.onCreate()

        initTimber()
        CCFAppComponent = initApis()
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    private fun initStrictMode() {
        if (BuildConfig.DEBUG) {
            StrictMode.setVmPolicy(
                StrictMode.VmPolicy.Builder()
                    .detectActivityLeaks()
                    .detectLeakedClosableObjects()
                    .penaltyLog()
                    .penaltyDropBox()
                    .build()
            )

            StrictMode.setThreadPolicy(
                StrictMode.ThreadPolicy.Builder()
                    // .detectDiskReads() // TODO Shared Preferences ruins, move to DataStore?
                    .detectDiskWrites()
                    .detectNetwork()
                    .penaltyDropBox()
                    .penaltyLog()
                    .build()
            )
        }
    }

    companion object {
        lateinit var CCFAppComponent: CCFAppComponent
    }
}
