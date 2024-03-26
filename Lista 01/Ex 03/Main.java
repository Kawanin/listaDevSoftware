import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema bancário simples!");
        System.out.println(" ");

        System.out.print("Por favor, informe o número da conta: ");
        int numeroConta = leitor.nextInt();

        leitor.nextLine();
        
        System.out.println(" ");

        System.out.print("Agora, o nome do titular da conta: ");
        String nomeTitular = leitor.nextLine();

        System.out.println(" ");

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular);

        System.out.print("\n-------------------------");

        System.out.print("Qual o valor que deseja depósitar: R$");
        float valorDeposito = leitor.nextFloat();
        conta.depositar(valorDeposito);

        System.out.println(" ");

        System.out.print("Agora, informe o valor que deseja sacar: R$");
        float valorSaque = leitor.nextFloat();
        conta.sacar(valorSaque);

        System.out.println("-------------------------");

        System.out.println(" ");

        float saldoAtual = conta.consultarSaldo();
        System.out.print ("Saldo atual da conta: R$" + saldoAtual);

    }
}
