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
    
    
    
    
}
