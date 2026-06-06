import java.util.Scanner;

public class desafio{
    public static void main(String[] args) {
        String nome = "Fulano";
        String conta = "Conta Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("***************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Conta: " + conta);
        System.out.println("Saldo " + saldo);
        System.out.println("***************");

        String menu = """
        *****
        Digite uma opção:
        1 - Consultar saldo
        2 - retirar valor
        3 - inserir valor
        4 - sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            System.out.println("Escolha uma opção: ");
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O seu saldo é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Tudo certo, novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Tudo certo, novo saldo: " + saldo);
            } else if( opcao != 4){
                System.out.println("Opção invalida");
            }

        }

    }
}