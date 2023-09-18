package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double nota;

        do {

            System.out.println("Ingrese una nota entre 0 y 10 ");
            nota = obj.nextDouble();

        } while (nota < 0 || nota > 10);

    }//cierra main

}//cierra clase
