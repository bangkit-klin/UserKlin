package com.herisanjaya.userklin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.herisanjaya.userklin.api.ServerData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val test = ServerData()
        test.test()
    }
}