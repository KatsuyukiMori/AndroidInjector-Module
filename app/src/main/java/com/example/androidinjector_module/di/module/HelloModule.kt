package com.example.androidinjector_module.di.module

import com.example.androidinjector_module.Hello
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object HelloModule {

    @Singleton
    @Provides
    fun provideHello() = Hello()
}