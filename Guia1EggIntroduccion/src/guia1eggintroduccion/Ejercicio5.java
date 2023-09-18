package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num, doble, triple;

        System.out.println("Ingrese un número entero");
        num = obj.nextInt();
        doble = num * 2;
        triple = num * 3;
        double raizCuadrada = Math.sqrt(num);

        System.out.println("El doble de " + num + " es: " + doble + "\nEl triple de " + num + ""
                + " es: " + triple + "\nLa raíz cuadrada de " + num + " es: " + raizCuadrada);
    }

}
