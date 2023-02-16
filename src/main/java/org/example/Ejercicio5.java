package org.example;

import java.util.Scanner;

public class Ejercicio5 {
    /*5. Ahora tengo que encontrarlo yo
Esta vez, el ordenador debe adivinar un número elegido por el usuario. El usuario le indica si el número es mayor (+), menor (-) o si lo ha encontrado (=).

Ejemplo de ejecución del algoritmo:

Elija un número del 1 al 100, luego presione cualquier tecla.
a
Pruebo con 45, ¿es mayor, menor o es el número (+/-/=)?
-
Pruebo con 10, ¿es mayor, menor o es el número (+/-/=)?
+
Pruebo con 22, ¿es mayor, menor o es el número (+/-/=)?
+
Pruebo con 27, ¿es mayor, menor o es el número (+/-/=)?
=
Fenomenal, lo he encontrado después de 4 intentos.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int numAleatorio = (int) (Math.random() * 100 + 1);
        String respuesta = "";
        try {
            System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla.");
            sc.nextLine();
            System.out.println("Pruebo con " + numAleatorio + ", ¿es mayor, menor o es el número (+/-/=)?");
            respuesta = sc.nextLine();
            while (!respuesta.equals("=")) {
                if (respuesta.equals("+")) {
                    numAleatorio = (int) (Math.random() * 100 + 1);
                    System.out.println("Pruebo con " + numAleatorio + ", ¿es mayor, menor o es el número (+/-/=)?");
                    respuesta = sc.nextLine();
                } else if (respuesta.equals("-")) {
                    numAleatorio = (int) (Math.random() * 100 + 1);
                    System.out.println("Pruebo con " + numAleatorio + ", ¿es mayor, menor o es el número (+/-/=)?");
                    respuesta = sc.nextLine();
                }
            }
            System.out.println("Fenomenal, lo he encontrado después de" + numAleatorio + " intentos.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
