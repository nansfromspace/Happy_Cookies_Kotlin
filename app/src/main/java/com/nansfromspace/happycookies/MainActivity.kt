package com.nansfromspace.happycookies

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.nansfromspace.happycookies.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun biscoitinhoClick(view: View){
        val frases: List<String> = arrayListOf(
            "Sem o fogo do entusiasmo, não há o calor da vitória.",
            "Todas as coisas são difíceis antes de se tornarem fáceis.",
            "Você é do tamanho do seu sonho.",
            "Coragem é a resistência ao medo, domínio do medo, e não a ausência do medo.",
            "Espere pelo mais sábio dos conselhos: o tempo.",
            "A paciência na adversidade é sinal de um coração sensível",
            "O riso é a menor distância entre duas pessoas.",
            "Lamentar aquilo que não temos é desperdiçar aquilo que já possuímos.",
            "A maior de todas as torres começa no solo.",
            "Demonstre amor e alegria em todas as oportunidades e verá que a paz nasce dentro de si.",
            "Aquele que se importa com o sentimento dos outros, não é um tolo.",
            "O nosso primeiro e último amor é… o amor-próprio.",
            "Faça pequenas coisas hoje e coisas maiores lhe serão confiadas amanhã.",
            "Quem olha para fora sonha; quem olha para dentro acorda.",
            "Podemos escolher o que semear, mas somos obrigados a colher o que plantamos.")
        val fraseSorteada = frases.random()
        binding.txtSorte.text = "$fraseSorteada"
    }
}

