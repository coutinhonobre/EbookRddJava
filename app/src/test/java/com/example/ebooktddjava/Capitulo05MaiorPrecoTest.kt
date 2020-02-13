package com.example.ebooktddjava

import com.example.ebooktddjava.capitulo05.CarrinhoDeCompras
import com.example.ebooktddjava.capitulo05.Item
import org.junit.Assert.assertEquals
import org.junit.Test


class Capitulo05MaiorPrecoTest {

    @Test
    fun deveRetornarZeroSeCarrinhoVazio(){
        var carrinho = CarrinhoDeCompras()

        assertEquals(0.0, carrinho.maiorValor(), 0.0001)
    }

    @Test
    fun deveRetornarValorDoItemSeCarrinhoCom1Elemento(){
        val carrinho = CarrinhoDeCompras()
        carrinho.adiciona(Item("Geladeira", 1, 900.0))
        assertEquals(900.0, carrinho.maiorValor(), 0.0001);
    }

    @Test
    fun deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
        val carrinho = CarrinhoDeCompras()
        carrinho.adiciona(Item("Geladeira", 1, 900.0))
        carrinho.adiciona(Item("Fogão", 1, 1500.0))
        carrinho.adiciona(Item("Máquina de Lavar", 1, 750.0))
        assertEquals(1500.0, carrinho.maiorValor(), 0.0001)
    }


}