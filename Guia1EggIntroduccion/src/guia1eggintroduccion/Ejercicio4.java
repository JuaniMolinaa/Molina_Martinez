package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("Ingrese los grados centígrados");
        gradosC = obj.nextDouble();

        gradosF = 32 + (9 * gradosC / 5);

        System.out.println(gradosC + " grados centígrados equivalen a " + gradosF + " grados Fahrenheit.");

    }
}
