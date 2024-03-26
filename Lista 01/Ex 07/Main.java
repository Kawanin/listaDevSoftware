import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Produto> estoque = new ArrayList<>();

        
        System.out.println("Bem-vindo ao sistema de gerenciamento de estoque do mercado!");
        System.out.println("");

        boolean verificador = true;
        while (verificador) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Adicionar novo produto ao estoque");
            System.out.println("2. Atualizar informações de um produto existente");
            System.out.println("3. Remover produto do estoque");
            System.out.println("4. Gerar relatório de estoque");
            System.out.println("0. Sair do sistema");
            System.out.print("Opção: ");
            int opcao = leitor.nextInt();
            leitor.nextLine(); // Limpar o buffer do leitor

            switch (opcao) {
                case 1:
                    Produto.adicionarProdutoAoEstoque(leitor, estoque);
                    break;
                case 2:
                    Produto.atualizarInformacoesProduto(leitor, estoque);
                    break;
                case 3:
                    Produto.removerProdutoDoEstoque(leitor, estoque);
                    break;
                case 4:
                    Produto.gerarRelatorioDeEstoque(estoque);
                    break;
                case 0:
                    verificador = false;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
