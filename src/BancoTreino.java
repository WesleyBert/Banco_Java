import java.util.Scanner;

public class BancoTreino {
    public static void main(String[] args) {
        String nome = "Jacqueline Oliveira";
        String conta = "Corrente";
        double saldo = 2500.00;

        Scanner leitor = new Scanner(System.in);

        System.out.println("***********************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("");
        System.out.println(String.format("Nome:              %s", nome));
        System.out.println(String.format("Tipo de conta:     %s", conta));
        System.out.println(String.format("Saldo inicial:     R$ %.2f", saldo));
        System.out.println("***********************************************");

        System.out.println("");
        System.out.println("Operações");
        System.out.println("1 - Consultar saldos");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");

        System.out.println("Digite a opção desejada: ");
        int operacoes = leitor.nextInt();

        while (operacoes != 4) {
            switch (operacoes) {
                case 1:
                    System.out.println(String.format("O saldo da sua conta e de %.2f", saldo));
                    operacoes = leitor.nextInt();
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja receber: ");
                    double receber = leitor.nextDouble();
                    double valorReceber = saldo + receber;
                    System.out.println(String.format("Saldo atualizado R$ %s", valorReceber));
                    operacoes = leitor.nextInt();
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja transferir: ");
                    double transferir = leitor.nextDouble();
                    double valorTransferirsaldo = saldo - transferir;
                    if(valorTransferirsaldo < saldo){
                        System.out.println("Impossivel fazer essa operação! Saldo insufiente.");
                    }else {
                        System.out.println(String.format("saldo atualizado para $.2f",valorTransferirsaldo));
                    }
                    operacoes = leitor.nextInt();

                    break;

                case 4:
                    break;
                default:
                    System.out.println("Operação incorreta, digite opções desejadas");
                    operacoes = leitor.nextInt();

            }
        }
    }
}
