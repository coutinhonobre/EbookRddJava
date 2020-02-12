package com.example.ebooktddjava.capitulo05

import java.util.*

class CarrinhoDeCompras(
    var itens: MutableList<Item> = mutableListOf<Item>()
) {

    fun adiciona(item: Item){
        this.itens.add(item)
    }

    fun lista(): MutableList<Item> = Collections.unmodifiableList(itens)



}