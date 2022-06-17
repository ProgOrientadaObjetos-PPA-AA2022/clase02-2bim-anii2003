/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
        // Ingresar estudiantes de tipo presencial por teclado
        // El usuario decide cuanto terminar
        // no utilizar super.toString en Estudiante Presencial
        // además debe existir 1 sola impresión de todos los estudiantes presenciales
        // no usar arreglos
        int opc;
        String cadena = "";

        do {
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Ingresar un Estudiante Presencial");
            System.out.println("2. Presentar la información");
            System.out.println("3. Salir");
            opc = leer.nextInt();

            if (opc == 1) {
                String nombre, apellido, iden;
                int edad, numCreditos;
                double costoCredito;

                leer.nextLine();

                System.out.print("Ingrese el nombre: ");
                nombre = leer.nextLine();

                System.out.print("Ingrese el apellido: ");
                apellido = leer.nextLine();

                System.out.print("Ingrese la identificación: ");
                iden = leer.nextLine();

                System.out.print("Ingrese la edad: ");
                edad = leer.nextInt();

                System.out.print("Ingrese el número de créditos: ");
                numCreditos = leer.nextInt();

                System.out.print("Ingrese el costo de crédito: ");
                costoCredito = leer.nextDouble();

                EstudiantePresencial estPresencial = new EstudiantePresencial(nombre, apellido,
                        iden, edad, numCreditos, costoCredito);

                estPresencial.calcularMatriculaPresencial();

                cadena = cadena + estPresencial;

            } else 
                if (opc == 2) {
                    System.out.println(cadena);
                } else
                    if (opc == 3) {
                break;
            } else {
                System.out.println("Opción inválida");
            }

        } while (opc == 1);

    }
}
