package com.example.ebooktddjava.capitulo05

import java.util.*

class CarrinhoDeCompras(
    var itens: MutableList<Item> = mutableListOf<Item>()
) {

    fun adiciona(item: Item){
        this.itens.add(item)
    }

    fun lista(): MutableList<Item> = Collections.unmodifiableList(itens)

    fun maiorValor(): Double{
        if(itens.isEmpty()) return  0.0

        var maior = itens[0].getValorTotal()

        for (item in itens)
            if (item.getValorTotal() > maior) maior = item.getValorTotal()

        return maior
    }



}