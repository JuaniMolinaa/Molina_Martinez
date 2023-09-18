package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int num;
        System.out.println("Ingrese números comprendidos entre 1 y 20");

        for (int i = 0; i < 4; i++) {
            do {
                System.out.println("");
                num = obj.nextInt();
            } while (num < 1 || num > 20);

            System.out.print(num + "");
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
        }
    }//cierra main
}//cierra clase

