package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String frase, fraseMayusculas, fraseMinusculas;
        System.out.println("Ingresa una frase");
        frase = obj.nextLine();
        
        System.out.println("Frase en mayúsculas:");
        fraseMayusculas = frase.toUpperCase();
        System.out.println(fraseMayusculas);
        
        System.out.println("Frase en minúsculas:");
        fraseMinusculas = frase.toLowerCase();
        System.out.println(fraseMinusculas);

    }
}
