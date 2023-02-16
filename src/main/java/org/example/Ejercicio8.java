package org.example;

import java.util.Scanner;

public class Ejercicio8 {
    /*8. Visualización de citas de películas (versión 2)
Retomar el algoritmo anterior, modificándolo para que no se muestre siempre la misma cita de una película,
sino que haya dos o tres y presente aleatoriamente una de ellas.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int cita = 0;
        try {
            do {
                System.out.println("1 - Una cita de la ciudad del miedo");
                System.out.println("2 - Una cita de James Bond");
                System.out.println("3 - Una cita de la vida es un largo río tranquilo");
                System.out.println("4 - Una cita de Star Wars");
                System.out.println("5 - Salir de esta magnífica aplicación");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        cita = (int) (Math.random() * 3 + 1);
                        switch (cita) {
                            case 1:
                                System.out.println("Cuidado, es una auténtica carnicería");
                                break;
                            case 2:
                                System.out.println("¿Qué es el amor?");
                                break;
                            case 3:
                                System.out.println("Yo soy tu padre");
                                break;
                        }
                        break;
                    case 2:
                        cita = (int) (Math.random() * 2 + 1);
                        switch (cita) {
                            case 1:
                                System.out.println("Me llamo Bond, James Bond");
                                break;
                            case 2:
                                System.out.println("¿Qué es el amor?");
                                break;
                        }
                        break;
                    case 3:
                        cita = (int) (Math.random() * 2 + 1);
                        switch (cita) {
                            case 1:
                                System.out.println("¿Qué es el amor?");
                                break;
                            case 2:
                                System.out.println("Yo soy tu padre");
                                break;
                        }
                        break;
                    case 4:
                        cita = (int) (Math.random() * 2 + 1);
                        switch (cita) {
                            case 1:
                                System.out.println("Me llamo Bond, James Bond");
                                break;
                            case 2:
                                System.out.println("Yo soy tu padre");
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                        break;
                }
            } while (opcion != 5);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
