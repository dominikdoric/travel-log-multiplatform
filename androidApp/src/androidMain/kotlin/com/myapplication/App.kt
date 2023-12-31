package com.myapplication

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App: Application() {
    val androidModule = module {}

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
        }
    }
}