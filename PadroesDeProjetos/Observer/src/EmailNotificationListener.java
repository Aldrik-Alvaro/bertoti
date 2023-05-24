// Os assinantes concretos reagem às atualizações emitidas pelo
//

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(Object data) {
        String item = (String) data;
        System.out.println("Enviando e-mail para " + email + ": O item '" + item + "' foi adicionado ao carrinho.");
    }
}
