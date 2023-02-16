package org.example;

import java.util.Scanner;

public class Ejercicio3 {
    /*3. La nota media (versión 3)
Modificar el algoritmo anterior para mostrar además el porcentaje de notas superiores a 10/20.
Ejemplo de ejecución del algoritmo:
¿Nota (-1 para terminar)?
14
¿Nota (-1 para terminar)?
12
¿Nota (-1 para terminar)?
9
¿Nota (-1 para terminar)?
7
¿Nota (-1 para terminar)?
10
¿Nota (-1 para terminar)?
-1
Media = 10,4 (60 % ≥10)*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNotas = 0;
        double nota = 0;
        double suma = 0;
        double media = 0;
        int numNotasSuperiores = 0;
        double porcentaje = 0;
        try {
            System.out.println("Introduzca la nota (-1 para terminar): ");
            nota = sc.nextDouble();
            while (nota != -1) {
                suma += nota;
                numNotas++;
                if (nota >= 10) {
                    numNotasSuperiores++;
                }
                System.out.println("Introduzca la nota (-1 para terminar): ");
                nota = sc.nextDouble();
            }
            media = suma / numNotas;
            porcentaje = (numNotasSuperiores * 100) / numNotas;
            System.out.println("La media es: " + media + " (" + porcentaje + "% ≥10)");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
