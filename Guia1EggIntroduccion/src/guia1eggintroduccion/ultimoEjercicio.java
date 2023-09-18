package guia1eggintroduccion;

import java.util.Scanner;

public class ultimoEjercicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matriz M
        int[][] M = new int[10][10];
        System.out.println("Ingrese los elementos de la matriz M:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        // Matriz P
        int[][] P = new int[3][3];
        System.out.println("Ingrese los elementos de la matriz P:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                P[i][j] = sc.nextInt();
            }
        }

        boolean encontrada = false;
        int fila = -1;
        int columna = -1;

        for (int i = 0; i <= 10 - 3; i++) {
            for (int j = 0; j <= 10 - 3; j++) {
                if (esSubmatriz(M, P, i, j)) {
                    encontrada = true;
                    fila = i;
                    columna = j;
                    break;
                }
            }
            if (encontrada) {
                break;
            }
        }

        if (encontrada) {
            System.out.println("La submatriz P está contenida en la matriz M.");
            System.out.println("Empieza en la fila " + fila + " y columna " + columna + " de la matriz M.");
        } else {
            System.out.println("La submatriz P no está contenida en la matriz M.");
        }

        // Mostrar matrices M y P
        System.out.println("\nMatriz M:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz P:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(P[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static boolean esSubmatriz(int[][] M, int[][] P, int fila, int columna) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (M[fila + i][columna + j] != P[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
