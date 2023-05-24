package facade;

public class Faca {
    private String lado;

    public Faca(String lado) {
        this.lado = lado;
    }

    public String cortar() {
        if (lado.equals("Afiado")) {
            return "Cortou!";
        } else {
            return "Não cortou.";
        }
    }
}
