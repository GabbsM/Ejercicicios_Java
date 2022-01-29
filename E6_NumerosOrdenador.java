package EjerciciosJava;

/*Leer tres números por teclado, X, Y y Z, y decidir si están ordenados de
menor a mayor. Complétalo con otro método que nos diga si los números,
además de estar ordenados, son consecutivos*/
public class E6_NumerosOrdenador {
    public static void main(String[] args) {

    OrdenNumeros(1, 2, 3);

    numeroConsecutivos(1, 2, 3);


    }

    public static void OrdenNumeros(int numeroA, int numeroB, int numeroC) {

        if ((numeroA < numeroB) && (numeroB < numeroC)) {
            System.out.println("Números están ordenados de menor a mayor");
        } else if ((numeroA + 1 == numeroB) && (numeroB + 1 == numeroC)) {
            System.out.println("Los números no están ordenador de menor a mayor");
        }
    }

    public static void numeroConsecutivos(int numeroA,int numeroB, int numeroC){
        OrdenNumeros(numeroA, numeroB, numeroC);
        if((numeroA+1 == numeroB) && (numeroB+1 == numeroC)){
            System.out.println("Los números son consecutivos.");
        }else{
            System.out.println("Los números no son consecutivos. ");
        }
    }
}
