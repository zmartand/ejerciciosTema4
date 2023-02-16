package org.example;

import java.util.Scanner;

public class Ejercicio4 {
    /*4. Adivine en qué número estoy pensando
Su algoritmo debe generar un número entero aleatorio entre 1 y 100. El usuario tiene que encontrar este número.
Con cada intento del usuario, se le debe indicar si el número es mayor, menor o igual al valor introducido.
El programa finaliza cuando el usuario ha encontrado el número.
Ejemplo de ejecución del algoritmo:
¿En qué número entre 1 y 100 estoy pensando?
23
Menor
15
Mayor
19
Menor
17
Bravo, lo ha encontrado*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int numAleatorio = (int) (Math.random() * 100 + 1);
        try {
            System.out.println("¿En qué número entre 1 y 100 estoy pensando?");
            num = sc.nextInt();
            while (num != numAleatorio) {
                if (num > numAleatorio) {
                    System.out.println("Menor");
                } else {
                    System.out.println("Mayor");
                }
                System.out.println("¿En qué número entre 1 y 100 estoy pensando?");
                num = sc.nextInt();
            }
            System.out.println("Bravo, lo ha encontrado");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
