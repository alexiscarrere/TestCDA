package com.example.testcda

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Add button
        val button = findViewById<Button>(R.id.start_new_activity_btn)
        button.setOnClickListener{
            val intent = Intent(this, NewActivity::class.java)
            //add action
            intent.action = Intent.ACTION_VIEW
            //ADD CATEGORY
            intent.addCategory("user")
            // ADD EXTRA
            intent.putExtra("name", "Alexis")
            intent.putExtra("age", 27)
            startActivity(intent)
        }

        // Log
        Log.v("MainActivity", "Verbose message")
        Log.d("MainActivity", "Debug message")

    }
}