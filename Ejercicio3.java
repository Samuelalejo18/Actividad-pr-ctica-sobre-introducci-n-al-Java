import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("La ecuación de la recta  es y=2x+3");
            System.out.println("Ingrese la coordenada X :");
            double coordenadaX = sc.nextDouble();
            System.out.println("Ingrese la coordenada Y :");
            double coordenadaY = sc.nextDouble();

            if (2 * coordenadaX + 3 != coordenadaY) {
                System.out.println("El punto no pertenece a la ecuación de la recta ");
            }else{
                System.out.println("El punto  pertenece a la ecuación de la recta");
            }
        }
    }
}

