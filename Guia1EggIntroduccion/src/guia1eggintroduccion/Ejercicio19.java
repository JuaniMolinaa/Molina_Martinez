package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String moneda;
        int euros;
        System.out.println("Ingrese la cantidad de €uros a convertir");
        euros = obj.nextInt();

        System.out.println("Escriba la moneda a la que desea convertir: ");
        System.out.print("DOLAR - LIBRA - YEN\n");
        moneda = obj.next();

        convertirMoneda(euros, moneda);

    }//cierra main

    public static void convertirMoneda(int euro, String moneda) {

        moneda = moneda.toLowerCase();
        double libra, dolar, yen;
        libra = euro * 0.86;
        dolar = euro * 1.28611;
        yen = euro * 129.852;
        
        switch (moneda) {
            case "dolar":
                System.out.println("€" + euro + " son " + dolar + " dólares");
                break;
            case "libra":
                System.out.println("€" + euro + " son " + libra + " libras");
                break;
            case "yen":
                System.out.println("€" + euro + " son " + yen + " yenes");
                break;
            default:
                System.out.println("NO HA ELEJIDO UNA MONEDA VÁLIDA");
        }

    }//cierra convertirMoneda

}//cierra clase
