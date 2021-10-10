package com.example.logintypes.UI

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.logintypes.databinding.LoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: LoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignout1.setOnClickListener {
            ClickLogin()

        }

    }
    private fun ClickLogin() {
        val MainActivity = Intent(this, MainActivity::class.java)
        startActivity(MainActivity)

    }
}