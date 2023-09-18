package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio24Bien {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        int matriz[][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese el valor [" + i + "][" + j + "] :");
                matriz[i][j] = obj.nextInt();
            }
        }

        int matrizT[][] = new int[3][3];
        boolean band = true;	//Se crea una variable bandera
        boolean band2 = true;	//Se crea una variable bandera 2

        //Imprimir la matriz
        System.out.println("La matriz es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Determinar si es simétrica
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    band = false;
                    i = 3;
                    break;
                }
            }
        }

        //Determinar si es antisimetrica
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[j][i] = (-1) * matriz[j][i];
                matrizT[i][j] = matriz[j][i];
                matriz[j][i] = (-1) * matriz[j][i];
                if (matrizT[i][j] != matriz[i][j]) {
                    band2 = false;
                    i = 3;
                    break;
                }
            }
        }

        //Mostrar si es simétrica o no
        if (band) {
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("La matriz NO es simetrica");
        }

        //Mostrar si es antisimetrica o no
        if (band2) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz NO es antisimetrica");
        }
    }

}
