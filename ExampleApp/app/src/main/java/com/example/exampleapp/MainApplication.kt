package com.example.exampleapp

import android.app.Application
import com.example.exampleapp.data.RuntimeConfig
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

/**
 * DaggerHilt REQUIRES you to use a custom Application class
 * which NEEDS to be annotated with @HiltAndroidApp
 */
@HiltAndroidApp
class MainApplication: Application() {

    @Inject
    lateinit var runtimeConfig: RuntimeConfig

    override fun onCreate() {
        super.onCreate()

        runtimeConfig.dynamicDependency1 = "Dep 1 set in MainApplication"
        runtimeConfig.dynamicDependency2 = "Dep 2 set in MainApplication"
    }
}