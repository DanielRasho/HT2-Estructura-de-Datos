package App_main.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void evaluate() {
        Calculadora calc = new Calculadora();
        double resultado = calc.evaluate("213+*");
        assertEquals(resultado, 8.0d, 0.2d);
    }
}