package com.example.ebooktddjava

import com.example.ebooktddjava.capitulo03.ConversorDeNumeroRomano
import org.junit.Assert.assertEquals
import org.junit.Test


class Capitulo03ConversorDeNumeroRomanoTest {

    @Test
    fun deveEntenderOsSimboloI(){

        var romano = ConversorDeNumeroRomano()
        var numero = romano.converte("I")
        assertEquals(1, numero)
    }
    @Test
    fun deveEntenderOSimboloV(){
        var romano = ConversorDeNumeroRomano()
        var numero = romano.converte(("V"))
        assertEquals(5, numero)
    }

    @Test
    fun deveEntenderOSimboloX(){
        var romano = ConversorDeNumeroRomano()
        var numero = romano.converte(("X"))
        assertEquals(10, numero)
    }

    @Test
    fun deveEntenderDoisSimbolosComoII(){
        var romano = ConversorDeNumeroRomano()
        var numero = romano.converte("II")
        assertEquals(2, numero)
    }

    @Test
    fun deveEntenderDoisSimbolosComoVI(){
        var romano = ConversorDeNumeroRomano()
        var numero = romano.converte("VI")
        assertEquals(6, numero)
    }

    @Test
    fun deveEntenderQuatroSimbolosDoisADoisComoXXII(){
        var romano = ConversorDeNumeroRomano()
        var numero = romano.converte("XXII")
        assertEquals(22, numero)
    }

    @Test
    fun deveEntenderNumerosComoIX(){
        var romano = ConversorDeNumeroRomano()
        var numero = romano.converte("IX")
        assertEquals(9, numero)
    }

    @Test
    fun deveEntenderNumerosComplexosComoXXIV() {
        val romano = ConversorDeNumeroRomano()
        val numero = romano.converte("XXIV")
        assertEquals(24, numero)
    }

}