package While;
import java.util.Random;
import java.util.Scanner;
public class JokWhile {
    public static void main(String[] args) {
        String continuar = "sim";
        while (continuar.equalsIgnoreCase("sim")) {
            Scanner tecla = new Scanner(System.in);
            System.out.println("PEDRA | PAPEL | TESOURA");
            String opcao = tecla.nextLine();
            int num = 0;
            if (opcao.equalsIgnoreCase("pedra")) {
            num = 1;
            }if (opcao.equalsIgnoreCase("papel")) {
                num = 2;
            }if (opcao.equalsIgnoreCase("tesoura")) {
                num = 3;
            }
            Random gerador = new Random();
            int escolhaPc = gerador.nextInt(3) + 1;
                switch (escolhaPc) {
                    case 1:
                        System.out.println("pedra");
                        break;
                    case 2:
                        System.out.println("papel");
                        break;
                    case 3:
                        System.out.println("tesoura");
                        break;
                }
            if (num == escolhaPc) {
                System.out.println("EMPATE");
            }
            if (num == 1 && escolhaPc == 2) {
                System.out.println("PERDEU");
            }
            if (num == 1 && escolhaPc == 3) {
                System.out.println("GANHOU");
            }
            if (num == 2 && escolhaPc == 1) {
                System.out.println("GANHOU");
            }
            if (num == 2 && escolhaPc == 3) {
                System.out.println("PERDEU");
            }
            if (num == 3 && escolhaPc == 1) {
                System.out.println("PERDEU");
            }
            if (num == 3 && escolhaPc == 2) {
                System.out.println("GANHOU");
            }

            System.out.println("Deseja continuar (Sim / Nao)");
            continuar = tecla.nextLine();
        }System.out.println("Muito obrigado por jogar comigo! ");
    }
}
            



