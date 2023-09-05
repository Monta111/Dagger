package com.example.myapplication

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class MyApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }
}