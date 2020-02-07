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


    fun converte(numeroEmRomano: String): Int = tabela[numeroEmRomano]!!
}