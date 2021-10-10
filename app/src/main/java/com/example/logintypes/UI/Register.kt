package com.example.logintypes.UI

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import com.example.logintypes.Data.DataUser
import com.example.logintypes.databinding.RegisterActivityBinding


class Register : AppCompatActivity() {

    private lateinit var binding: RegisterActivityBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RegisterActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnRegister2.setOnClickListener {
            Toast.makeText(this, "Cadastro Efetuado!", Toast.LENGTH_SHORT).show()
            finish()


        }

    }
    private fun insertUser() {
        binding.btnRegister2.setOnClickListener {
            val dataUser = DataUser(
                email = binding.textEmail.editText?.text.toString(),
                password = binding.textSenha.editText?.text.toString()


            )
            //LoginViewModel.insert(DataUser)
            Toast.makeText(this, "Cadastro Efetuado!", Toast.LENGTH_SHORT).show()
            finish()
        }
    }


}



