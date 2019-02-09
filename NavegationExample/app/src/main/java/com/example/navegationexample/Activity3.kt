package com.example.navegationexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_3.*

class Activity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        showNumer()

    }

    private fun showNumer() {
        // var bundle =intent.extras
        var text=intent.getStringExtra("text").toString()
        var number=intent.getStringExtra("number").toString().toInt();
        for (i in 1..number){
            txt_gretting.text=txt_gretting.text.toString()+ " "+ text
        }

    }
}
