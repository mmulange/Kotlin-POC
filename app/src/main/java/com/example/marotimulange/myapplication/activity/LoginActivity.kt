package com.example.marotimulange.myapplication.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.marotimulange.myapplication.R
import android.os.Build
import android.util.Log
import com.example.marotimulange.myapplication.pojo.ContactFeeds
import com.example.marotimulange.myapplication.retrofit.APIInterface
import com.example.marotimulange.myapplication.retrofit.APIClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private val TAG: String? = javaClass.simpleName;

    private var etUserName: EditText? = null
    private var etPassword: EditText? = null

    private var btnLogin: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initViews()
    }

    private fun initViews() {
        etUserName = findViewById(R.id.activity_login_et_username)
        etPassword = findViewById(R.id.activity_login_et_password)

        btnLogin = findViewById(R.id.activity_login_btn_login)
        btnLogin!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.activity_login_btn_login -> {
                var userName: String = etUserName!!.text.toString();
                var password: String = etPassword!!.text.toString();

                if (TextUtils.isEmpty(userName) || TextUtils.isEmpty(password))
                    Toast.makeText(this, "Please enter username and password.", Toast.LENGTH_LONG).show()
                else {
                    if (userName.equals("admin") && password.equals("qwerty")) {

                        var intent = Intent(this, ContactActivity::class.java)
                        startActivity(intent)
                    } else
                        Toast.makeText(this, "Invalid Credential", Toast.LENGTH_LONG).show()
                }

            }
        }
    }


}