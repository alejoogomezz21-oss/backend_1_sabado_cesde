package application;

import javax.print.CancelablePrintJob;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola mundo");


        String nombre = "Alejo";
        int edad = 20;
        boolean masculino = true;

        System.out.println("My name is " + nombre);
        System.out.println("Iam " + edad + " years old");
        System.out.println("Am i male? " + masculino);

        int fechaActual = 2026;
        int fechaNacimiento = 2006;
        int calculadoraEdad = fechaActual - fechaNacimiento;
        System.out.println("Mi edad es: " + calculadoraEdad);

        for (int i = 1; i <= 10; i++){
            System.out.println("Interation: " + i);
        }
    }
}
