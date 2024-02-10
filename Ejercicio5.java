
/*5. Dada la edad de un grupo de personas determine:
a) Cantidad de personas con edad laboral (entre 18 y 65 años).
b) Cantidad de niños y adolescente (niños: de 0 a 10 años, Adolescentes: más de 10 y
menor que 18 años)
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String args[]) {

        ArrayList<Integer> edades = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int rango18y65 = 0;

        int niños = 0;

        int adolescentes = 0;

        int edad;

        do {
            System.out.println("Ingrese una edad o digite 0 para terminar : ");
            edad = scanner.nextInt();

            if (edad != 0) {
                edades.add(edad);
            }
            if (edad >= 18 && edad <= 65) {
                rango18y65++;
            } else if (edad > 0 && edad <= 10) {
                niños++;
            } else if (edad > 10 && edad < 18) {
                adolescentes++;

            }

        } while (edad != 0);

        scanner.close();

        System.out.println("La cantidad de niños es : " + niños);
        System.out.println("La cantidad de adolescentes es: " + adolescentes);
        System.out.println("La cantidad de personas entre los 18 y 65 es: " + rango18y65);

    }
}
