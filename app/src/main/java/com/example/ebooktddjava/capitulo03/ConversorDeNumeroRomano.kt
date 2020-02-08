package com.example.ebooktddjava.capitulo03

class ConversorDeNumeroRomano {

    private val tabela: HashMap<String?, Int?> =
        object : HashMap<String?, Int?>() {
            init {
                put("I", 1)
                put("V", 5)
                put("X", 10)
                put("L", 50)
                put("C", 100)
                put("D", 500)
                put("M", 1000)
            }
        }


    fun converte(numeroEmRomano: String): Int {

        var acumulador = 0
        var ultimoVizinhoDaDireita = 0

        for (i in numeroEmRomano.length - 1 downTo 0) { // pega o inteiro referente ao simbolo atual
            val atual = tabela[numeroEmRomano[i].toString()]!!
            // se o da direita for menor, o multiplicaremos
            // por -1 para torná-lo negativo
            var multiplicador = 1
            if (atual < ultimoVizinhoDaDireita) multiplicador = -1
            acumulador += tabela[numeroEmRomano[i].toString()]!! * multiplicador
            // atualiza o vizinho da direita
            ultimoVizinhoDaDireita = atual
        }
        return acumulador
    }
}