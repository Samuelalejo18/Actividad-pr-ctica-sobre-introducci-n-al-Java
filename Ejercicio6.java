
/*Dado un conjunto de números naturales menores que 100, calcular el promedio de estos.
El ciclo termina al asignar un número fuera del intervalo. */
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double suma = 0;
            int cantidad = 0;

            System.out.println("Ingresar un número natural entre  0  hasta el 100");
            System.out.println(" Si Ingresa otro número natural  mayor a 100 o menor a 0, termina el conteo : ");
            int numero = sc.nextInt();

            while (numero >= 0 && numero < 100) {
                suma += numero;
                cantidad++;

                numero = sc.nextInt();
            }

            if (cantidad > 0) {
                double promedio = suma / cantidad;
                System.out.println("El promedio de los  números ingresados es: " + promedio);

            }
        }

    }
}
