package com.example.androidinjector_module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasAndroidInjector {

    // これらを注入するのは自動生成クラスがやってくれる
    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var hello: Hello

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this) // super.onCreate()より前に呼ぶ

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello.echo()
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }
}