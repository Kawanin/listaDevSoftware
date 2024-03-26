import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizza {
    private String nome;
    private double valor;
    private String ingredientes;
    private String tamanho;


    public Pizza(String nome, double valor, String ingredientes, String tamanho) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
        this.tamanho = tamanho;
    }


    public String getNome() {
        return nome;
    }


    public double getValor() {
        return valor;
    }


    public String getIngredientes() {
        return ingredientes;
    }


    public String getTamanho() {
        return tamanho;
    }


    public static List<Pizza> criarMenuPizzas() {
        List<Pizza> menuPizzas = new ArrayList<>();
        
        menuPizzas.add(new Pizza("Calabresa", 30.0, "Calabresa, mussarela", "Média"));
        menuPizzas.add(new Pizza("Margherita", 35.0, "Molho de tomate, mussarela, manjericão", "Grande"));
        menuPizzas.add(new Pizza("Frango com Catupiry", 35.0, "Frango, Catupiry, milho", "Grande"));
        return menuPizzas;
    }


    public static void fazerNovoPedido(Scanner leitor, List<Pizza> menuPizzas, Pedido pedido) {
        System.out.println("Menu de Pizzas Disponíveis:");
        for (int i = 0; i < menuPizzas.size(); i++) {
            System.out.println((i + 1) + ". " + menuPizzas.get(i).getNome() + " - R$" + menuPizzas.get(i).getValor());
        }
        System.out.print("Escolha uma pizza pelo número: ");
        int escolha = leitor.nextInt();

        leitor.nextLine();

        if (escolha >= 1 && escolha <= menuPizzas.size()) {
            Pizza pizzaEscolhida = menuPizzas.get(escolha - 1);
            pedido.adicionarPizza(pizzaEscolhida);
            System.out.println("Pedido adicionado com sucesso!");
        } else {
            System.out.println("Opção inválida. Pedido não adicionado.");
        }
    }
}
