package com.example.ebooktddjava

import com.example.ebooktddjava.capitulo05.CarrinhoDeCompras
import com.example.ebooktddjava.capitulo05.Item
import com.example.ebooktddjava.capitulo05.MaiorPreco
import org.junit.Assert.assertEquals
import org.junit.Test


class Capitulo05MaiorPrecoTest {

    @Test
    fun deveRetornarZeroSeCarrinhoVazio(){
        var carrinho = CarrinhoDeCompras()

        var algoritmo = MaiorPreco()

        var valor = algoritmo.encontra(carrinho)

        assertEquals(0.0, valor, 0.0001)
    }

    @Test
    fun deveRetornarValorDoItemSeCarrinhoCom1Elemento(){
        val carrinho = CarrinhoDeCompras()
        carrinho.adiciona(Item("Geladeira", 1, 900.0))
        val algoritmo = MaiorPreco()
        val valor = algoritmo.encontra(carrinho)
        assertEquals(900.0, valor, 0.0001);
    }


}