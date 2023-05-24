import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Classe base do publicador que inclui o gerenciamento de assinaturas
// e métodos de notificação.
class EventManager {
    private Map<String, List<EventListener>> listeners;

    public EventManager() {
        listeners = new HashMap<>();
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> eventListeners = listeners.getOrDefault(eventType, new ArrayList<>());
        eventListeners.add(listener);
        listeners.put(eventType, eventListeners);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> eventListeners = listeners.getOrDefault(eventType, new ArrayList<>());
        eventListeners.remove(listener);
        listeners.put(eventType, eventListeners);
    }

    public void notify(String eventType, Object data) {
        List<EventListener> eventListeners = listeners.getOrDefault(eventType, new ArrayList<>());
        for (EventListener listener : eventListeners) {
            listener.update(data);
        }
    }
}
