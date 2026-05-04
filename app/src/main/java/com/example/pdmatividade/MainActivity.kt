package com.example.pdmatividade

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val TAG = "item"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//Definindo a Visão
        setContentView(R.layout.activity_main)
        Log.v(TAG, "Visão criada")
        val btLogin = findViewById<Button>(R.id.buttonComeca)
//Agora os EVENTOS
        btLogin.setOnClickListener{
            val progressBar: ProgressBar = findViewById<ProgressBar>(R.id.progressBar)
            progressBar.incrementProgressBy(10)
            val tEscrever = findViewById<TextView>(R.id.editText)
            //val tSenha = findViewById<TextView>(R.id.editTextSenha)
            val frase =  tEscrever.text.toString()
            //val senha = tSenha.text.toString()
            if(frase == "encontrou o segredo"/* && senha == "123"*/) {
                toast("Você conseguiu!")
            } else {
                toast("Você escreveu $frase")
            }
        }
    }
    private fun toast(mensagem: String, length: Int = Toast.LENGTH_SHORT){
        Toast.makeText(this, mensagem, length).show()
    }
}