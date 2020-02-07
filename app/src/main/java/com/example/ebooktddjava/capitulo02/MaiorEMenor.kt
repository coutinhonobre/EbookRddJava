package com.example.ebooktddjava.capitulo02

class MaiorEMenor {

    var menor: Produto? = null
    var maior: Produto? = null

    fun encontra(carrinho: CarrinhoDeCompras){
        for(produto: Produto in carrinho.produtos){
            if(menor == null || produto.valor < menor!!.valor)
                menor = produto
            if(maior == null || produto.valor > maior!!.valor)
                maior = produto
        }
    }



}