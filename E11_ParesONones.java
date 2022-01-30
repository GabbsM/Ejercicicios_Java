package EjerciciosJava;

import java.util.Scanner;

/* Escribe un programa que pregunte al usuario si desea ver los números pares o
impares y que, dependiendo de la respuesta, muestre en la pantalla los
números pares o impares entre A y B. Cualquiera de ellos puede ser el mayor.
Y sí, es un batiburrillo de los dos anteriores, así que intenta reutilizar todo el
código que puedas. En programación eso no se considera plagio, salvo que te
pillen.*/
public class E11_ParesONones {

    public static void main(String[] args) {

        paresOnones(78, 421);
    }

    public static void paresOnones(int numA, int numB) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Pares o nones: ");
        System.out.println("Aprieta 1 para pares");
        System.out.println("Aprieta 2 para nones:");
        int respuesta = sc.nextInt();
        sc.close();

        if (respuesta == 1) {
            int inicio;
            if (numA % 2 == 0) {
                inicio = numA;
            } else {
                inicio = numA + 1;
            }
            if (numA < numB) {
                System.out.println("Los números son:");
                for (int i = inicio; i < numB; i += 2) {
                    System.out.println(i);
                }
            } else {
                System.out.println("Los números son:");
                for (int i = inicio; i < numB; i += 2) {
                    System.out.println(i);
                }
            }

        } else {
            int inicio;
            if (numA > numB) {
                inicio = numB;
                if (numB % 2 == 0) {
                    inicio = numB + 1;
                } else {
                    inicio = numB;
                }
                System.out.println("Los números son:");
                for (int i = inicio; i < numA; i += 2) {
                    System.out.println(i);
                }
            } else {
                inicio = numA;
                if (numA % 2 == 0) {
                    inicio = numA + 1;
                } else {
                    inicio = numA;
                }
                System.out.println("Los números son:");
                for (int i = inicio; i < numB; i += 2) {
                    System.out.println(i);
                }
            }
        }

    }
}
