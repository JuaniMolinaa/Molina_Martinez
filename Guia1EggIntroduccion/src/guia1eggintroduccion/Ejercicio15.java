package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num1, num2, opcion, suma, resta, multiplicacion;
        String quiereSalir;
        float division;
        boolean numerosCorrectos = false;

        do {
            System.out.println("Ingrese el primer número entero positivo");
            num1 = obj.nextInt();
            System.out.println("Ingrese el segundo número entero positivo");
            num2 = obj.nextInt();
            if (num1 > 0 && num2 > 0) {
                numerosCorrectos = true;
            } else {
                System.out.println("Uno de los números ingresados no es positivo");
            }
        } while (numerosCorrectos == false);
        
        boolean salir = false;
               
        while (!salir) {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");
            opcion = obj.nextInt();
            switch (opcion) {

                case 1:
                    suma = num1 + num2;
                    System.out.println("Suma de los números ingresados: " + suma);
                    salir = false;
                    break;
                case 2:
                    resta = num1 - num2;
                    System.out.println("Resta de los números ingresados: " + resta);
                    salir = false;

                    break;
                case 3:
                    multiplicacion = num1 * num2;
                    System.out.println("Multiplicación de los números ingresados: " + multiplicacion);
                    salir = false;
                    break;
                case 4:
                    division = num1 / num2;
                    System.out.println("División de los números ingresados: " + division);
                    salir = false;
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    quiereSalir = obj.next();

                    if (quiereSalir.equalsIgnoreCase("S") || quiereSalir.equalsIgnoreCase("s")) {
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("opción inválida");
                    salir = false;
            }
        }
    }//cierra main
}//cierra clase

