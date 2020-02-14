package com.example.ebooktddjava

import com.example.ebooktddjava.capitulo06.CarrinhoDeCompras
import com.example.ebooktddjava.capitulo06.Item

class CarrinhoDeComprasBuilder {
    var carrinho = CarrinhoDeCompras()

    fun comItens(vararg valores: Double): CarrinhoDeComprasBuilder {
        for (valor in valores) {
            carrinho.adiciona(Item("item", 1, valor))
        }
        return this
    }

    fun cria(): CarrinhoDeCompras {
        return carrinho
    }

}