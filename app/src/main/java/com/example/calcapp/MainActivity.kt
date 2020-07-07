package com.example.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View){
        if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }else{
            val num1 = editText1.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()

            var cal = 0.0

            if(v.id==button1.id){
                cal = num1 + num2
            }else if(v.id==button2.id){
                cal = num1-num2
            }else if(v.id==button3.id){
                cal = num1*num2
            }else if(v.id==button4.id){
                cal = num1/num2
            }
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE1",cal)
            startActivity(intent)
        }
    }
}
