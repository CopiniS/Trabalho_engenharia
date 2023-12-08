
package entity.controller;

import entity.model.Hospede;
import entity.model.Reserva;
import entity.view.Panel_cadastroHospede;
import entity.view.panel_cadastroReserva;
import entity.view.Panel_dayUse;
import entity.view.Panel_home;
import entity.view.Panel_mailing;
import java.util.Date;

public class Controller_reservar {
    
    public void bt_homeMouseClicked(){
        Main.c1.getView().setTelaHome(new Panel_home(null,null));
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaHome());
    }
    
    public void bt_calendarioReservasMouseClicked(){
        Main.c1.getView().setTelaCalendario(new panel_cadastroReserva(null));
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaCalendario());
    }
    
    public void bt_cadastrarHospedeMouseClicked(){
        Main.c1.getView().setTelaCadastro(new Panel_cadastroHospede(null));
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaCadastro());
    }
    
    public void bt_dayUseMouseClicked(){
        Main.c1.getView().setTelaDayUse(new Panel_dayUse());
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaDayUse());
    }
    
    public void bt_mailingMouseClicked(){
        Main.c1.getView().setTelaMailing(new Panel_mailing());
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaMailing());
    }
    
    public void bt_salvarAlteracoesMouseClicked(Date chegada, Date saida, Hospede hospede, Enum statusQuarto){
        Reserva r = new Reserva(chegada, saida, hospede, statusQuarto);
    }
    
}
