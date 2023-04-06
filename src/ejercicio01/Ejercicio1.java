/*
 * Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente
 */
package ejercicio01;

public class Ejercicio1 {

    public static void main(String[] args) {
        int[] vec = new int[100];
        for (int i = 0; i < 100; i++) {
            vec[i] = 100 - i;
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(vec[i] + " - ");
        }
    }
}
