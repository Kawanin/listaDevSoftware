import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;


    public Agenda() {
        this.contatos = new ArrayList<>();
    }


    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    
    public Contato buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }
}
