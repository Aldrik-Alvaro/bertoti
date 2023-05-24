// O código do cliente trabalha com todos os componentes por meio
// de sua interface base. Dessa forma, o código do cliente pode
// lidar tanto com componentes folha simples quanto com compostos
import java.util.List;
// complexos.
public class Organizacao {
    public static void main(String[] args) {
        Departamento rh = new Departamento("Recursos Humanos");
        rh.adicionar(new Cargo("Gerente de RH"));
        rh.adicionar(new Cargo("Analista de RH"));

        Departamento ti = new Departamento("Tecnologia da Informação");
        ti.adicionar(new Cargo("Diretor de TI"));
        ti.adicionar(new Cargo("Desenvolvedor"));
        ti.adicionar(new Cargo("Analista de Sistemas"));

        Departamento vendas = new Departamento("Vendas");
        vendas.adicionar(new Cargo("Diretor de Vendas"));
        vendas.adicionar(new Cargo("Vendedor"));

        Departamento empresa = new Departamento("Empresa");
        empresa.adicionar(rh);
        empresa.adicionar(ti);
        empresa.adicionar(vendas);

        empresa.exibirInformacoes();
    }
}