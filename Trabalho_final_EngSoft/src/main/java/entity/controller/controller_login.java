package entity.controller;

import entity.view.Panel_dayUse;

public class Controller_login {

    public void bt_acessar() {
        Main.c1.view.mostraTela(Main.c1.getView().getTelaHome()); //Mostra o painel.
    }

    public void goHome() {
        if (Main.c1 != null && Main.c1.getView() != null) {
            Panel_dayUse panelHome = new Panel_dayUse();
            Main.c1.view.setTelaDayUse(panelHome);
            Main.c1.view.mostraTela(panelHome);
        } else {
            // Trate o cenário onde Main.c1 ou Main.c1.getView() é null
            System.err.println("Main.c1 ou Main.c1.getView() é null");
        }
    }
}
