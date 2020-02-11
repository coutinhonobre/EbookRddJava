package com.example.ebooktddjava.capitulo04

class CalculadoraDeSalario {

    fun calculaSalario(funcionario: Funcionario): Double{
        if(funcionario.cargo == Cargo.DESENVOLVEDOR) {
            if(funcionario.salario > 3000) return funcionario.salario * 0.8;
            return funcionario.salario * 0.9;
        }else if (funcionario.cargo == Cargo.DBA){
            if (funcionario.salario <= 2500.0) return funcionario.salario * 0.85
            return funcionario.salario * 0.75
        }
        return 0.0;
    }
}