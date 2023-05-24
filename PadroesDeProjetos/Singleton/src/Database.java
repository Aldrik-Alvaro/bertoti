public class Database {
    private static Database instance;

    private Database() {
        // Construtor privado para evitar chamadas diretas com o operador 'new'
        // Inicialização da conexão com o banco de dados
        // ...
    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String sql) {
        // Lógica para executar consultas no banco de dados
        // ...
    }
}