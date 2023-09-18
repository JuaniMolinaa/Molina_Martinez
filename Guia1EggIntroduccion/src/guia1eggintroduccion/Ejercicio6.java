package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingrese un número entero");
        num1 = obj.nextInt();
        System.out.println("Ingrese otro número entero");
        num2 = obj.nextInt();

        if (num1 == num2) {
            System.out.println("Los números son iguales");
        } else {
            if (num1 > num2) {
                System.out.println("El número mayor es el " + num1);
            } else {
                System.out.println("El número mayor es el " + num2);
            }

        }
    }//cierra main
}//cierra clase
