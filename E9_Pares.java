package EjerciciosJava;
/*Ahora sí empiezan los bucles. Escribe un programa que muestre todos los
números pares entre A y B, siendo estos dos valores dos números
introducidos por teclado. A debe ser menor que B, claro. En caso contrario, el
programa debe avisarnos, pero con cariño. */


public class E9_Pares {
    public static void main(String[] args) {
        
        pares(120,100 );
    }

    public static void pares(int numA,int numB) {
        
        if(numA<numB){
            System.out.println("Los números son;");
            for (int i = numA; i-2 < numB;i+=2) {
                System.out.println(i);
            }
        }else{
            System.out.println("ERROR: El primer número debe siempre ser menor que el segundo");
        }
           
    }
}
