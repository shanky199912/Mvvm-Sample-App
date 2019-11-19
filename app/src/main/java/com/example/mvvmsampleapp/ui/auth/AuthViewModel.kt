package com.example.mvvmsampleapp.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel(){

    var email:String? = null
    var pwd:String? = null

    var authListener:AuthListener? = null

    fun onSignInBtnClicked(view:View){
        authListener?.onStarted()
        if (email.isNullOrEmpty() || pwd.isNullOrEmpty()){
            authListener?.onFailure("Invalid Login or Password")
            return
        }
        authListener?.onSuccess()
        //
    }
}