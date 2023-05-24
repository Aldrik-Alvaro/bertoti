// Um aplicativo pode configurar publicadores e assinantes em tempo de execução.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Application {
    public void config() {
        ShoppingCart cart = new ShoppingCart();

        EmailNotificationListener emailListener = new EmailNotificationListener("user@example.com");
        cart.events.subscribe("itemAdded", emailListener);

        LoggingListener loggingListener = new LoggingListener("/path/to/log.txt");
        cart.events.subscribe("itemRemoved", loggingListener);

        // Simulando ações no carrinho de compras
        cart.addItem("Camiseta");
        cart.removeItem("Calça");
    }
}