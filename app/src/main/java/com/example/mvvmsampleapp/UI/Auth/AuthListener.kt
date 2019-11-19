package com.example.mvvmsampleapp.UI.Auth

interface AuthListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure(message:String)
}