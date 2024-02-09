/*1. En un mercado se descuenta el 15% del producto que compren. Conocido el precio del
producto seleccionado por el usuario determine el valor a pagar.  */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Ingrese el precio del producto : ");

            double precio = sc.nextDouble();
            double precioDescuento = precio - precio * 0.15;

            System.out.println("El precio con descuento del producto -> " + precioDescuento);
        }
    }
}
