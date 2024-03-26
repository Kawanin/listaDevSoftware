import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Pizza> pizzas;
    private double totalPedidos;

    public Pedido() {
        this.pizzas = new ArrayList<>();
        this.totalPedidos = 0.0;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        totalPedidos += pizza.getValor();
    }

    public void cancelarPedido() {
        pizzas.clear();
        totalPedidos = 0.0;
    }

    public void exibirRelatorio() {
        System.out.println("Relatório de Pedidos:");
        System.out.println("Número total de pedidos: " + pizzas.size());
        System.out.println("Média de preço dos pedidos: R$" + (totalPedidos / pizzas.size()));
    }
}
