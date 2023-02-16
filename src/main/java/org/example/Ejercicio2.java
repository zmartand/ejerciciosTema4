package org.example;

import java.util.Scanner;

public class Ejercicio2 {
    /*La nota media (versión 2)
El objetivo sigue siendo realizar el cálculo de la media de un conjunto de valores introducidos por el usuario, pero el usuario ya no tiene que indicar inicialmente el número de valores.
Introduce los valores y cuando ha terminado, introduce un valor concreto (-1), para indicar que ha terminado de introducir valores.
Ejemplo de ejecución del algoritmo:
¿Nota (-1 para terminar)?
9
¿Nota (-1 para terminar)?
18
¿Nota (-1 para terminar)?
-1
La nota media es 13,5*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNotas = 0;
        double nota = 0;
        double suma = 0;
        double media = 0;
        try {
            System.out.println("Introduzca la nota (-1 para terminar): ");
            nota = sc.nextDouble();
            while (nota != -1) {
                suma += nota;
                numNotas++;
                System.out.println("Introduzca la nota (-1 para terminar): ");
                nota = sc.nextDouble();
            }
            media = suma / numNotas;
            System.out.println("La media es: " + media);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
