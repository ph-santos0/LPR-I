package main;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.UIManager;
import visao.usuario.TelaLogin;

/**
 *
 * @author wfabi0
 */
public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
    }

}
