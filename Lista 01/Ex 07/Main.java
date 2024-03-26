import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("~ Bem-vindo ao sistema de gerenciamento de estoque do mercado! ~");
        System.out.println("");

        System.out.println("Qual o nome do produto que deseja adicionar ao estoque?");
        String nome = leitor.nextLine();

        System.out.println("");
        
        System.out.print("E qual o código dele: ");
        int codigo = leitor.nextInt();

        System.out.println("");

        System.out.print("Agora, o preço do produto: ");
        double preco = leitor.nextDouble();

        System.out.println("");

        System.out.print("Qual a quantidade desse produto em estoque? ");
        int quantidadeEstoque = leitor.nextInt();
        
        leitor.nextLine();

        Produto produto = new Produto(nome, codigo, preco, quantidadeEstoque);

        System.out.println("Produto adicionado ao estoque:");
        exibirInformacoesProduto(produto);

        produto.exibirInformacoes();
    }

   

