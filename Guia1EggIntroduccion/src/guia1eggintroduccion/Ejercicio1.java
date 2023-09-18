package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int num1, num2, suma;
        System.out.println("Ingrese el primer número entero");
        num1 = obj.nextInt();
        System.out.println("Ingrese el segundo número entero");
        num2 = obj.nextInt();

        suma = num1 + num2;
        System.out.println("El resultado de la suma de los números es: " + suma);

    }
}