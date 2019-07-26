package com.example.wolorestart

import android.os.Bundle
import com.example.wolorestart.feature.common.View.BaseActivity


class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigator.onStart()
        var a = ""
    }
}
