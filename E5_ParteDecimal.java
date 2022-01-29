package EjerciciosJava;
/*Averiguar si un número real introducido por teclado tiene o no parte
fraccionaria (utilícese el método Math.round() que aparece descrito en el
capítulo 1, o si no, búscalo en Internet)
 */

public class E5_ParteDecimal {
    public static void main(String[] args) {

        System.out.println("El resultado es " + parteFraccionaria(15));

    }

    public static int parteFraccionaria(int numero) {
        int resultado = Math.round(numero);
        return resultado;

    }
}
