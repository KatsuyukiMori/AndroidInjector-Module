package com.example.androidinjector_module.di.module

import com.example.androidinjector_module.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    // MainActivityのサブコンポーネントを作成する？
    @ContributesAndroidInjector
    internal abstract fun contributeMainActivity(): MainActivity
}