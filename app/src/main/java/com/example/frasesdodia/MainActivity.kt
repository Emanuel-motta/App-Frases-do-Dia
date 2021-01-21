package com.example.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nova_frase.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val id = v.id
        if (id == R.id.nova_frase) {
            gerarFrases()
        }
    }

    private val frases = arrayOf(
            "O importante não é vencer todos os dias, mas lutar sempre.",
            "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!",
            "É melhor conquistar a si mesmo do que vencer mil batalhas.",
            "Enquanto houver vontade de lutar haverá esperança de vencer.",
            "Se você quer ser bem-sucedido precisa de dedicação total, buscar seu último limite e dar o melhor de si mesmo",
            "Não crie limites para si mesmo. Você deve ir tão longe quanto sua mente permitir. O que você mais quer pode ser conquistado",
            "Nenhum obstáculo será grande se a sua vontade de vencer for maior",
            "Dificuldades preparam pessoas comuns para destinos extraordinários",
            "Nenhum homem será um grande líder se quiser fazer tudo sozinho ou se quiser levar todo o crédito por fazer isso",
            "Pessoas vencedoras não são aquelas que não falham, são aquelas que não desistem"
    )

     private fun gerarFrases() {
         val totalArray = frases.size
         val numeroAleatorio = Random().nextInt(totalArray)
         Text.text = frases[numeroAleatorio]
     }
}