package com.example.ebooktddjava.capitulo05

class MaiorPreco {

    fun encontra(carrinho: CarrinhoDeCompras): Double {
        if(carrinho.itens.size == 0) return 0.0;
        return carrinho.itens[0].getValorTotal()
    }
}