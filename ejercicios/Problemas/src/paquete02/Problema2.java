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
        int [][] consumos = obtenerMatrizConsumos(viviendas);
        int [] sumaAnual = calcularSumaAnual(consumos);
        generarReporte(viviendas, sumaAnual);
    }
    public static String obtenerListadoViviendas(){
        Scanner entrada = new Scanner(System.in);
        String [] vivienda =  new String[10];
        int o = 1;

        for (int i=0; i < vivienda.length; i++){
            System.out.println("Ingrese identificacion o nombre de casa"+ o);
            vivienda[i]=entrada.nextLine();
            o = 1+1;
        }
    }
    
}
