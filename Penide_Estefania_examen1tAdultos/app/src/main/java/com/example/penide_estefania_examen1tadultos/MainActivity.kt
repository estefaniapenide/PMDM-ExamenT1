package com.example.penide_estefania_examen1tadultos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isGone
import androidx.core.view.isVisible
import com.example.penide_estefania_examen1tadultos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvVerPassword.setOnClickListener{

            var textoCodificado=binding.editTextTextPassword.getText().toString()
            var textoVisible =binding.etPasswordVisible.getText().toString()

            /*var textoCodificado1=binding.editTextTextPassword.inputType.toString()
            var textoVisible1 =binding.etPasswordVisible.inputType.toString()*/

            if(binding.editTextTextPassword.isGone) {
                binding.editTextTextPassword.setText(textoVisible)
                binding.etPasswordVisible.visibility = View.GONE
                binding.editTextTextPassword.visibility = View.VISIBLE
                (it as TextView).setText("Ver contraseña")
            }

            else if(binding.etPasswordVisible.isGone) {
                binding.etPasswordVisible.setText(textoCodificado)
                binding.editTextTextPassword.visibility = View.GONE
                binding.etPasswordVisible.visibility = View.VISIBLE
                (it as TextView).setText("Ocultar contraseña")
            }

        }


        binding.bEntrar.setOnClickListener{

            if(binding.editTextTextEmailAddress.getText().isEmpty()) {
                Toast.makeText(this, "Debe introducir un email válido", Toast.LENGTH_SHORT).show()
            }
            else if (binding.editTextTextPassword.getText().isEmpty()) {
                Toast.makeText(this, "Debe introducir una contarseña", Toast.LENGTH_SHORT).show()
            }
            else if(binding.editTextTextPassword.getText().length<=8 || binding.etPasswordVisible.getText().length<=8) {
                Toast.makeText(
                    this,
                    "Su contraseña debe tener más de 8 caracteres",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else {
                startActivity(Intent(this, ContadorActivity::class.java))
            }

        }


        binding.tvRegistrarse.setOnClickListener{
            startActivity(Intent(this,RegistroActivity::class.java))
        }
    }
}