package com.example.navegationexample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.navegationexample.R.id.txt_text
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var text = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_aceptar_text.setOnClickListener{processText()}
        btn_aceptar_numer.setOnClickListener{
            processNumber()
        }


    }

    private fun processNumber() {
        var intent=Intent(this,Activity3::class.java)
        intent.putExtra("number", txt_number.text.toString())
        intent.putExtra("text", txt_text.text.toString())
        startActivity(intent)
    }

    private fun processText() {
        var intent=Intent(this,Activity2::class.java)
        intent.putExtra("parameter", txt_text.text.toString())
        startActivity(intent)
    }
}
