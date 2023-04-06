/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio03;

public class Ejercicio3 {

    public static void main(String[] args) {
        int[] vec = new int[10000];
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) Math.round(Math.random() * 10000);
        }
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }
        String numApalabra;
        int unDigt = 0;
        int dosDigt = 0;
        int tresDigt = 0;
        int cuatroDigt = 0;
        int cincoDigt = 0;
        for (int i = 0; i < vec.length; i++) {
            numApalabra = String.valueOf(vec[i]);
            switch (numApalabra.length()) {
                case 1 ->
                    unDigt++;
                case 2 ->
                    dosDigt++;
                case 3 ->
                    tresDigt++;
                case 4 ->
                    cuatroDigt++;
                case 5 ->
                    cincoDigt++;
            }
        }
        System.out.println(" ");
        System.out.println("Un Digito: " + unDigt);
        System.out.println("Dos Digito: " + dosDigt);
        System.out.println("Tres Digito: " + tresDigt);
        System.out.println("Cuatro Digito: " + cuatroDigt);
        System.out.println("Cinco Digito: " + cincoDigt);
    }
}
