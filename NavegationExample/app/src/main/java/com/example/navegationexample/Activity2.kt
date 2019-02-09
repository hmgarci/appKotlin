package com.example.navegationexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_3.*

class Activity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        showParameter()

    }

    private fun showParameter() {
        var bundle =intent.extras
        var text=bundle.get("parameter")
        txt_gretting2.text=getString(R.string.welcome, text)

    }
}
