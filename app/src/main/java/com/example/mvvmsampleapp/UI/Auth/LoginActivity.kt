package com.example.mvvmsampleapp.UI.Auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvmsampleapp.R
import com.example.mvvmsampleapp.Utils.toast

class LoginActivity : AppCompatActivity(), AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onStarted() {
        toast("Login Started")
    }

    override fun onSuccess() {
        toast("Login Success")
    }

    override fun onFailure(message: String) {
        toast(message)
    }
}
