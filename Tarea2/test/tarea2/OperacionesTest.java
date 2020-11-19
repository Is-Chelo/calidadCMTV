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
    
    Operaciones op = new Operaciones();;

    @Test
    public void testSuma() {
        int resultado = op.suma(4,4);
        assertEquals(8,resultado);
    }
    
    @Test
    public void testResta() {
        int resultado = op.resta(1,4);
        int esperado = -3;
        assertEquals(esperado,resultado);
    }
    @Test
    public void testMultiplicacion() {
        int resultado = op.multiplicacion(1,4);
        int esperado = 4;
        assertEquals(esperado,resultado);
    }
    @Test
    public void testDivision() {
        double resultado = op.division(1,0);
        double esperado = 0;
        assertEquals(esperado,resultado, 0.0);
    }
    
    
    @Test
    public void testDivision1() {
        double resultado = op.division(3,1);
        double esperado = 3;
        assertEquals(esperado,resultado, 0.0);
    }
}
