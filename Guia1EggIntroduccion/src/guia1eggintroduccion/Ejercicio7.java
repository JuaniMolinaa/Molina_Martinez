package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un número entero");
        num = obj.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

    }//cierra main

}//cierra clase
