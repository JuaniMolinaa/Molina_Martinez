package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int tamanioVector, numBuscado;

        System.out.println("Ingrese el tamaño para el vector");
        tamanioVector = obj.nextInt();
        int vector[] = new int[tamanioVector];

        for (int i = 0; i < tamanioVector - 1; i++) {
            vector[i] = (int) (Math.random() * 10);
        }

        System.out.println("Ingrese un número a buscar en el arreglo");
        numBuscado = obj.nextInt();

        buscarNum(vector, numBuscado, tamanioVector);

    }//cierra main

    public static void buscarNum(int[] vector, int numBuscado, int tamanioVector) {
        int contNums = 0;

        for (int i = 0; i < tamanioVector - 1; i++) {
            if (vector[i] == numBuscado) {
                System.out.println("Se encontró el número en la posicion [" + i + "]");
                contNums++;
            }
        }

        if (contNums == 0) {
            System.out.println("El número " + numBuscado + " no se encontró en el arreglo");
        }

    }//cierra llenarVector
}//cierra clase

