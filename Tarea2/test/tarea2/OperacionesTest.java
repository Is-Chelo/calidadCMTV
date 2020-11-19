/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CHELO
 */
public class OperacionesTest {

    public OperacionesTest() {
    }

    Operaciones op = new Operaciones();

    ;

    @Test
    public void testSuma() {
        int resultado = op.suma(4, 4);
        assertEquals(8, resultado);
    }

    @Test
    public void testSumaString() {
        String resultado = op.suma("a", "b");
        assertEquals("ab", resultado);
    }

    @Test
    public void testSumaArreglos() {
        int[] a = {2, 3, 41};
        int[] b = {1, 3, 1};

        int[] resultado = op.suma(a, b);
        int[] esperado = {3,6,42};
        assertEquals(resultado, resultado);
    }

}
