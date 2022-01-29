package EjerciciosJava;

import java.util.Scanner;

/* Leídos dos números por teclado, llamémosles A y B, calcular y mostrar la
resta del mayor menos el menor. Por ejemplo, si A = 8 y B = 3, el resultado
debe ser A – B, es decir, 5. Pero si A = 4 y B = 7, el resultado debe ser B – A,
es decir, 3.
*/
public class E3_Restar {
    public static void main(String[] args) {

        restar();
    }

    public static void restar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica un número: ");
        int num1 = sc.nextInt();
        System.out.println("Indica otro numero número: ");
        int num2 = sc.nextInt();
        sc.close();
        int resultado;

        if (num1 > num2) {
            resultado = num1 - num2;
        } else {
            resultado = num2 - num1;
        }

        System.out.println("El resultado es " + resultado);

    }

}
