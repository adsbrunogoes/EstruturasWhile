package While;

import java.util.Random;

public class Exercicio04 {
    public static void main(String[] args) {
        int c = 1;
        while(c <= 10){
            Random aleatorio = new Random ();
            int numero = aleatorio.nextInt(100)+1;
            System.out.print(numero + " ");
            if (numero % 5 == 0){
                System.out.println("");
                System.out.println("("+ numero + ") é multiplo de 5!");
                c = 11;
            }if(c == 10){
                System.out.println("");
                System.out.println("Nenhum multiplo de 5 foi gerado!");
            }    
            c++;
        }
    }
}
                
              

