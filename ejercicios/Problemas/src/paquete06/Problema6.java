/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Problema6 {
     public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        double media = calcularMedia(informacion);
        double desviacion = calcularDesviacion(informacion, media);

        System.out.printf("La media aritmética es: %.2f%n", media);
        System.out.printf("La desviación estándar es: %.2f%n", desviacion);
    }
     
    public static double calcularMedia(int[] arreglo) {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo [i];
        }
        double media = suma / arreglo.length;
        return media;
    }
    
    public static double calcularDesviacion(int[] arreglo, double media) {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + Math.pow(arreglo [i] - media, 2);
        }
        return Math.sqrt(suma / arreglo.length);
    }
}
