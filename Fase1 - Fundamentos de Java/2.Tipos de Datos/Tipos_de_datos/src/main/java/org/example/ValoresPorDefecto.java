package org.example;

import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class ValoresPorDefecto {
    // Tipos primitivos
    byte b;        // byte: 0 (entero de 8 bits)
    short s;       // short: 0 (entero de 16 bits)
    int i;         // int: 0 (entero de 32 bits)
    long l;        // long: 0L (entero de 64 bits)

    float f;       // float: 0.0f (decimal de 32 bits)
    double d;      // double: 0.0 (decimal de 64 bits)

    char c;        // char: '\u0000' (carácter nulo Unicode)
    boolean bool;  // boolean: false (lógico: true/false)

    // Tipos referenciados
    String str;                         // String: null (no asignado)
    Integer integerObj;                 // Wrapper Integer: null
    Double doubleObj;                   // Wrapper Double: null
    Boolean booleanObj;                 // Wrapper Boolean: null
    Character charObj;                  // Wrapper Character: null

    Date fecha;                         // Objeto Date: null
    ArrayList<String> lista;            // Lista: null
    HashMap<String, Integer> mapa;      // Mapa: null

    ValoresPorDefecto[] arregloObjetos; // Arreglo de objetos: null

    public static void main(String[] args) {
        ValoresPorDefecto v = new ValoresPorDefecto();

        System.out.println("Tipos Primitivos");
        System.out.println("byte: " + v.b);
        System.out.println("short: " + v.s);
        System.out.println("int: " + v.i);
        System.out.println("long: " + v.l);
        System.out.println("float: " + v.f);
        System.out.println("double: " + v.d);
        System.out.println("char: '" + v.c + "'");
        System.out.println("boolean: " + v.bool + "\n");

        System.out.println("Tipos Referenciados");
        System.out.println("String: " + v.str);
        System.out.println("Integer (obj): " + v.integerObj);
        System.out.println("Double (obj): " + v.doubleObj);
        System.out.println("Boolean (obj): " + v.booleanObj);
        System.out.println("Character (obj): " + v.charObj);

        System.out.println("Date: " + v.fecha);
        //A diferencia de un List esta es una lista fija sin ser flexible
        //El arraysList implementa la interfaz de List para comenzar a trabajar
        System.out.println("ArrayList: " + v.lista); //ListaDinamica puede crecer o reducirse dinamicamente
        System.out.println("HashMap: " + v.mapa); //Diccionario para guardar claves y datos unicos
        System.out.println("Array de objetos: " + v.arregloObjetos); //Colección Fija de Elementos
    }
}
