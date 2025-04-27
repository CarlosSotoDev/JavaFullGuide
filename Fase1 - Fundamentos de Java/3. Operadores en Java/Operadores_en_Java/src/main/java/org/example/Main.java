package org.example;

public class Main {
    public static void main(String[] args) {


        int a = 10;
        int b = 5;
        int d = 5;

        //Operadores aritmeticos
        System.out.println("Operadores Aritméticos:");
        System.out.println("a + b = " + (a + b)); //Suma
        System.out.println("a - b = " + (a - b)); //Resta
        System.out.println("a * b = " + (a * b)); //Multiplicación
        System.out.println("a / b = " + (a / b)); //División
        System.out.println("a % b = " + (a % b)); //Módulo(residuo)

        System.out.println("-------------------------------------------");

        //Operadores de Incremento y Decremento
        System.out.println("Operadores de Incremento y Decremento:");
        System.out.println("Valor inicial de d: " + d);

        d++; // incremento (suma 1)
        System.out.println("Después de d++: " + d);

        d--; // decremento (resta 1)
        System.out.println("Después de d--: " + d);

        ++d; // incremento (forma pre-incremento)
        System.out.println("Después de ++d: " + d);

        --d; // decremento (forma pre-decremento)
        System.out.println("Después de --d: " + d);

        System.out.println("-------------------------------------------");


        //Operadores Relacionales
        System.out.println("Operadores Relacionales");
        System.out.println("a == b: " + (a == b)); //Igualdad
        System.out.println("a != b: " + (a != b)); //Desigualdad
        System.out.println("a > b: " + (a > b)); //Mayor que
        System.out.println("a < b: " + (a < b)); //Menor que
        System.out.println("a >= b: " + (a >= b)); //Mayor o igual que
        System.out.println("a <= b: " + (a <= b) ); //Menor o igual que

        System.out.println("-------------------------------------------");

        //Operadores Logicos
        boolean x = true;
        boolean y = false;
        System.out.println("Operadores Lógicos:");
        System.out.println("x && y: " + (x && y)); // AND lógico
        System.out.println("x || y: " + (x || y)); // OR lógico
        System.out.println("!x: " + (!x));         // NOT lógico

        System.out.println("-------------------------------------------");

        //Operadores de Asignación
        int c = 10;
        System.out.println("Operadores de Asignación:");
        System.out.println("Valor inicial de c: " + c);
        c += 5;
        System.out.println("Después de c += 5: " + c);
        c -= 3;
        System.out.println("Después de c -= 3: " + c);
        c *= 2;
        System.out.println("Después de c *= 2: " + c);
        c /= 4;
        System.out.println("Después de c /= 4: " + c);
        c %= 3;
        System.out.println("Después de c %= 3: " + c);






    }
}