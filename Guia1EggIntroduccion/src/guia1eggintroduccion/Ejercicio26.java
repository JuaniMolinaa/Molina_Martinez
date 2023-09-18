package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int matrizTres[][] = new int[3][3];
        int matrizDiez[][] = new int[10][10];

        System.out.println("Rellene la matriz de 3x3");
        for (int i = 0; i < matrizTres.length; i++) {
            for (int j = 0; j < matrizTres.length; j++) {

                System.out.println("[" + i + "],[" + j + "]");
                matrizTres[i][j] = obj.nextInt();
            }
        }

        System.out.println("Rellene la matriz de 10x10");
        for (int i = 0; i < matrizDiez.length; i++) {
            for (int j = 0; j < matrizDiez.length; j++) {
                System.out.println("[" + i + "],[" + j + "]");
                matrizDiez[i][j] = obj.nextInt();
            }
        }

        for (int i = 0; i < matrizDiez.length; i++) {
            for (int j = 0; j < matrizDiez.length; j++) {
                
                
                
            }
        }

    }//cierra main

}//ciera clase

