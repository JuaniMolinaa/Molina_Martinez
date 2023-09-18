package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num, cantNums, sumatoria;
        boolean salir = false;
        sumatoria = 0;
        cantNums = 0;

        while (salir == false) {
            System.out.println("Ingrese un número");
            num = obj.nextInt();
            if (num > 0) {
                cantNums++;
                sumatoria = sumatoria + num;
            } else {
                if (num < 0) {
                    cantNums++;
                    sumatoria = sumatoria + 0;
                } else {
                    cantNums = cantNums + 0;
                    System.out.println("Se capturó el número cero");
                    salir = true;
                }
            }
            if (cantNums == 20) {
                salir = true;
            }
        }
        System.out.println("La sumatoria de los números positivos ingresados es: " + sumatoria);
    }//cierra main
}//cierra clase

