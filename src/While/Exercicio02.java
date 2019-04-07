package While;

import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        int c = 1;
        int nMaior = 1;
        int nMenor = 100;
        int soma = 0;
        while(c <= 10){
            Random aleatorio = new Random ();
            int numero = aleatorio.nextInt(100)+1;
            System.out.print(numero + " " );
                if (numero > nMaior){
                    nMaior = numero;
                }
                if (numero < nMenor){
                    nMenor = numero;
                }
            soma += numero;     
            c++;
        }
            System.out.println(" ");
            System.out.println("Numero maior: " + nMaior);    
            System.out.println("Numero menor: " + nMenor);  
            System.out.println("A soma entre eles é: "+ soma);
            System.out.println("A media entre eles é: "+ soma/10);
    }
}
