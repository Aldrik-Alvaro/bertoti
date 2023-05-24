// Classe concreta do publicador contendo a lógica de negócio real
// que é interessante para alguns assinantes.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ShoppingCart {
    public EventManager events;
    private List<String> items;

    public ShoppingCart() {
        events = new EventManager();
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
        events.notify("itemAdded", item);
    }

    public void removeItem(String item) {
        items.remove(item);
        events.notify("itemRemoved", item);
    }
}