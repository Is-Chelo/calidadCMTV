/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author CHELO
 */
public class Operaciones {
    int a;
    int b;
    public Operaciones() {
        
    }

    public Operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int suma(int a, int b){
        return a+b;
    }
    

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    String suma(String a, String b) {
        return a+b;
    }

    int[] suma(int[] a, int[] b) {
        int[] auxi=new int[a.length];
        for (int i = 0; i < a.length ; i++) {
            auxi[i] = a[i]+b[i];
        }
        return auxi;
    }

    
    
}
