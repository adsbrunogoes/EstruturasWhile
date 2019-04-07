package While;
import java.util.Random;
import javax.swing.JOptionPane;
public class Exercicio06 {
    public static void main(String[] args) {
        Random randomico = new Random();
        int num = randomico.nextInt(10)+1;
        int tentativa = 3;
        int perdeu = 0;
        System.out.println(num);
            while (tentativa >= 1){
                String user = JOptionPane.showInputDialog("Tente adivinhar um numero: ");
                int resposta = Integer.valueOf(user);
                    if(num != resposta){
                        perdeu++;
                        tentativa--;
                        if (tentativa == 3 || tentativa == 2){
                            JOptionPane.showMessageDialog(null,"Errou!\nVocê tem mais "
                                + ""+ tentativa +" tentativas");
                        }if (tentativa == 1){
                             JOptionPane.showMessageDialog(null, "Ultima chance!");   
                        }   
                    }if(num == resposta){
                        JOptionPane.showMessageDialog(null,"A C E R T O U !");
                        tentativa = 0;
                    }    
        }if (perdeu == 3){
            JOptionPane.showMessageDialog(null, "Voce Perdeu");
        }
    }
}
                

                
        

    


