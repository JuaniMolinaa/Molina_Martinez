package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int tipoMotor;
        System.out.println("Ingrese un número (de 1 a 4) para elegir el tipo de bomba");
        tipoMotor = obj.nextInt();

        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }

    }//cierra main
}//cierra clase

