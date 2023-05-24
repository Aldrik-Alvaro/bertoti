// A classe Composto representa componentes complexos que podem
// ter filhos. Os objetos compostos geralmente delegam o trabalho
// real aos seus filhos e depois "somam" o resultado.
import java.util.List;
import java.util.ArrayList;

class Departamento implements Componente {
    private String nome;
    private List<Componente> subcomponentes;

    public Departamento(String nome) {
        this.nome = nome;
        this.subcomponentes = new ArrayList<>();
    }

    public void adicionar(Componente componente) {
        subcomponentes.add(componente);
    }

    public void remover(Componente componente) {
        subcomponentes.remove(componente);
    }

    public void exibirInformacoes() {
        System.out.println("Departamento: " + nome);
        for (Componente componente : subcomponentes) {
            componente.exibirInformacoes();
        }
    }
}