package EjerciciosJava;

import java.util.Scanner;

/*Calcular la raíz cuadrada de un número introducido por teclado. Hay que
tener la precaución de comprobar que el número sea positivo.
*/

public class E2_RaizCuadrada {

    public static void main(String[] args) {

        raizCuadrada();

    }

    public static void raizCuadrada() {
        int numero;
        int resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica un número: ");
        numero = sc.nextInt();
        sc.close();
        try {
            if (numero < 0) {
                System.out.println("El número no puede ser negativo.");
            }
        } catch (Exception e) {

        }

        resultado = (int) Math.sqrt(numero);
        System.out.println("La raiz cuadrada de " + numero + " es " + resultado);

    }

}
