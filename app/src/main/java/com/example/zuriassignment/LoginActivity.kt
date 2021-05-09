package com.example.zuriassignment

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.button)
        val email = findViewById<EditText>(R.id.email)
        val pass = findViewById<EditText>(R.id.password)

        loginButton.setOnClickListener {
            var mail = email.text
            var myPass = pass.text
            if (TextUtils.isEmpty(mail)){
                Toast.makeText(this,"Enter your email",Toast.LENGTH_SHORT).show()
            }else if (TextUtils.isEmpty(myPass)){
                Toast.makeText(this,"Entered you password",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Entered email ${mail} and entered password ${myPass}",Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}