
package entity.controller;

import entity.view.Panel_home;

public class Controller_login {
    
    public void bt_acessar() {
        // Adicione lógica de login aqui, se necessário.
    }
    
    public void goHome() {
        if (Main.c1 != null && Main.c1.getView() != null) {
            Panel_home panelHome = new Panel_home();
            Main.c1.getView().setTelaHome(panelHome);
            Main.c1.getView().mostraTela(panelHome);
        } else {
            // Trate o cenário onde Main.c1 ou Main.c1.getView() é null
            System.err.println("Main.c1 ou Main.c1.getView() é null");
        }
    }
}
