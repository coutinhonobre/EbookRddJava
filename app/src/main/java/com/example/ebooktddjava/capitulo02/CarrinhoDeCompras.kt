package com.example.ebooktddjava.capitulo02

data class CarrinhoDeCompras(
    var produtos: MutableList<Produto> = mutableListOf(Produto("Mel", 25.2), Produto("Caderno", 11.4))
)