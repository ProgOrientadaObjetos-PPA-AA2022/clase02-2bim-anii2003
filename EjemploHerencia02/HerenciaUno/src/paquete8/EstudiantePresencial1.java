package paquete8;

import paquete6.*;

public class EstudiantePresencial1 extends Estudiante {

    int numeroCreditos;
    double costoCredito;
    double matriculaPresencial;

    public EstudiantePresencial1(String n, String ap, String iden, int e,
            int numC, double costoC) {
        super(iden, e); // ap = apellido // iden = identificacion // e = edad
        establecerNombresEstudiante(n);
        establecerApellidoEstudiante(ap);
        numeroCreditos = numC;
        costoCredito = costoC;
    }

    @Override
    public void establecerNombresEstudiante(String nom) {
        nombresEstudiante = nom.toLowerCase(); // Juan.toLowerCase() >> juan 
    }

    public void establecerApellidoEstudiante(String ape) {
        apellidosEstudiante = ape.toLowerCase();
    }

    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero) {
        numeroCreditos = numero;
    }

    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor) {
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial() {
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos() {
        return numeroCreditos;
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito() {
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial() {
        return matriculaPresencial;
    }

    public String toString() {
        String cadenaFinal = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificación: %s\n"
                + "Edad: %s\n"
                + "Número de créditos: %d\n"
                + "Costo de créditos: %.2f\n"
                + "Total Matricula: %.2f\n",
                nombresEstudiante,
                apellidosEstudiante,
                identificacionEstudiante,
                edadEstudiante,
                obtenerNumeroCreditos(),
                obtenerCostoCredito(),
                obtenerMatriculaPresencial());

        return cadenaFinal;
    }
}
