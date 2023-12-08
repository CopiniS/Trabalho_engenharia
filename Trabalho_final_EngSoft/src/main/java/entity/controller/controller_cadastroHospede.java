package entity.controller;

import entity.model.Hospede;
import entity.view.panel_cadastroReserva;
import entity.view.Panel_dayUse;
import entity.view.Panel_home;
import entity.view.Panel_mailing;
import entity.view.Panel_reservar;
import java.util.ArrayList;
import java.util.List;

public class Controller_cadastroHospede {
       private List<Hospede> hospedeList = new ArrayList<>();
       private List<String> servicos = new ArrayList<>();
    public void bt_homeMouseClicked(){
        Main.c1.getView().setTelaHome(new Panel_home(hospedeList, servicos));
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaHome());
    }
    
    public void bt_reservarMouseClicked(){
        Main.c1.getView().setTelaReservar(new Panel_reservar(null));
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaReservar());
    }
    
    public void bt_calendarioReservasMouseClicked(){
        Main.c1.getView().setTelaCalendario(new panel_cadastroReserva(hospedeList));
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaCalendario());
    }
    
    public void bt_dayUseMouseClicked(){
        Main.c1.getView().setTelaDayUse(new Panel_dayUse());
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaDayUse());
    }
    
    public void bt_mailingMouseClicked(){
        Main.c1.getView().setTelaMailing(new Panel_mailing());
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaMailing());
    }
    
    
    public void bt_salvaAlteracoesMouseClicked(String nome, String telefone, int quantidadeAcompanhantes, Enum tipoQuarto, String email){
     
    }
    
    
}
