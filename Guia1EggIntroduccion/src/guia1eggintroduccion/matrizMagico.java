package guia1eggintroduccion;

import java.util.Scanner;

public class matrizMagico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[4][4];
        int n, i, j, aux, suma, cont;

        System.out.println("Cuadrado Magico");
        System.out.println("Valores de 1 al 9 (los números no deben repetirse)");
        System.out.println("INGRESE LA MATRIZ");

        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++) {
                do {
                    System.out.print("Valor " + "(" + i + " " + j + ") ");
                    aux = sc.nextInt();
                } while (aux < 1 || aux > 9);
                mat[i][j] = aux;
            }
        }

        // Imprime la matriz
        for (i = 1; i <= 3; i++) {
            System.out.print("\n");
            for (j = 1; j <= 3; j++) {
                System.out.print(mat[i][j] + "\t");
            }
        }

        cont = 0;
        aux = 0;

        // Sumando filas
        for (i = 1; i <= 3; i++) {
            suma = 0;
            for (j = 1; j <= 3; j++) {
                suma += mat[i][j];
            }
            if (i == 1) {
                aux = suma;
            }
            if (aux == suma) {
                cont++;
            }
        }

        // Suma las columnas
        for (i = 1; i <= 3; i++) {
            suma = 0;
            for (j = 1; j <= 3; j++) {
                suma += mat[j][i];
            }
            if (aux == suma) {
                cont++;
            }
        }

        // Suma las diagonales
        suma = 0;
        suma += mat[1][1];
        suma += mat[2][2];
        suma += mat[3][3];
        if (aux == suma) {
            cont++;
        }

        suma = 0;
        suma += mat[1][3];
        suma += mat[2][2];
        suma += mat[3][1];
        if (aux == suma) {
            cont++;
        }

        if (cont == 8) {
            System.out.println("\nEs un cuadro mágico");
        } else {
            System.out.println("\nNo es un cuadro mágico");
        }

    }
}


