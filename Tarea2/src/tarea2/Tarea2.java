/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.Scanner;

/**
 *
 * @author CHELO
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones op = new Operaciones();

        Scanner scn = new Scanner(System.in);
        System.out.print("·introduzca un numero:");
        int n1, n2;
        n1 = scn.nextInt();
        System.out.print("·introduzca un otro numero:");
        n2 = scn.nextInt();
        op.suma(n1, n2);
    }

}
