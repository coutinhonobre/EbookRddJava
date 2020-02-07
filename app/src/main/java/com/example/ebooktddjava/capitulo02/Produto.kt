package com.example.ebooktddjava.capitulo02

data class Produto(
    var nome: String,
    var valor: Double
){
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}
