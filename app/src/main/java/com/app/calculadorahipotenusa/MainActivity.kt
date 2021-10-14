package com.app.calculadorahipotenusa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val limpiarCampos: Button = findViewById(R.id.LimpiarCampos)
    val calcularHipotenusa: Button = findViewById(R.id.CalcularHipotenusa)
    val etCatetoC: EditText = findViewById(R.id.EtCatetoC)
    val etCatetoB: EditText = findViewById(R.id.EtCatetoB)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicializarComponentes()

    }

    fun inicializarComponentes() {
        limpiarCampos.setOnClickListener {
            limpiarCampos()
        }
        calcularHipotenusa.setOnClickListener {
            limpiarCampos()
        }
    }

    fun limpiarCampos(){
        etCatetoC.setText("")
        etCatetoB.setText("")
    }

}