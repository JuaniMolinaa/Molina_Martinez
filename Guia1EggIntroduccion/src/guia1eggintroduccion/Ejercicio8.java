package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String frase;

        System.out.println("Ingrese una frase");
        frase = obj.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }//cierra main

}//cierra clase
