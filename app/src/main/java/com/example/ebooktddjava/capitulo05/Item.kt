package com.example.ebooktddjava.capitulo05

data class Item(
    var descricao: String,
    var quantidade:  Int,
    var valorUnitario: Double
) {

    fun getValorTotal() = this.valorUnitario * this.quantidade

}
