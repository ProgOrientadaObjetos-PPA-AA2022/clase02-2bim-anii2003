/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete8;

public class Ejecutor2 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numCred = 8;
        int costoCred = 100;        
        
        EstudiantePresencial1 estPresencial = new EstudiantePresencial1(nombre,
                apellido, identificacion, edad, numCred,costoCred);
        
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
