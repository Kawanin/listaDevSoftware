import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static List<Pizza> pizzas;
    private static double totalPedidos;


    static {
        pizzas = new ArrayList<>();
        totalPedidos = 0.0;
    }


    public static void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        totalPedidos += pizza.getValor();
    }


    public static void cancelarPedido() {
        pizzas.clear();
        totalPedidos = 0.0;
    }


    public static void exibirRelatorio() {
        System.out.println("Relatório de Pedidos:");
        System.out.println("Número total de pedidos: " + pizzas.size());
        if (pizzas.size() > 0) {
            double mediaPreco = totalPedidos / pizzas.size();
            System.out.println("Média de preço dos pedidos: R$" + mediaPreco);
        } else {
            System.out.println("Média de preço dos pedidos: R$0.00");
        }
    }
}
