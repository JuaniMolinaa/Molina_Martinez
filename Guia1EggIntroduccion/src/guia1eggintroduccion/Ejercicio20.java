package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int vector[] = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
        }
        mostrarVectorDescendentemente(vector);

    }//cierra main

    public static void mostrarVectorDescendentemente(int[] vector) {

        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
        }

    }//cierra llenarVector
}//cierra clase

