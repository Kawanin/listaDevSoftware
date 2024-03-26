import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Pizza> menuPizzas = Pizza.criarMenuPizzas();
        Pedido pedido = new Pedido();

        System.out.println("Bem-vindo à Pizzaria!");
        System.out.println("");

        boolean verificador = true;
        while (verificador) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Fazer novo pedido");
            System.out.println("2. Cancelar pedido");
            System.out.println("3. Exibir relatório de pedidos");
            System.out.println("0. Sair do sistema");
            System.out.print("Opção: ");
            int opcao = leitor.nextInt();

            leitor.nextLine();

            switch (opcao) {
                case 1:
                    Pizza.fazerNovoPedido(leitor, menuPizzas, pedido);
                    break;
                case 2:
                    Pedido.cancelarPedido();
                    System.out.println("Pedido cancelado com sucesso!");
                    break;
                case 3:
                    Pedido.exibirRelatorio();
                    break;
                case 0:
                    verificador = false;
                    System.out.println("Saindo do sistema..., até a próxima!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
