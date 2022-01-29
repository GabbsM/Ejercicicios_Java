package EjerciciosJava;

/* Determinar si un año es bisiesto o no. Los años bisiestos son múltiplos de 4;
utilícese el operador módulo. ¡Pero hay más excepciones! Los múltiplos de
100 no son bisiestos, aunque sean múltiplos de 4. Pero los múltiplos de 400
sí, aunque sean múltiplos de 100. Qué follón. La Tierra es muy maleducada
al no ajustarse a los patrones de tiempo humanos.
Resumiendo: un año es bisiesto si es divisible entre 4, a menos que sea
divisible entre 100. Sin embargo, si un año es divisible entre 100 y además es
divisible entre 400, también resulta bisiesto.*/
public class E4_AñoBisiesto {

    public static void main(String[] args) {
        esBisiesto(2017);
    }

    public static boolean esBisiesto(int anio) {

        boolean bisiesto = false;
        if (anio % 4 == 0) {
            bisiesto = true;
            System.out.println("El año es bisiesto");
        }
        if (anio % 100 == 0) {
            bisiesto = false;
            System.out.println("El año no es bisiesto");
        }
        if (anio % 400 == 0) {
            bisiesto = true;
            System.out.println("El año es bisiesto");
        }
        return bisiesto;

    }
}
