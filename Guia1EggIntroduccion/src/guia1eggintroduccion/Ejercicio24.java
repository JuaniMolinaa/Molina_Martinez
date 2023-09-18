package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int tamanioMatriz = obj.nextInt();
        int contador = 0;
        boolean esAntisimetrica = true;
        int matriz[][] = new int[tamanioMatriz][tamanioMatriz];
        int matrizTranspuesta[][] = new int[tamanioMatriz][tamanioMatriz];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese el valor [" + i + "][" + j + "] :");
                matriz[i][j] = obj.nextInt();
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("La matriz transpuesta es:");
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta.length; j++) {
                System.out.print("[" + matrizTranspuesta[i][j] + "]");
            }
            System.out.println("");
        }

        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta.length; j++) {
                matriz[j][i] = (-1) * matriz[j][i];
                matrizTranspuesta[i][j] = matriz[j][i];
                matriz[j][i] = (-1) * matriz[j][i];
                if (matrizTranspuesta[i][j] != matriz[i][j]) {
                    esAntisimetrica = false;
                    i = matriz.length;
                    break;
                }
            }
        }

        if (esAntisimetrica) {
            System.out.println("La matriz es anti simétrica");
        } else {
            System.out.println("La matriz no es anti simétrica");
        }

    }//cierra main
}//ciera clase

