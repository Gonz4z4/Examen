/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.examen1;
import java.util.Scanner;
/**
 *
 * @author gonza
 */
public class Examen1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int codigo1 = 100;
        int codigo2 = 500;
        int codigo3 = 400;
        System.out.println("ingrese el codigo:");
        Scanner codigo = new Scanner (System.in);
        int codigo4= codigo.nextInt();
            try {if (codigo4!= 100 || codigo4!=500||codigo4!=400 )
            System.out.println();
        } catch (Exception e) {
            System.out.println("Ingrese un valor numérico");
        }
        Trayecto trayecto1 = new Trayecto("argentina", "caba");
        System.out.println(trayecto1.calcularPrecio(300,codigo4));
    }

}
