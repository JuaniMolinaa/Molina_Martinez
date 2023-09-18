package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        boolean numIncorrecto = false;
        int matrizCorrecta = 0;
        int matriz[][] = new int[3][3];

        System.out.println("Rellene la matriz con números del 1 al 9");

        do {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.println("Ingrese el valor de la posición [" + i + "," + j + "]");
                    matriz[i][j] = obj.nextInt();

                    if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                        matrizCorrecta = matrizCorrecta++;
                    }
                }
            }
            if (matrizCorrecta > 0) {
                System.out.println("\nHa ingresado un número fuera de rango (1 a 9), vuelva a llenar la matriz\n");
            } else {
                matrizCorrecta = 0;
            }
        } while (matrizCorrecta > 0);

        
    }//cierra main

}//ciera clase

