package com.projectx.homework2_7month

import android.app.Application
import com.projectx.homework2_7month.data.database.di.dataModules
import com.projectx.homework2_7month.domain.di.domainModule
import com.projectx.homework2_7month.presentation.module.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App:Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            androidLogger(Level.DEBUG)
            modules(dataModules)
            modules(domainModule)
            modules(uiModule)
        }

    }
}