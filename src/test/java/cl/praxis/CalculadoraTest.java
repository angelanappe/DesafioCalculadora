package cl.praxis;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.logging.Logger;

@DisplayName("Test clase Calculadora")
public class CalculadoraTest {
    private static Logger logger = Logger.getLogger("cl.praxis.Calculadora");
    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testSumar() {
        assertEquals(8, calculadora.sumar(6, 2));
    }

    @Test
    public void testRestar() {
        assertEquals(4, calculadora.restar(6, 2));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(12, calculadora.multiplicar(6, 2));
    }

    @Test
    public void testDividir() {
        assertEquals(3, calculadora.dividir(6, 2));
    }

    @Test
    public void testDividirPorCero() {
        try {
            calculadora.dividir(6, 0);
            fail("Debe mostrar IllegalArgumentException si se divide por 0.");
        } catch (IllegalArgumentException e) {
            assertEquals("No se puede dividir por 0.", e.getMessage());
        }
    }
}
