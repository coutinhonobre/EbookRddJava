package com.example.ebooktddjava

import android.util.Log
import com.example.ebooktddjava.capitulo02.CarrinhoDeCompras
import com.example.ebooktddjava.capitulo02.MaiorEMenor
import com.example.ebooktddjava.capitulo02.Produto
import org.junit.Assert
import org.junit.Test

class Capitulo02TestaMaiorEMenorTest {

    @Test
    fun ordemDecrescente() {
        var carrinho = CarrinhoDeCompras(mutableListOf(
            Produto("Geladeira", 450.0),
            Produto("Liquidificado", 250.0),
            Produto("Jogo de pratos", 70.0)
        ))

        var algoritmo = MaiorEMenor()
        algoritmo.encontra(carrinho)

        Assert.assertEquals("Jogo de pratos", algoritmo.menor!!.nome)
        Assert.assertEquals("Geladeira", algoritmo.maior!!.nome)
    }

    @Test
    fun ordemCrescente() {
        var carrinho = CarrinhoDeCompras(mutableListOf(
            Produto("Geladeira", 70.0),
            Produto("Liquidificado", 250.0),
            Produto("Jogo de pratos", 450.0)
        ))

        var algoritmo = MaiorEMenor()
        algoritmo.encontra(carrinho)

        Assert.assertEquals("Geladeira", algoritmo.menor!!.nome)
        Assert.assertEquals("Jogo de pratos", algoritmo.maior!!.nome)
    }

    @Test
    fun ordemVariada() {
        var carrinho = CarrinhoDeCompras(mutableListOf(
            Produto("Geladeira", 70.0),
            Produto("Liquidificado", 2150.0),
            Produto("Jogo de pratos", 450.0),
            Produto("Mel", 5.2),
            Produto("Caderno", 11.4)
        ))

        var algoritmo = MaiorEMenor()
        algoritmo.encontra(carrinho)

        Assert.assertEquals("Mel", algoritmo.menor!!.nome)
        Assert.assertEquals("Liquidificado", algoritmo.maior!!.nome)
    }
    @Test
    fun apenasUmProduto(){
        var carrinho = CarrinhoDeCompras(mutableListOf(
            Produto("Geladeira", 450.0)
        ))

        var algoritmo = MaiorEMenor()
        algoritmo.encontra(carrinho)

        Assert.assertEquals(carrinho.produtos[0], algoritmo.menor!!)
        Assert.assertEquals("Geladeira", algoritmo.maior!!.nome)
    }
}