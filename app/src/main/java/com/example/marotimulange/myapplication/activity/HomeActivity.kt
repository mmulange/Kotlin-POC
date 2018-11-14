package com.example.marotimulange.myapplication.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.marotimulange.myapplication.R

class HomeActivity : AppCompatActivity(), View.OnClickListener {

    private var btnClick: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnClick = findViewById(R.id.activity_home_btn_click)
        btnClick!!.setOnClickListener(this);
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.activity_home_btn_click -> {
                Toast.makeText(this, "Hello Kotlin", Toast.LENGTH_LONG).show()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent);
            }
        }
    }
}