
/*Dados los números a, b y c, asociados a la ecuación  ax^2+ bx+ c = 0 , determine los ceros si es posible, en caso contario mostrar el mensaje no tiene ceros. */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Dado la ecuación ax^2+bx+c=0");
            System.out.println("Ingrese el valor de a :");

            double a = sc.nextDouble();
            System.out.println("Ingrese el valor de b : ");
            double b = sc.nextDouble();
            System.out.println("Ingrese el valor de c : ");
            double c = sc.nextDouble();

            double discriminante = (b * b) - (4 * a * c);
            if ((a == 0) || (discriminante < 0)) {
                System.out.println(
                        "No existe solución, no es posible dividir entre 0 en la ecuación cuadrática o el discriminante es negativo.");

            } else {
                double raiz = Math.sqrt(discriminante);
                double x1 = (-b + raiz) / (2 * a);
                double x2 = (-b - raiz) / (2 * a);
                System.out.println("El valor de x1 = " + x1 + " El valor de x2 es " + x2);
                // Comprobación de la fórmula
                System.out.println("Comprobación de x1 :");
                double comprobacion1 = a * x1 * x1 + b * x1 + c;
                System.out.println(a + "*" + x1 + "*" + x1 + "+" + b + "*" + x1 + "+" + c + "=" + comprobacion1);

                System.out.println("Comprobación de x2 :");
                double comprobacion2 = a * x2 * x2 + b * x2 + c;
                System.out.println(a + "*" + x2 + "*" + x2 + "+" + b + "*" + x2 + "+" + c + "=" + comprobacion2);
            }
        }

    }
}
