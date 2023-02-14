package com.example.testcda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NewActivity : AppCompatActivity() {
    val TAG = "NewActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        //Definir mon action
        var action = intent.action

        //categorie
        val isUserView = intent.hasCategory("user")
        //charger mes extras
        val extras: Bundle? = intent.extras
        val name = extras?.getString("name")
        val age = extras?.getInt("age")

        Log.i(TAG, "ation : $action, isUserView : $isUserView, name : $name, age : $age")
    }
}