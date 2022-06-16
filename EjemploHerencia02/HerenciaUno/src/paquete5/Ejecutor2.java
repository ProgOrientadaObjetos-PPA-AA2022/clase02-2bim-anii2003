/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Crear y presentar un objeto de tipo Estudiante Presencial con datos por teclado
        String nombre, apellido, iden;
        int edad, numCreditos;
        double costoCredito;       
        
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
        
        System.out.printf("%s",estPresencial);
    }
}
