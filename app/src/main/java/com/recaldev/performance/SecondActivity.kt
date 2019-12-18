package com.recaldev.performance

import android.app.Activity
import android.os.Bundle

class SecondActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        SingletonSample.retainActivity(this)
    }
}