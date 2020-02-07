package com.example.ebooktddjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.ebooktddjava.capitulo02.CarrinhoDeCompras
import com.example.ebooktddjava.capitulo02.MaiorEMenor
import com.example.ebooktddjava.capitulo02.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var carrinho = CarrinhoDeCompras()
        carrinho.produtos.add(Produto("Liquidificado", 450.0))
        carrinho.produtos.add(Produto("Geladeira", 250.0))
        carrinho.produtos.add(Produto("Jogo de pratos", 70.0))

        var algoritmo = MaiorEMenor()
        algoritmo.encontra(carrinho)

        Log.d("Produto", "O menor produto: ${algoritmo.menor!!.nome}")
        Log.d("Produto", "O maior produto: ${algoritmo.maior!!.nome}")

    }
}