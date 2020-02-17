package com.example.ebooktddjava.capitulo08

abstract class RegraDeCalculo {
    fun calcula(f: Funcionario): Double {
        return if (f.salario > limite()) f.salario * porcentagemAcimaDoLimite()
        else f.salario * porcentagemBase()
    }

    protected abstract fun limite(): Int
    protected abstract fun porcentagemAcimaDoLimite(): Double
    protected abstract fun porcentagemBase(): Double
}