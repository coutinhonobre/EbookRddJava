package com.example.ebooktddjava.capitulo07

class CalculadoraDeSalario {

    fun calculaSalario(funcionario: Funcionario): Double {
        if (funcionario.cargo == Cargo.DESENVOLVEDOR) {
            return dezOuVintePorCentoDeDesconto(funcionario)
        } else if (funcionario.cargo == Cargo.DBA || funcionario.cargo == Cargo.TESTADOR) {
            return quinzeOuVinteCincoPorCentoDeDesconto(funcionario)
        }
        throw RuntimeException("Funcionario invalido")
    }

    private fun quinzeOuVinteCincoPorCentoDeDesconto(funcionario: Funcionario): Double {
        return if (funcionario.salario < 2500) {
            funcionario.salario * 0.85
        } else funcionario.salario * 0.75
    }

    private fun dezOuVintePorCentoDeDesconto(funcionario: Funcionario): Double{
        if(funcionario.salario > 3000)
            return funcionario.salario * 0.8
        return funcionario.salario * 0.9
    }

}