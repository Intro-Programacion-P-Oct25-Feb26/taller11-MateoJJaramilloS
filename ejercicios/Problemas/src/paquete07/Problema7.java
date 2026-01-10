/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

/**
 *
 * @author reroes
 */
import java.util.Scanner;

public class Problema7 {

    public static void main(String[] args) {
        String[] ciudades = numeroCiudades();
        imprimirCiudades(ciudades);
    }

    public static String[] numeroCiudades() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número de ciudades que desea ingresar: ");
        int ciudades = entrada.nextInt();
        entrada.nextLine();

        String[] arreglo = new String[ciudades];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese ciudad " + (i + 1) + ": ");
            arreglo[i] = entrada.nextLine();
        }
        return arreglo;
    }

    public static void imprimirCiudades(String[] arreglo) {
        System.out.println("\nCiudades con 4 o 5 caracteres:");
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].length() == 4 || arreglo[i].length() == 5) {
                System.out.println(arreglo[i]);
            }
        }
    }
}
