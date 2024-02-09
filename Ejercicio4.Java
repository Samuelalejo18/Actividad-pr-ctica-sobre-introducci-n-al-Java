/*4. Dado el intervalo de números naturales [a,b] determine:
a) Cantidad de números pares e impares.
b) Cantidad de números divisibles por 7.
c) Cantidad de números divisibles por 3 y 5 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Ingrese el número A :");
            int numeroA = sc.nextInt();
            System.out.println("Ingrese el número B :");
            int numeroB = sc.nextInt();
            int contadorPares = 0;
            int contadorImpares = 0;
            int contadorDivisible7 = 0;
            int contadorDivisible3y5 = 0;
            for (int i = numeroA; i <= numeroB; i++) {

//a) Cantidad de números pares e impares.
                if (i % 2 == 0) {
                    contadorPares++;
                } else {
                    contadorImpares++;
                }

//b) Cantidad de números divisibles por 7.
                if (i % 7 == 0) {
                    contadorDivisible7++;
                }

//c) Cantidad de números divisibles por 3 y 5
                if (i % 3 == 0 && i % 5 == 0) {
                    contadorDivisible3y5++;
                }

            }
            
            System.out.println("La cantidad de números pares son :" + contadorPares);
            System.out.println("La cantidad de números  impares son :" + contadorImpares);
            System.out.println("La cantidad de números divisibles por 7 son :" + contadorDivisible7);
            System.out.println("La cantidad de números divisibles  por 3 y 5 son :" + contadorDivisible3y5);
        }
    }
}
