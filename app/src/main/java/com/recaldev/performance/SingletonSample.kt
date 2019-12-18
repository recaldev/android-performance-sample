package com.recaldev.performance

import android.content.Context

object SingletonSample {

    private var context: Context? = null

    fun retainActivity(context: Context){
        this.context = context
    }
}