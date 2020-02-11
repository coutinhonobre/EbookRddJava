package com.example.ebooktddjava

import com.example.ebooktddjava.capitulo04.CalculadoraDeSalario
import com.example.ebooktddjava.capitulo04.Cargo
import com.example.ebooktddjava.capitulo04.Funcionario
import org.junit.Assert.assertEquals
import org.junit.Test

class Capitulo04CalculadoraDeSalarioTest {


    @Test
    fun deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite(){

        var calculadora = CalculadoraDeSalario();
        var desenvolvedor = Funcionario(
            "Mauricio", 1500.0, Cargo.DESENVOLVEDOR
        )

        var salario = calculadora.calculaSalario(desenvolvedor)
        assertEquals(1500.0 * 0.9, salario, 0.0001)

    }

    @Test
    fun deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite(){
        var calculadora = CalculadoraDeSalario()
        var desenvolvedor = Funcionario(
            "Mauricio", 4000.0, Cargo.DESENVOLVEDOR
        )

        var salario = calculadora.calculaSalario(desenvolvedor)

        assertEquals(4000.0 * 0.8, salario, 0.00001)
    }

    @Test
    fun deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite(){
        var calculadora = CalculadoraDeSalario()
        var dba = Funcionario("Mauricio", 500.0, Cargo.DBA)

        var salario = calculadora.calculaSalario(dba)

        assertEquals(500.0 * 0.85, salario, 0.00001)
    }


    @Test
    fun deveCalcularSalarioParaDBAsComSalarioAcimaDoLimite(){
        var calculadora = CalculadoraDeSalario()
        var dba = Funcionario("Mauricio", 5300.9, Cargo.DBA)

        var salario = calculadora.calculaSalario(dba)

        assertEquals(5300.9 * 0.75, salario, 0.00001)
    }

}