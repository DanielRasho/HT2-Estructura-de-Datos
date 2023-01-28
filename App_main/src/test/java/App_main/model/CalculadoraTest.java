package App_main.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void evaluate() {
        Calculadora calc = new Calculadora();
        double resultado = calc.evaluate("11+");
        assertEquals(resultado, 2.0d);
    }
}