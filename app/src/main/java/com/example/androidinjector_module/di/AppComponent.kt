package com.example.androidinjector_module.di

import com.example.androidinjector_module.MyApplication
import com.example.androidinjector_module.di.module.ActivityModule
import com.example.androidinjector_module.di.module.HelloModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivityModule::class,
        HelloModule::class
    ]
)
interface AppComponent : AndroidInjector<MyApplication> {
}