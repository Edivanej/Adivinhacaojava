import java.util.Random;
import java.util.Scanner;

public class adivinhacao {
    public static void main(String[] args) {
        System.out.println("Jogo de adivinhação:\n");

        int numeroSecreto =new Random().nextInt(100);

        Scanner leitura = new Scanner(System.in);

        int tentativas = 0;

        while (tentativas <= 20) {
            System.out.println("Qual numero você acha que é:");

            int chute = leitura.nextInt();
            tentativas ++;

            if(chute <= numeroSecreto){
                System.out.println("É menor");
            } if (chute >= numeroSecreto) {
                System.out.println("É maior");
            } if (chute == numeroSecreto){
                System.out.println("Acertou");
                break;
            }
            if (tentativas == 20) {
                System.out.println("Suas tentativas acabaram! O número era: " + numeroSecreto);
            }
        }
    }
}
