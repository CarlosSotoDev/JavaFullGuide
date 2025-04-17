package org.example;

public class ValoresPorDefecto {
    // Tipos primitivos
    byte b;        // byte: 0 (entero de 8 bits, rango -128 a 127)
    short s;       // short: 0 (entero de 16 bits)
    int i;         // int: 0 (entero de 32 bits, tipo por defecto para enteros)
    long l;        // long: 0L (entero de 64 bits, para números grandes)

    float f;       // float: 0.0f (decimal de 32 bits, requiere sufijo 'f')
    double d;      // double: 0.0 (decimal de 64 bits, tipo por defecto para decimales)

    char c;        // char: '\u0000' (carácter nulo Unicode, se imprime como espacio vacío)
    boolean bool;  // boolean: false (valor lógico, true o false)

    // Tipo de referencia
    String str;    // String: null (no apunta a ningún objeto aún)

    public static void main(String[] args) {
        ValoresPorDefecto v = new ValoresPorDefecto();

        System.out.println("byte: " + v.b);
        System.out.println("short: " + v.s);
        System.out.println("int: " + v.i);
        System.out.println("long: " + v.l);
        System.out.println("float: " + v.f);
        System.out.println("double: " + v.d);
        System.out.println("char: '" + v.c + "'");
        System.out.println("boolean: " + v.bool);
        System.out.println("String: " + v.str);
    }
}