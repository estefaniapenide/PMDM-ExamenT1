package com.example.penide_estefania_examen1tadultos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.penide_estefania_examen1tadultos.databinding.ActivityContadorBinding

class ContadorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContadorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityContadorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var contador1=0
        var contador2=0
        var contadorGlobal=0

        binding.bContador1.setOnClickListener{

            if(binding.etIncremento1.getText().isEmpty()){
                Toast.makeText(this,"Debe introducir un incremento numeral para el contador",Toast.LENGTH_SHORT).show()
            }else {

                var incremento1 = binding.etIncremento1.getText().toString().toInt()
                contador1 = contador1 + incremento1
                contadorGlobal = contador1 + contador2
                binding.tvContador1.setText("$contador1")
                binding.tvGlobalNumero.setText("$contadorGlobal")
            }
        }

        binding.bContador2.setOnClickListener{

            if(binding.etIncremento2.getText().isEmpty()){
                Toast.makeText(this,"Debe introducir un incremento numeral para el contador",Toast.LENGTH_SHORT).show()
            }else {

                var incremento2 = binding.etIncremento2.getText().toString().toInt()
                contador2 = contador2 + incremento2
                contadorGlobal = contador1 + contador2
                binding.tvContador2.setText("$contador2")
                binding.tvGlobalNumero.setText("$contadorGlobal")

            }
        }

        binding.iwDelContador1.setOnClickListener{
            contador1=0
            binding.tvContador1.setText("$contador1")
        }

        binding.iwDelContador2.setOnClickListener{
            contador2=0
            binding.tvContador2.setText("$contador2")
        }

        binding.ivDelGlobal.setOnClickListener{
            contadorGlobal=0
            binding.tvGlobalNumero.setText("$contadorGlobal")
        }
    }
}