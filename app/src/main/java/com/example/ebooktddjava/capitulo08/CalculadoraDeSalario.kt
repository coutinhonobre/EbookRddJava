package com.example.ebooktddjava.capitulo08

class CalculadoraDeSalario {

    fun calculaSalario(funcionario: Funcionario): Double {
        return funcionario.cargo.regra.calcula(funcionario)
    }

}