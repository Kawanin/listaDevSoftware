import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Agenda agenda = new Agenda();


        System.out.println("~ Bem-vindo à sua agenda de contatos! ~");
        System.out.println("");

        while (true) {
            System.out.println("~ Escolha uma opção: ~");
            System.out.println("~ 1. Adicionar contato ~");
            System.out.println("~ 2. Buscar contato por nome ~");
            System.out.println("~ 3. Sair ~");
            System.out.print("Opção: ");

            int opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do contato: ");
                    String nome = leitor.nextLine();
                    System.out.print("Telefone do contato: ");
                    String telefone = leitor.nextLine();
                    Contato novoContato = new Contato(nome, telefone);
                    agenda.adicionarContato(novoContato);
                    System.out.println("Contato adicionado com sucesso!");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Digite o nome do contato a ser buscado: ");
                    String nomeBusca = leitor.nextLine();
                    Contato contatoEncontrado = agenda.buscarContatoPorNome(nomeBusca);
                    if (contatoEncontrado != null) {
                        System.out.println("Contato encontrado:");
                        System.out.println("Nome: " + contatoEncontrado.getNome());
                        System.out.println("Telefone: " + contatoEncontrado.getTelefone());
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Saindo do programa. Até a próxima!");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    System.out.println();
                    break;
            }
        }
    }
}
