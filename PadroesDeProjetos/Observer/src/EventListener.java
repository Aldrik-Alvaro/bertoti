// Interface do assinante. Se a linguagem de programação suportar
// tipos funcionais, é possível substituir toda a hierarquia de
// assinantes por um conjunto de funções.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface EventListener {
    void update(Object data);
}
