import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest {

    @Test
    fun somaTest(){
        assertEquals(3.0, Calculadora.soma(1.0, 2.0))
    }
    @Test
    fun subTest(){
        assertEquals(3.0, Calculadora.sub(4.0, 1.0))
    }
    @Test
    fun multTest(){
        assertEquals(6.0, Calculadora.mult(3.0, 2.0))
    }
    @Test
    fun divTest(){
        assertEquals(5.0, Calculadora.div(10.0, 2.0))
    }

}