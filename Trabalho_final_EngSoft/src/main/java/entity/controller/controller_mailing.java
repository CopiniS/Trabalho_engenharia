
package entity.controller;

import entity.view.Panel_cadastroHospede;
import entity.view.panel_cadastroReserva;
import entity.view.Panel_dayUse;
import entity.view.Panel_home;
import entity.view.Panel_reservar;

public class Controller_mailing {
    
    public void bt_homeMouseClicked(){
        Main.c1.getView().setTelaHome(new Panel_home());
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaHome());
    }
    
    public void bt_reservarMouseClicked(){
        Main.c1.getView().setTelaReservar(new Panel_reservar(null));
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaReservar());
    }
    
    public void bt_cadastrarHospedeMouseClicked(){
        Main.c1.getView().setTelaCadastro(new Panel_cadastroHospede());
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaCadastro());
    }
    
    public void bt_dayUseMouseClicked(){
        Main.c1.getView().setTelaDayUse(new Panel_dayUse());
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaDayUse());
    }
    
    public void bt_calendarioReservasMouseClicked(){
        Main.c1.getView().setTelaCalendario(new panel_cadastroReserva());
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaCalendario());
    }
    
}
