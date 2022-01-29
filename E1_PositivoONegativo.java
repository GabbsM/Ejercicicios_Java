package EjerciciosJava;

import java.util.Scanner;

/*Leer un número por teclado mediante un método, y decir si es positivo o
negativo con otro método. La salida por consola puede ser algo así como: "el
número X es positivo"*/
public class E1_PositivoONegativo {

    public static void main(String[] args) {

        lecturaNumero();
    }

    public static void lecturaNumero() {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica un número: ");
        numero = sc.nextInt();
        sc.close();
        if (numero < 0) {
            System.out.println("El número " + numero + " es negativo");
        } else {
            System.out.println("El número " + numero + " es positivo");
        }
    }

}
