package com.app.calculadorahipotenusa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var limpiarCampos: Button
    private lateinit var calcularHipotenusa: Button
    private lateinit var etCatetoC: EditText
    private lateinit var etCatetoB: EditText
    private lateinit var tvResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        instanciarComponentes()
        iniciarComponentes()
    }

    private fun instanciarComponentes(){
        limpiarCampos = findViewById(R.id.LimpiarCampos)
        calcularHipotenusa = findViewById(R.id.CalcularHipotenusa)
        etCatetoC = findViewById(R.id.EtCatetoC)
        etCatetoB = findViewById(R.id.EtCatetoB)
        tvResultado = findViewById(R.id.TvResultado)
    }

    private fun iniciarComponentes() {
        limpiarCampos.setOnClickListener {
            limpiarCampos()
        }
        calcularHipotenusa.setOnClickListener {

            var c : String = etCatetoC.getText().toString()
            var b : String = etCatetoB.getText().toString()

            if(c == "" && b == ""){
                sendMessage("Favor de llenar los campos!!!")

            }else if (c == ""){
                sendMessage("Campo de Cateto A vacio!!!")

            }else if(b == ""){
                sendMessage("Campo de Cateto B vacio!!!")

            }else{
                var catetoC: Double = validarCampo(c)
                var catetoB: Double = validarCampo(b)

                var resultado: Double = Math.pow(catetoC,2.0) + Math.pow(catetoB,2.0)
                tvResultado.setText("La hipotenusa es: ${resultado}")

            }
        }
    }

    private fun validarCampo(valor: String): Double{
        val valorObtenido = valor.toDouble()

        return valorObtenido
    }

    private fun limpiarCampos(){
        etCatetoC.setText("")
        etCatetoB.setText("")
        tvResultado.setText("")
    }

    private fun sendMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}