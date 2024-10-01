/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_parcial;

import java.util.Scanner;

/**
 *
 * @author 1061985898
 */
public class Ejercicio_5
{
//definir un vector de 5 componentes de tipo float que representen las alturas. obtener el promedio de las mismas. contar cuantas personas son mas altas que el promedio y cuantas mas bajas
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] alturas = new float[5];
        System.out.println("Ingrese las alturas de 5 personas:");
        for (int i = 0; i < alturas.length; i++) {
            System.out.print("Altura " + (i + 1) + ": ");
            alturas[i] = sc.nextFloat();
        }
        float suma = 0;
        for (float altura : alturas) {
            suma += altura;
        }
        float promedio = suma / alturas.length;
        int masAltas = 0;
        int masBajas = 0;
        for (float altura : alturas) {
            if (altura > promedio) {
                masAltas++;
            } else if (altura < promedio) {
                masBajas++;
            }
        }
        System.out.println("Promedio de alturas: " + promedio);
        System.out.println("Personas más altas que el promedio: " + masAltas);
        System.out.println("Personas más bajas que el promedio: " + masBajas);
    }
}

