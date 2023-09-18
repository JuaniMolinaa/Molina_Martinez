package guia1eggintroduccion;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int tamanioVector;

        System.out.println("Ingrese el tamaño del vector");
        tamanioVector = obj.nextInt();
        int vector[] = new int[tamanioVector];
        llenarArreglo(vector, tamanioVector, obj);
        contarDigitos(vector, tamanioVector, obj);
    }//cierra main

    public static void llenarArreglo(int[] vector, int tamanioVector, Scanner obj) {

        System.out.println("RELLENE EL ARREGLO");
        for (int i = 0; i < tamanioVector ; i++) {
            System.out.println("Valor de la posición [" + i + "]");
            vector[i] = obj.nextInt();
        }

    }//cierra llenarArreglo

    public static void contarDigitos(int[] vector, int tamanioVector, Scanner obj) {

        int unDigito, dosDigitos, tresDigitos, cuatroDigitos, cincoDigitos;
        String nums;
        unDigito = 0;
        dosDigitos = 0;
        tresDigitos = 0;
        cuatroDigitos = 0;
        cincoDigitos = 0;

        for (int i = 0; i < tamanioVector ; i++) {
            nums = Integer.toString(vector[i]);
            if (nums.length() == 1) {
                unDigito++;
            } else {
                if (nums.length() == 2) {
                    dosDigitos++;
                } else {
                    if (nums.length() == 3) {
                        tresDigitos++;
                    } else {
                        if (nums.length() == 4) {
                            cuatroDigitos++;
                        } else {
                            if (nums.length() == 5) {
                                cincoDigitos++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Numeros de 1 dígito:" + unDigito);
        System.out.println("Numeros de 2 dígitos:" + dosDigitos);
        System.out.println("Numeros de 3 dígitos:" + tresDigitos);
        System.out.println("Numeros de 4 dígitos:" + cuatroDigitos);
        System.out.println("Numeros de 5 dígitos:" + cincoDigitos);
    }//cierra contarDigitos
}//cierra clase
