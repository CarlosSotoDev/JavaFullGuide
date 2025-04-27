package org.example;

public class Main {

    public static void main(String[] args){
        //Una Variable es un contenedor que almacena un valor durante la ejecución del programa

        //Declaración de una Variable

        //Para declarar una variable se utiliza la estructura de:
        /// Tipo_de_dato + Nombre_de_la_variable + valor_opcional_para:inicializar_la_variable
        ///
        /// Las variables deben de seguir las siguientes reglas al ser declaradas:
        /// - Deben de comenzar con una letra, $ o _
        /// - No pueden comenzar con número
        /// - No deben de usar palabras reservadas del lenguaje
        /// - Usar camelCase por convención: miEdad, nombreCompleto;

        //Declaración de una variable de tipo Entero:
        int entero = 25;

        //Declaración de una variable de tipo Cadena:
        String cadena = "Hola Mundo";

        //Declaración de una variable de tipo booleana;
        boolean verdaderoFalso = true;

        //Declaración de una variable de tipo decimal:
        double decimal = 8.5;

        System.out.println("\n");
        System.out.println("Variable de tipo entero: " + entero + "\n");
        System.out.println("Variable de tipo Cadena: " + cadena + "\n");
        System.out.println("Variable de tipo booleano: " + verdaderoFalso + "\n");
        System.out.println("Variable de tipo decimal: " + decimal );

    }
}