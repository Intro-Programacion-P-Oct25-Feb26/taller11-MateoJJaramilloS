/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        System.out.println("Escoja que area quiere sacar\n1: Área Cuadrado\n2: Área Triángulo\n3: Área Rectángulo\nIngrese la opción: ");
        opcion = entrada.nextInt();
        do {
            if (opcion == 1) {
                obtenerAreaCuadrado(); 
            } else {
                if (opcion == 2) {
                    obtenerAreaTriangulo();
                } else {
                    if (opcion == 3) {
                        obtenerAreaRectangulo();
                    }
                }
            }

        } while (opcion >= 4);
    }
    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un lado de cuadrado:"); 
        double lado= entrada.nextDouble();
        double area = lado* lado;
        System.out.printf("El área del cuadrado es: %s", area);
    }
    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la base del triángulo:"); 
        double base= entrada.nextDouble();
        System.out.println("Ingrese la altura del triángulo:"); 
        double altura= entrada.nextDouble();
        double area = (base*altura)/2;
        System.out.printf("El área del triángulo es: %s", area);
    }
    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo:"); 
        double base= entrada.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:"); 
        double altura= entrada.nextDouble();
        double area = base*altura;
        System.out.printf("El área del rectángulo es: %s", area);
    }
}
