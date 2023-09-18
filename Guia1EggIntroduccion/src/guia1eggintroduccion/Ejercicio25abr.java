package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio25abr {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        boolean matrizBien = false;

        while (matrizBien == false) {
            System.out.println("Rellene la matriz con números entre 1 a 9");
            matrizBien = llenarMatriz(matriz, obj);
        }

    }//cierra main

    public static boolean llenarMatriz(int[][] matriz, Scanner obj) {
        boolean matrizCorrecta;
        int numerosMal = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("[" + i + "][" + j + "]:");
                matriz[i][j] = obj.nextInt();
                if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    numerosMal = numerosMal++;
                }
            }
        }
        if (numerosMal > 0) {
            matrizCorrecta = false;
        } else {
            matrizCorrecta = true;
        }
        return matrizCorrecta;
    }

}//ciera clase
/*          do {
                System.out.println("\nIngrese un número comprendido entre 1 y 20");
                num = obj.nextInt();
            } while (num < 1 || num > 20);
 */
