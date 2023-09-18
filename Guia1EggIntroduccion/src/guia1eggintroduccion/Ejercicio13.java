package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double limite, num, sumatoria;
        sumatoria = 0;
        do {
            System.out.println("Ingrese un número positivo para indicar el límite");
            limite = obj.nextDouble();
        } while (limite < 0);

        do {
            System.out.println("Ingrese un número");
            num = obj.nextDouble();
            sumatoria = num + sumatoria;

        } while (sumatoria <= limite);
        System.out.println("Se superó el límite ingresado, la sumatoria final es de:" + sumatoria);

    }//cierra main

}//cierra clase

