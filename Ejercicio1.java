import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto");
        double precio = sc.nextDouble();
        
        double precioDescuento = precio -precio * 0.15;
        
        System.out.println("El precio con descuento del producto -> "  + precioDescuento);
        
        
        
    }
}
