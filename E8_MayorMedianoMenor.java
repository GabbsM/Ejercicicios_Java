package EjerciciosJava;

/*Dados tres números enteros, A, B, C, determinar cuál es el mayor, cuál el
menor y cuál el mediano. Y da gracias a que no lo hemos hecho con 4
variables. Prohibido usar arrays, suponiendo que sepas lo que son. Es un
ejercicio de lógica, no de bucles.  */
public class E8_MayorMedianoMenor {

    public static void main(String[] args) {

        ordenNumeros(54, 96, 101);
    }

    public static void ordenNumeros(int numA, int numB, int numC) {

        if ((numA > numB) && (numB > numC)) {
            System.out.println("Mayor: " + numA + " Mediano: " + numB + " Pequeño: " + numC);
        }
        if ((numC > numB) && (numB > numA)) {
            System.out.println("Mayor: " + numC + " Mediano: " + numB + " Pequeño: " + numA);
        }
        if ((numB > numA) && (numA > numC)) {
            System.out.println("Mayor: " + numB + " Mediano: " + numA + " Pequeño: " + numC);
        } else if ((numB > numC) && (numC > numA)) {
            System.out.println("Mayor: " + numB + " Mediano: " + numC + " Pequeño: " + numA);
        }

    }

}
