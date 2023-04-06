/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales
 * son idénticas. Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. El programa
 * deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package ejercicio06;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int[][] matrizMagica = new int[3][3];
        llenarMatriz(matrizMagica);
        mostrarMatriz(matrizMagica);
        System.out.println("");
        if (esMagica(matrizMagica)) {
            System.out.println("La Matriz es magica");
        } else {
            System.out.println("La Matriz no es magica");
        }
    }

    public static void llenarMatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor de la fila " + i + " y columna " + j);
                int v = sc.nextInt();
                matriz[i][j] = v;
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean esMagica(int[][] matriz) {
        int sumaFila = 0;
        int fila0 = 0;
        int fila1 = 0;
        int fila2 = 0;
        for (int i = 0; i < 3; i++) {
            sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
            }
            if (i == 0) {
                fila0 = sumaFila;
            }
            if (i == 1) {
                fila1 = sumaFila;
            }
            if (i == 2) {
                fila2 = sumaFila;
            }
            if (fila0 != fila1 && fila1 != fila2 && fila2 != fila1) {
                return false;
            }
        }
        int sumaColumna = 0;
        int columna0 = 0;
        int columna1 = 0;
        int columna2 = 0;
        for (int j = 0; j < 3; j++) {
            sumaColumna = 0;
            for (int i = 0; i < 3; i++) {
                sumaColumna += matriz[i][j];
            }
            if (j == 0) {
                columna0 = sumaColumna;
            }
            if (j == 1) {
                columna1 = sumaColumna;
            }
            if (j == 2) {
                columna2 = sumaColumna;
            }
            if (columna0 != columna1 && columna1 != columna2 && columna2 != columna0) {
                return false;
            }
        }
        int sumaDiagonal = 0;
        for (int i = 0; i < 3; i++) {
            sumaDiagonal += matriz[i][i];
        }
        int sumaDiagonalInversa = 0;
        int j = 2;
        for (int i = 0; i < 3; i++) {
            sumaDiagonalInversa += matriz[i][j];
            j--;
        }
        return !(sumaDiagonalInversa != sumaDiagonal || sumaDiagonalInversa != sumaColumna || sumaDiagonalInversa != sumaFila);
    }
}
