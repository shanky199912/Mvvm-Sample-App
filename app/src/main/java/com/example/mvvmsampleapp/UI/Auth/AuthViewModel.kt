package com.example.mvvmsampleapp.UI.Auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel(){

    var email:String? = null
    var pwd:String? = null

    fun onSignInBtnClicked(view:View){
        if (email.isNullOrEmpty() || pwd.isNullOrEmpty()){
            //
            return
        }

        //
    }
}