package com.example.androidinjector_module

import android.app.Application
import com.example.androidinjector_module.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MyApplication : Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> {
        DaggerAppComponent
            .create()
            .inject(this)
        return androidInjector
    }
}