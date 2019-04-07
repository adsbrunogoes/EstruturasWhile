package While;
import java.util.Random;
public class Exercicio05 {
    public static void main(String[] args) {
       int c = 1;
       int multi= 0; 
       int media= 0;
        while(c < 11){
            Random aleatorio = new Random ();
            int numero = aleatorio.nextInt(100)+1;
            System.out.println(numero);
                if (numero % 5 == 0){
                    System.out.println("É multiplo de 5!");
                    multi++;
                    media += numero; 
                    if(multi == 3){
                        System.out.println("A media é: "+ media/3);
                        c = 12;
                    }
                }        
            c++;
        }if(multi < 3){
            System.out.println("Não foram gerados 3 multiplo de 5!");
        }       
    }
}



    
