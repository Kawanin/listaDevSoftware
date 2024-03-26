import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Pedido pedido = new Pedido();

        Pizza pizzaMussarela = new Pizza("Mussarela", 20.0, "Queijo mussarela, molho de tomate", "Broto");
        Pizza pizzaCalabresa = new Pizza("Calabresa", 25.0, "Calabresa, cebola, molho de tomate", "Média");
        Pizza pizzaPortuguesa = new Pizza("Portuguesa", 30.0, "Presunto, mussarela, ovos, ervilha, cebola, molho de tomate", "Grande");

        List<Pizza> pizzasDisponiveis = new ArrayList<>();
        pizzasDisponiveis.add(pizzaMussarela);
        pizzasDisponiveis.add(pizzaCalabresa);
        pizzasDisponiveis.add(pizzaPortuguesa);

        System.out.println("Menu de Seleção de Pizzas:");
        for (int i = 0; i < pizzasDisponiveis.size(); i++) {
            System.out.println((i + 1) + ". " + pizzasDisponiveis.get(i).getNome() + " - R$" + pizzasDisponiveis.get(i).getValor() +
                    " - Tamanho: " + pizzasDisponiveis.get(i).getTamanho());
        }
        System.out.println("0. Criar sua própria pizza");
        System.out.print("Escolha uma opção: ");
        int opcao = leitor.nextInt();
        
        leitor.nextLine();

        if (opcao >= 1 && opcao <= pizzasDisponiveis.size()) {
            Pizza pizzaEscolhida = pizzasDisponiveis.get(opcao - 1);
            pedido.adicionarPizza(pizzaEscolhida);
            System.out.println("Pizza " + pizzaEscolhida.getNome() + " (" + pizzaEscolhida.getTamanho() + ") adicionada ao pedido!");
        } else if (opcao == 0) {
            System.out.print("Digite o nome da sua pizza: ");
            String nomePizza = leitor.nextLine();

            System.out.print("Digite o preço da sua pizza: ");
            double precoPizza = leitor.nextDouble();

            leitor.nextLine();
            System.out.print("Digite os ingredientes da sua pizza: ");
            String ingredientesPizza = leitor.nextLine();

            System.out.print("Digite o tamanho da sua pizza (Broto, Média, Grande, Gigante): ");
            String tamanhoPizza = leitor.nextLine();


            Pizza pizzaPersonalizada = new Pizza(nomePizza, precoPizza, ingredientesPizza, tamanhoPizza);
            pedido.adicionarPizza(pizzaPersonalizada);
            System.out.println("Pizza " + pizzaPersonalizada.getNome() + " (" + pizzaPersonalizada.getTamanho() + ") adicionada ao pedido!");
        } else {
            System.out.println("Opção inválida. Pedido cancelado.");
        }

        pedido.exibirRelatorio();
    }
}
