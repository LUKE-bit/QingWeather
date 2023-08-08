package com.qingweather.android.logic.model

import com.sunnyweather.android.logic.model.DailyResponse

data class Weather(val realtime:RealtimeResponse.RealTIme, val daily:DailyResponse.Daily)