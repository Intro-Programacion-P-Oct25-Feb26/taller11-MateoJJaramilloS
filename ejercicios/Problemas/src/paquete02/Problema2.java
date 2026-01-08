/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] viviendas = obtenerListadoViviendas();
        int[][] consumos = obtenerMatrizConsumos(viviendas);
        int[] sumaAnual = calcularSumaAnual(consumos);
        generarReporte(viviendas, sumaAnual);
    }

    public static String[] obtenerListadoViviendas() {
        Scanner entrada = new Scanner(System.in);
        String[] viviendas = new String[10];
        for (int i = 0; i < viviendas.length; i++) {
            System.out.println("Ingrese identificacion o nombre de casa" + (i + 1));
            viviendas[i] = entrada.nextLine();
        }
        return viviendas;
    }

    public static int[][] obtenerMatrizConsumos(String[] viviendas) {
        Scanner entrada = new Scanner(System.in);
        int[][] consumos = new int[viviendas.length][12];
        for (int i = 0; i < viviendas.length; i++) {
            System.out.println("Consumos de " + viviendas[i]);
            for (int j = 0; j < 12; j++) {
                System.out.print("Mes " + (j + 1) + ": ");
                consumos[i][j] = entrada.nextInt();

            }
        }
        return consumos;
    }

    public static int[] calcularSumaAnual(int[][] consumos) {
        int[] sumaAnual = new int[consumos.length];
        for (int i = 0; i < consumos.length; i++) {
            int suma = 0;
            for (int j = 0; j < consumos[i].length; j++) {
                suma = suma + consumos[i][j];
            }
            sumaAnual[i] = suma;
        }
        return sumaAnual;
    }

    public static void generarReporte(String[] viviendas, int[] sumaAnual) {
        String reporte = "\n---REPORTE DE CONSUMO ANUAL---\n";
        for (int i = 0; i < viviendas.length; i++) {
            reporte += String.format("Vivienda %s: %d kWh\n", viviendas[i], sumaAnual[i]);
        }
        System.out.println(reporte);
    }
}
