# Guía de Java: Variables, Tipos de Datos y Operadores

Este documento explica los conceptos básicos de Java incluyendo cómo declarar variables, los distintos tipos de datos primitivos y los operadores más comunes, con ejemplos prácticos.

---

## 1. Variables

Una variable es un contenedor que almacena un valor durante la ejecución del programa.

### Declaración de variable

```java
int edad = 25;
String nombre = "Carlos";
```

### Reglas para nombres de variables

- Deben comenzar con una letra, `$` o `_`.
- No pueden comenzar con números.
- No deben usar palabras reservadas del lenguaje.
- Usar camelCase por convención: `miEdad`, `nombreCompleto`.

---

## 2. Tipos de Datos

Java tiene **tipos primitivos** y **referenciados**.

### Tipos Primitivos

| Tipo     | Tamaño | Valor por defecto | Ejemplo             |
|----------|--------|-------------------|---------------------|
| `byte`   | 1 byte | 0                 | `byte edad = 30;`   |
| `short`  | 2 bytes| 0                 | `short s = 1000;`   |
| `int`    | 4 bytes| 0                 | `int x = 50000;`    |
| `long`   | 8 bytes| 0L                | `long l = 123L;`    |
| `float`  | 4 bytes| 0.0f              | `float f = 5.6f;`   |
| `double` | 8 bytes| 0.0d              | `double d = 3.14;`  |
| `char`   | 2 bytes| '\u0000'         | `char c = 'A';`     |
| `boolean`| 1 bit  | false             | `boolean b = true;` |

### Tipos Referenciados

- `String`, `Array`, `Object`, clases personalizadas.
- Se almacenan en el heap y pueden ser `null`.

```java
String mensaje = "Hola Mundo";
int[] numeros = {1, 2, 3};
```

---

## 3. Operadores en Java

### Aritméticos

| Operador | Significado   | Ejemplo             |
|----------|---------------|---------------------|
| `+`      | Suma          | `5 + 3 = 8`         |
| `-`      | Resta         | `5 - 3 = 2`         |
| `*`      | Multiplicación| `5 * 3 = 15`        |
| `/`      | División      | `10 / 2 = 5`        |
| `%`      | Módulo        | `10 % 3 = 1`        |

```java
int resultado = 10 + 5 * 2; // Resultado: 20
```

### Relacionales

| Operador | Significado         | Ejemplo         |
|----------|---------------------|-----------------|
| `==`     | Igual a             | `a == b`        |
| `!=`     | Diferente de        | `a != b`        |
| `>`      | Mayor que           | `a > b`         |
| `<`      | Menor que           | `a < b`         |
| `>=`     | Mayor o igual que   | `a >= b`        |
| `<=`     | Menor o igual que   | `a <= b`        |

```java
boolean esMayor = edad > 18;
```

### Lógicos

| Operador | Significado     | Ejemplo             |
|----------|-----------------|---------------------|
| `&&`     | AND lógico       | `true && false` → false |
| `||`     | OR lógico        | `true || false` → true |
| `!`      | Negación lógica  | `!true` → false     |

```java
if (edad > 18 && tieneID) {
    System.out.println("Acceso permitido");
}
```

### Asignación

| Operador | Significado     | Ejemplo         |
|----------|-----------------|-----------------|
| `=`      | Asignación       | `a = 5`         |
| `+=`     | Suma y asigna    | `a += 5`        |
| `-=`     | Resta y asigna   | `a -= 2`        |
| `*=`     | Multiplica y asigna | `a *= 3`     |
| `/=`     | Divide y asigna  | `a /= 2`        |
| `%=`     | Módulo y asigna  | `a %= 2`        |

### Incremento / Decremento

| Operador | Uso       | Ejemplo       |
|----------|-----------|---------------|
| `++`     | Incrementar| `a++` o `++a` |
| `--`     | Decrementar| `a--` o `--a` |

---

## 4. Ejemplo Completo

```java
public class Demo {
    public static void main(String[] args) {
        int edad = 25;
        boolean mayorEdad = edad >= 18;
        String mensaje = mayorEdad ? "Es mayor de edad" : "Es menor de edad";
        System.out.println(mensaje);
    }
}
```

---

## Recursos adicionales

- [Documentación Oficial de Java](https://docs.oracle.com/en/java/)
- [Java Language Specification](https://docs.oracle.com/javase/specs/)