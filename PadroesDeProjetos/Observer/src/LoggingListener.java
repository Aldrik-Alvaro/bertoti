import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LoggingListener implements EventListener {
    private String logFile;

    public LoggingListener(String logFile) {
        this.logFile = logFile;
    }

    @Override
    public void update(Object data) {
        String item = (String) data;
        System.out.println("Registrando no arquivo de log '" + logFile + "': O item '" + item + "' foi removido do carrinho.");
    }
}