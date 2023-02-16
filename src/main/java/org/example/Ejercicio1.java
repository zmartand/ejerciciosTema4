package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    /*1. La nota media (versión 1)
Este algoritmo calcula la media de valores (por ejemplo, de las notas), introducidos por el usuario.
En primer lugar, el usuario indica el número de valores cuyo promedio desea conocer.
Seguidamente, introduce todos estos valores. Finalmente, se muestra la media de estos valores.

*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNotas = 0;
        double nota = 0;
        double suma = 0;
        double media = 0;
        try {
            System.out.println("Introduzca el número de notas: ");
            numNotas = sc.nextInt();
            for (int i = 0; i < numNotas; i++) {
                System.out.println("Introduzca la nota " + (i + 1) + ": ");
                nota = sc.nextDouble();
                suma += nota;
            }
            media = suma / numNotas;
            System.out.println("La media es: " + media);
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
