    package com.example.layouts

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

    class MainActivity : AppCompatActivity() {
        val TAG = MainActivity::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.framelayout)

        //
    }
    private fun initViews(){
        val loginButton = findViewById<Button>(R.id.btn_login)
        val id = findViewById<EditText>(R.id.et_id)
        val password = findViewById<EditText>(R.id.et_password)

        loginButton.setOnClickListener {
            Log.d(TAG, id.text.toString() + " " + password.text.toString())
        }
    }
}