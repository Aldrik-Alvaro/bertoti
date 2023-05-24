package facade;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String usarFaca(Faca faca) {
        return faca.cortar();
    }

    public static void main(String[] args) {
        Faca facaAfiada = new Faca("Afiado");
        Faca facaCega = new Faca("Cego");

        Pessoa pessoa1 = new Pessoa("João");
        Pessoa pessoa2 = new Pessoa("Maria");

        System.out.println(pessoa1.usarFaca(facaAfiada));
        System.out.println(pessoa2.usarFaca(facaCega));
    }
}