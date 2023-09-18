package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int tamanioCuadrado;
        System.out.println("Ingrese el tamaño del cuadrado");
        tamanioCuadrado = obj.nextInt();

        for (int i = 0; i < tamanioCuadrado; i++) {
            for (int j = 0; j < tamanioCuadrado; j++) {
                if (i == 0 || i == tamanioCuadrado - 1 || j == 0 || j == tamanioCuadrado - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }//cierra main
}//cierra clase

