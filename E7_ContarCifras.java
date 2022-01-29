package EjerciciosJava;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
Determinar el número de cifras de un número entero. El algoritmo debe
funcionar para números de hasta 5 cifras, considerando los negativos. Por
ejemplo, si se introduce el número 5342, la respuesta del programa debe ser
4. Si se introduce –250, la respuesta debe ser 3.
Para los quisquillosos: no, el 0 a la izquierda no cuenta.
 */
public class E7_ContarCifras {

    public static void main(String[] args) {
        
      contarCifra(198186);
        
    }
    
    public static void contarCifra(int cifra){
        String conversionCadena = Integer.toString(cifra);
        int contador = conversionCadena.length();
        
        if(conversionCadena.length() >= 6){
            System.out.println("La cifra no puede ser superior a 5 dígitos");
        }else{
            System.out.println("La cifra tiene " + contador + " digitos");
        }

    }
    
   
    
}