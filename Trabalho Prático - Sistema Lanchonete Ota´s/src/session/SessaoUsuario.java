package session;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wfabi0
 */
public class SessaoUsuario {

    private static Map<String, Object> sessao = new HashMap<>();

    public static void setAtributo(String chave, Object valor) {
        sessao.put(chave, valor);
    }

    public static Object getAtributo(String chave) {
        return sessao.get(chave);
    }

    public static void limparSessao() {
        sessao.clear();
    }

}
