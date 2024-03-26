import java.util.List;
import java.util.Scanner;

public class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidadeEstoque;

    
    public Produto(String nome, int codigo, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }


    public String getNome() {
        return nome;
    }


    public int getCodigo() {
        return codigo;
    }


    public double getPreco() {
        return preco;
    }


    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }


    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }


    public void removerEstoque(int quantidade) {
        this.quantidadeEstoque -= quantidade;
        if (this.quantidadeEstoque < 0) {
            this.quantidadeEstoque = 0;
        }
    }


    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }


    public double calcularValorTotalEmEstoque() {
        return preco * quantidadeEstoque;
    }


    public static void adicionarProdutoAoEstoque(Scanner leitor, List<Produto> estoque) {
        System.out.println("Qual o nome do produto que deseja adicionar ao estoque?");
        String nome = leitor.nextLine();

        System.out.print("E qual o código dele: ");
        int codigo = leitor.nextInt();

        System.out.print("Agora, o preço do produto: ");
        double preco = leitor.nextDouble();

        System.out.print("Qual a quantidade desse produto em estoque? ");
        int quantidadeEstoque = leitor.nextInt();

        leitor.nextLine();

        Produto novoProduto = new Produto(nome, codigo, preco, quantidadeEstoque);
        estoque.add(novoProduto);
        System.out.println("Produto adicionado ao estoque:");
        novoProduto.exibirInformacoes();
    }


    public static void atualizarInformacoesProduto(Scanner leitor, List<Produto> estoque) {
        System.out.print("Digite o código do produto que deseja atualizar: ");
        int codigo = leitor.nextInt();

        leitor.nextLine();

        Produto produtoAtualizar = null;
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                produtoAtualizar = produto;
                break;
            }
        }


        if (produtoAtualizar != null) {
            System.out.println("Produto encontrado. Digite as novas informações:");
            System.out.println("Nome atual: " + produtoAtualizar.getNome());
            System.out.print("Novo nome: ");
            String novoNome = leitor.nextLine();

            System.out.println("Preço atual: " + produtoAtualizar.getPreco());
            System.out.print("Novo preço: ");
            double novoPreco = leitor.nextDouble();

            System.out.println("Quantidade atual em estoque: " + produtoAtualizar.getQuantidadeEstoque());
            System.out.print("Nova quantidade em estoque: ");
            int novaQuantidade = leitor.nextInt();

            leitor.nextLine();

            produtoAtualizar.setNome(novoNome);
            produtoAtualizar.setPreco(novoPreco);
            produtoAtualizar.setQuantidadeEstoque(novaQuantidade);

            System.out.println("Informações do produto atualizadas:");
            produtoAtualizar.exibirInformacoes();
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }


    public static void removerProdutoDoEstoque(Scanner leitor, List<Produto> estoque) {
        System.out.print("Digite o código do produto que deseja remover: ");
        int codigo = leitor.nextInt();

        leitor.nextLine();

        Produto produtoRemover = null;
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                produtoRemover = produto;
                break;
            }
        }

        if (produtoRemover != null) {
            estoque.remove(produtoRemover);
            System.out.println("Produto removido do estoque.");
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }


    public static void gerarRelatorioDeEstoque(List<Produto> estoque) {
        System.out.println("Relatório de estoque:");
        for (Produto produto : estoque) {
            produto.exibirInformacoes();
            System.out.println("Valor total em estoque: R$" + produto.calcularValorTotalEmEstoque());
            System.out.println();
        }
    }
}
