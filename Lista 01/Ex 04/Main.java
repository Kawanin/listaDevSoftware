import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo, jogador!");
        System.out.println(" ");

        System.out.print("Qual o seu nick? ");
        String nome = leitor.nextLine();

        System.out.println(" ");

        System.out.println("Qual a sua pontuação atual? ");
        int pontuacao = leitor.nextInt();

        System.out.println(" ");

        System.out.println("Certo, agora qual o seu nível? ");
        int nivel = leitor.nextInt();


        Jogador jogador = new Jogador(nome, pontuacao, nivel);

        System.out.println(" ");
        System.out.println("-------------------------");

        System.out.println("Informações do jogador:" + jogador.getNome());
        jogador.exibirInformacoes();

        System.out.println(" ");

        System.out.println("Quantos pontos você fez, jogador? ");
        int aumentoPontuacao = leitor.nextInt();
        jogador.aumentarPontuacao(aumentoPontuacao);

        jogador.subirNivel();

        System.out.println("~ Jogador:" + jogador.getNome() + "!");
        jogador.exibirInformacoes();
        
        System.out.println("-------------------------");
    }
}
