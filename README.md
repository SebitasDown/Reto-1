# Cotizador de Membresía de Gimnasio

Este programa en Java permite calcular el precio final de una membresía de gimnasio según los datos ingresados por el usuario.

## ¿Qué hace?

- Solicita nombre, edad, altura, peso, tipo de plan y si es la primera vez.
- Valida la edad mínima y si requiere autorización.
- Calcula el precio base según el plan (`Basico`, `Plus`, `Premium`).
- Aplica descuentos por primera vez y por rango de edad (máximo 20%).
- Calcula el BMI (Índice de Masa Corporal) y muestra la categoría correspondiente.
- Muestra un resumen con todos los datos y el precio final.

## Ejecución

1. Compila el archivo:
   ```sh
   javac Main.java
   ```
2. Ejecuta el programa:
   ```sh
   java Main
   ```
3. Ingresa los datos solicitados en consola.

## Ejemplo de salida

```
Ingrese su nombre: 
Juan
Ingrese su edad: 
20
Ingrese su altura: 
1.75
Ingrese su peso en kg: 
70
Ingrese el plan (Basico, Plus, Premium): 
Plus
¿Es la primera vez? (true/false): 
true

--- Cotización Membresía ---
Nombre: Juan
Plan elegido: PLUS
Precio base: $120.0
Descuento aplicado: 20.0%
Precio final: $96.0
