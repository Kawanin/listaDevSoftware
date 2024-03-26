import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo a organizadora da biblioteca!");

        System.out.print("Digite os dados do Livro 1:");

        System.out.println(" ");

        System.out.print("Título: ");
        String titulo1 = leitor.nextLine();

        System.out.println(" ");

        System.out.print("Autor: ");
        String autor1 = leitor.nextLine();

        System.out.println(" ");

        System.out.print("Ano de Publicação: ");
        int ano1 = leitor.nextInt(); 

        Livro livro1 = new Livro(titulo1, autor1, ano1);

        System.out.println("------------------------");

        System.out.println("Digite os dados do Livro 2:");

        System.out.println(" ");

        System.out.print("Título: ");
        String titulo2 = leitor.nextLine();

        System.out.println(" ");

        System.out.print("Autor: ");
        String autor2 = leitor.nextLine();

        System.out.println(" ");

        System.out.print("Ano de Publicação: ");
        int ano2 = leitor.nextInt();

        Livro livro2 = new Livro(titulo2, autor2, ano2);

        System.out.println(" ");
        System.out.println("------------------------");

        System.out.println("Informações do Livro 1:");

        livro1.exibirInfo();

        System.out.println(" ");

        System.out.println("Informações do Livro 2:");
        
        livro2.exibirInfo();
    }
}
