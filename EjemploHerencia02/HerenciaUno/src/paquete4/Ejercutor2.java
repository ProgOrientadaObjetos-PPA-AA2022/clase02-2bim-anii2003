/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author DELL
 */
public class Ejercutor2 {

    public static void main(String[] args) {
        // 1. Crear y presentar un objeto de tipo Estudiante Presencial
        String nombre = "Ana";
        String apellido = "Churo";
        String identificacion = "1106053190";
        int edad = 19;

        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        
        estPresencial.establecerNumeroCreditos(4);
        estPresencial.establecerCostoCredito(10);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.printf("%s",estPresencial);
    }
}
