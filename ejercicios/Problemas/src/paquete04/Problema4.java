/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        String nombre;
        String cedula;

        System.out.println("Ingrese la opción que desea calcular\n1.Calcular valor de la planilla de luz\n2.Calcular el predio del inmueble");
        opcion = entrada.nextInt();
        entrada.nextLine();

        do {
            if (opcion == 1) {
                System.out.println("Ingrese su nombre:");
                nombre = entrada.nextLine();
                System.out.println("Ingrese su cédula:");
                cedula = entrada.nextLine();
                calcularValorLuz(nombre, cedula);
            } else {
                if (opcion == 2) {
                    System.out.print("Ingrese su nombre:");
                    nombre = entrada.nextLine();
                    System.out.print("Ingrese su cédula:");
                    cedula = entrada.nextLine();
                    calcularPredio(nombre, cedula);
                } else {
                    System.out.println("Escoja una opción válida");
                    System.out.println("Ingrese nuevamente la opción que desea calcular\n1.Calcular valor de la planilla de luz\n2.Calcular el predio del inmueble");
                    opcion = entrada.nextInt();
                    entrada.nextLine();
                }
            }

        } while (opcion != 1 && opcion != 2);
    }
    public static void calcularValorLuz (String nombre, String cedula){
        Scanner entrada = new Scanner(System.in);
        String reporte;
        double valorKilovatio ;
        double numeroKilovatio;
        double valorTotal;
        System.out.println("Ingrese el valor del kilovatio:");
        valorKilovatio = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese el número de kilovatios consumiedos en el mes:");
        numeroKilovatio = entrada.nextDouble();
        valorTotal = valorKilovatio * numeroKilovatio;
        reporte = String.format("Cliente %s con cédula %s debe cancelar el valor de $%.2f", nombre, cedula, valorTotal);
        System.out.print(reporte);
    }
    public static void calcularPredio (String nombre, String cedula){
        Scanner entrada = new Scanner(System.in);
        String reporte ;
        double valorInmueble;
        double valorTotal;
        System.out.println("Ingrese el valor del inmueble:");
        valorInmueble = entrada.nextDouble();
        entrada.nextLine();
        valorTotal = valorInmueble * 0.02;
        reporte = String.format("Cliente %s con cédula %s tiene un inmueble valorado en %.2f y tiene que pagar de predio $ %.2f", nombre, cedula, valorInmueble, valorTotal);
        System.out.print(reporte);
    }
}

