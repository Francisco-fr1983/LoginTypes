package com.example.logintypes.UI

import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.example.logintypes.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding

    //private lateinit var viewModel: ViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //viewModel = ViewModelProvider(this).get(ViewModel::class.java)
        setupPermissions()
        ClickRegister()


        /*Função para clicar no botão e direcionar para outra tela*/
        binding.btnLogin.setOnClickListener {
            ClickLogin()
            Toast.makeText(this, "Logged In!", Toast.LENGTH_SHORT).show()

        }


        binding.btnGmail.setOnClickListener {
            ClickGmail()
        }

    }

    private fun ClickLogin() {
        val login = Intent(this, Login::class.java)
        startActivity(login)

    }
    private fun ClickGmail() {
        val gmail = Intent(this, Gmail2::class.java)
        startActivity(gmail)

    }
    private fun ClickRegister() {
        binding.btnRegister.setOnClickListener {
            startActivityForResult(Intent(this, Register::class.java), CREATE_USER)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CREATE_USER) {

        }
    }
    companion object {
        private const val CREATE_USER = 10
    }
    private fun setupPermissions() {
        // write permission to access the storage
        ActivityCompat.requestPermissions(
            this,
            arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
            1
        )
        ActivityCompat.requestPermissions(
            this,
            arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),
            1
        )
    }


}