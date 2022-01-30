package EjerciciosJava;
/* Escribir todos los números impares entre dos números A y B introducidos por
teclado. En esta ocasión, cualquier de ellos puede ser el mayor. Habrá que
comprobar, entonces, cuál de los dos números, A o B es mayor, para empezar
a escribir los impares desde uno o desde otro.*/

public class E10_Impares {
    public static void main(String[] args) {
        numerosImpares(25,60 );
    }
    
    public static void numerosImpares(int numA, int numB) {
        int inicio;
        if (numA>numB){
            inicio = numB;
            if(numB % 2 ==0){
                inicio = numB+1;
            }else{
                inicio = numB;
            }
            for (int i = inicio; i < numA; i+=2) {
                System.out.println(i);
            }
        }else{
            inicio = numA;
            if(numA % 2 ==0){
                inicio = numA+1;
            }else{
                inicio = numA;
            }
            for (int i = inicio; i < numB; i+=2) {
                System.out.println(i);
            }
        }
      
    }
}
