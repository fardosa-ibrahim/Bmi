package com.example.firstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBmi:Button
    lateinit var btnsendMoney:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmi=findViewById(R.id.btnBmi)
        btnBmi.setOnClickListener {
            val intent=Intent(this,BmiCalculatorActivity::class.java)
            startActivity(intent)
        }
        btnsendMoney=findViewById(R.id.btnSendMoney)
        btnsendMoney.setOnClickListener {
            val intent=Intent(this,MoneyActivity::class.java)
            startActivity(intent)
        }
    }
}