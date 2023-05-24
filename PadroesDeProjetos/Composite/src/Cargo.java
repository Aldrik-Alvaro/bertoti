// A classe Folha representa os objetos finais de uma composição.
// Um objeto folha não pode ter subobjetos. Geralmente, são as
// folhas que realizam o trabalho real, enquanto os objetos
// compostos apenas delegam para seus subcomponentes.
class Cargo implements Componente {
    private String nome;

    public Cargo(String nome) {
        this.nome = nome;
    }

    public void exibirInformacoes() {
        System.out.println("Cargo: " + nome);
    }
}