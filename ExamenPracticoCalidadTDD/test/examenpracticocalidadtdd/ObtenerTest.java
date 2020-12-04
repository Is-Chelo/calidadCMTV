/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpracticocalidadtdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CHELO
 */
public class ObtenerTest {
    
    Obtener ob = new Obtener();
    public ObtenerTest() {
    }

    
    
    @Test
    public void obtenerMatriculado() {
        String esperado = "yamatriculado";
        String resultado = ob.obtenerAccion(true);
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void obtenerRegistrado() {
        String esperado = "yamatriculado";
        String resultado = ob.obtenerAccion(true,true);
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void esDocente() {
        String esperado = "nodestinado";
        String resultado = ob.obtenerAccion(false,true, true);
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void test4() {
        String esperado = "matricularse";
        String resultado = ob.obtenerAccion(false,true, true, false);
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void test5() {
        String esperado = "registrarse";
        String resultado = ob.obtenerAccion(true,"porConfirmar");
        assertEquals(esperado, resultado);
    }
    @Test
    public void test6() {
        String esperado = "matricularse";
        String resultado = ob.obtenerAccion(false, true, false, true, true);
        assertEquals(esperado, resultado);
    }
    
     @Test
    public void test7() {
        String esperado = "registrarse y matricularse";
        String resultado = ob.obtenerAccion(false, false);
        assertEquals(esperado, resultado);
    }
    
     @Test
    public void test8() {
        String esperado = "registrarse y matricularse";
        String resultado = ob.obtenerAccion(false, false);
        assertEquals(esperado, resultado);
    }
    
     @Test
    public void test9() {
        String esperado = "nodestinado";
        String resultado = ob.obtenerAccion(true, "si", false);
        assertEquals(esperado, resultado);
    }
    
    
     @Test
    public void test10() {
        String esperado = "registrarse y matricularse";
        String resultado = ob.obtenerAccion(true, false);
        assertEquals(esperado, resultado);
    }
}
