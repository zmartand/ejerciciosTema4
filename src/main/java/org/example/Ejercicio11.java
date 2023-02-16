package org.example;

import java.util.Scanner;

public class Ejercicio11 {
    /*11. Arte ASCII 2
Dibujar una de las siguientes formas, según la elección del usuario:
Images/04RI04.png
Ejemplo de ejecución:
¿tamaño?
5
¿Carácter?
#
¿forma?
1 - rectángulo con relleno
2 - rectángulo sin relleno
3 - cruz de San Andrés
4 - triángulo rectángulo
5 - rombo
6 - ajedrezado
2
Images/04RI05.png
Observe que el número de líneas es igual al número de columnas.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño = 0;
        String caracter = "";
        int forma = 0;
        try {
            System.out.println("¿tamaño?");
            tamaño = sc.nextInt();
            System.out.println("¿Carácter?");
            caracter = sc.next();
            System.out.println("¿forma?");
            System.out.println("1 - rectángulo con relleno");
            System.out.println("2 - rectángulo sin relleno");
            System.out.println("3 - cruz de San Andrés");
            System.out.println("4 - triángulo rectángulo");
            System.out.println("5 - rombo");
            System.out.println("6 - ajedrezado");
            forma = sc.nextInt();
            switch (forma) {
                case 1:
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                            System.out.print(caracter);
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                            if (i == 0 || i == tamaño - 1 || j == 0 || j == tamaño - 1) {
                                System.out.print(caracter);
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                            if (i == j || i + j == tamaño - 1) {
                                System.out.print(caracter);
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                            if (i == 0 || i == tamaño - 1 || j == 0 || j == tamaño - 1 || i == j || i + j == tamaño - 1) {
                                System.out.print(caracter);
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                            if (i == 0 || i == tamaño - 1 || j == 0 || j == tamaño - 1 || i == j || i + j == tamaño - 1 || i == tamaño / 2 || j == tamaño / 2) {
                                System.out.print(caracter);
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                            if (i % 2 == 0) {
                                if (j % 2 == 0) {
                                    System.out.print(caracter);
                                } else {
                                    System.out.print(" ");
                                }
                            } else {
                                if (j % 2 == 0) {
                                    System.out.print(" ");
                                } else {
                                    System.out.print(caracter);
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Error: " + forma + " no es una opción válida");
                    break;

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}