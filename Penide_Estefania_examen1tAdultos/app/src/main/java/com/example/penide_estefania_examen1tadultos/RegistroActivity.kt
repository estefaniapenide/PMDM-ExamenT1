package com.example.penide_estefania_examen1tadultos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.penide_estefania_examen1tadultos.databinding.ActivityRegistroBinding

class RegistroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{

            var cont1 = binding.editTextTextPassword2.getText().toString()
            var cont2=binding.editTextTextPassword3.getText().toString()

            if(binding.editTextTextEmailAddress2.getText().isEmpty()) {
                Toast.makeText(this, "Debe introducir un email válido", Toast.LENGTH_SHORT).show()
            }

            else if(binding.editTextTextPassword2.getText().length<=8) {
                Toast.makeText(
                    this,
                    "Su contraseña debe tener más de 8 caractereres",
                    Toast.LENGTH_SHORT
                ).show()
            }

            else if(cont1!=cont2) {
                Toast.makeText(this, "La contraseña no coincide", Toast.LENGTH_SHORT).show()
            }

            else {
                Toast.makeText(this, "Se ha registrado al usuario", Toast.LENGTH_SHORT).show()
            }
        }
    }
}