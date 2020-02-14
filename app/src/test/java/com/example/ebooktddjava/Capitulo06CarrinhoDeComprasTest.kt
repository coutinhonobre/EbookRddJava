package com.example.ebooktddjava

import com.example.ebooktddjava.capitulo06.CarrinhoDeCompras
import com.example.ebooktddjava.capitulo06.Item
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class Capitulo06CarrinhoDeComprasTest {

    lateinit var carrinho: CarrinhoDeCompras
    var carrinhoBuilder = CarrinhoDeComprasBuilder()

    @Before
    fun inicializa(){
        this.carrinho = CarrinhoDeCompras()
        carrinhoBuilder!!.cria()
    }

    @Test
    fun deveRetornarZeroSeCarrinhoVazio() {
        assertEquals(0.0, carrinhoBuilder.carrinho.maiorValor(), 0.0001);
    }

    @Test
    fun deveRetornarValorDoItemSeCarrinhoCom1Elemento() {
        carrinho.adiciona(Item("Geladeira", 1, 900.0))
        assertEquals(900.0, carrinho.maiorValor(), 0.0001)
    }


    @Test
    fun deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
        carrinho.adiciona(Item("Geladeira", 1, 900.0))
        carrinho.adiciona(Item("Fogão", 1, 1500.0))
        carrinho.adiciona(Item("Máquina de Lavar", 1, 750.0))
        assertEquals(1500.0, carrinho.maiorValor(), 0.0001)
    }


}