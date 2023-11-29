
package entity.controller;

import entity.view.Panel_home;

public class Controller_login {
    
    public void bt_acessar(){
        
    }
    
    public void goHome(){
        Main.c1.getView().setTelaHome(new Panel_home());
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaHome());
    }
}
