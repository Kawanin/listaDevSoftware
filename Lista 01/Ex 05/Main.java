import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo ao evento aumototivo de clássicos!");
        System.out.println(" ");

        System.out.print("Qual a marca do seu carro?");
        String marca = leitor.nextLine();

        System.out.println(" ");

        System.out.print("Agora, qual o modelo?");
        String modelo = leitor.nextLine();

        System.out.println(" ");

        System.out.print("Por fim, o ano do veículo? ");
        int ano = leitor.nextInt();

        leitor.nextLine();

        System.out.println(" ");

        System.out.print("Para o evento, precisamos que informe a placa do veículo:");
        String placa = leitor.nextLine();

        System.out.println(" ");

    
        Carro carro = new Carro(marca, modelo, ano, placa);

        System.out.println("~Essas foram as informações inseridas: ~");
        carro.exibirInformacoes();

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Qual a média de velocidade dele? (em km/h): ");
        int velocidadeAtual = leitor.nextInt();
        
        System.out.println(" ");

        System.out.println("Quando acelerando em 50 km/h a mais: ");
        carro.acelerar(50);

        System.out.println(" ");

        System.out.println("~ Agora, segue as informações atualizadas do carro: ~");
        carro.exibirInformacoes();

        System.out.println(" ");

        System.out.println("Agora vamos freiar o carro em 20 km/h");
        carro.frear(20); 

        System.out.println("Após acelerar e freiar o possante, as informações do carro ficaram: ");
        carro.exibirInformacoes();

    }
}
