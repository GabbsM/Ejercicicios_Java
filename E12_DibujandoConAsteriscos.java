package EjerciciosJava;
/*Este ejercicio es un poco más complicado que los anteriores, pero también
mucho más divertido.
Escribe una clase capaz de generar en la pantalla, mediante bucles, estos
bonitos diseños. Añade alguno de tu propia cosecha, por favor.
(Por si queda alguna duda: el último se supone que es un árbol de navidad)  */

public class E12_DibujandoConAsteriscos {
    
    public static void main(String[] args) {
        triangulo(7);
    }

    public static void triangulo(int num) {

        for(int numBlancos = num-1,numAsteriscos=1; numBlancos>=0; numBlancos--, numAsteriscos += 2){
            //Espacios en blanco
            for(int i=1;i<=numBlancos;i++){
                System.out.print(" ");
            }
              
            //Asteriscos
            for(int j=1;j<=numAsteriscos;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
            
        }
        
    

