package com.example.ebooktddjava.capitulo08

enum class Cargo(val regra: RegraDeCalculo) {
    DESENVOLVEDOR(DezOuVintePorCento()),
    DBA(QuinzeOuVinteCincoPorCento()),
    TESTADOR(QuinzeOuVinteCincoPorCento());

}