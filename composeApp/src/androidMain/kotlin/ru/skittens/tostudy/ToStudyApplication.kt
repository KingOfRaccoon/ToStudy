package ru.skittens.tostudy

import android.app.Application
import di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level

class ToStudyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(applicationContext)
            androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
        }
    }
}