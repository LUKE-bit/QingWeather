package com.qingweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class QingWeatherApplication :Application(){
    companion object{
        const val TOKEN = "jTM7v91F1NGR0GOt"
        @SuppressLint("StaticFieldLeak")
        lateinit var context:Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}