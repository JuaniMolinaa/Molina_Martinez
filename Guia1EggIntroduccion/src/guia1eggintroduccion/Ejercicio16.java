package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String cadenaUsuario;
        char ultCaracter;
        boolean salir = false;
        int secuenciaCorrecta = 0;
        int secuenciaIncorrecta = 0;

        do {
            System.out.println("Ingrese la cadena");
            cadenaUsuario = obj.nextLine();
            ultCaracter = cadenaUsuario.charAt(cadenaUsuario.length() - 1);
            if (cadenaUsuario.equals("&&&&&")) {

                salir = true;
            }
            if (cadenaUsuario.length() == 5 && cadenaUsuario.charAt(0) == ('X') && ultCaracter == ('O')) {
                secuenciaCorrecta++;
            } else {
                secuenciaIncorrecta++;
            }

        } while (!salir);

        System.out.println("LECTURAS CORRECTAS:" + secuenciaCorrecta);
        System.out.println("LECTURAS INCORRECTAS:" + (secuenciaIncorrecta - 1));

    }//ciera main

}//cierra clase

