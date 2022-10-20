/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class PracticaPg9 {

    /**
     * @param args the command line arguments
     */
    private final static int MAX = 50;
    private final static int MIN = 5;
    private final static String MSG1 = "Introduce el numero";
    private final static String MSG2 = "El numero introducido es: ";

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println(MSG1);
            numero = sc.nextInt();
        } while (numero < MIN || numero > MAX);
        System.out.println(MSG2 + numero);
    }
}
