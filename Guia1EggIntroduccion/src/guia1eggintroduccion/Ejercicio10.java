package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = obj.nextLine();

        if (frase.substring(0, 1).equals('A')) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }//cierra main

}//cierra clase

