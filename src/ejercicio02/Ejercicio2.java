/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
 * El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package ejercicio02;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vec = new int[100];
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) Math.round(Math.random() * 100);
        }
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " - ");
        }
        System.out.println("");
        System.out.println("Valor a buscar:");
        int valor = sc.nextInt();
        for (int i = 0; i < vec.length; i++) {
            if (valor == vec[i]) {
                System.out.println("se encontro el valor en la posicion: " + i);
            }
        }
    }
}
