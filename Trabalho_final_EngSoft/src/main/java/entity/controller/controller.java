package entity.controller;

import entity.view.AplicationView;
import entity.view.Panel_login;

public class Controller {
    static AplicationView view;
    Controller_login controllerLoging;
    Controller_cadastroHospede controllerCadastroHospede;
    Controller_calendario controllerCalendario;
    Controller_dayUSe controllerDayUse;
    Controller_home controllerHome;
    Controller_mailing controllerMainling;
    Controller_reservar controllerReservar;
    
    public Controller(AplicationView view){
        this.view = view;
        
        controllerLoging = new Controller_login();
        controllerCadastroHospede = new Controller_cadastroHospede();
        controllerCalendario = new Controller_calendario();
        controllerDayUse = new Controller_dayUSe();
        controllerHome = new Controller_home();
        controllerMainling = new Controller_mailing();
        controllerReservar = new Controller_reservar();
    }
    
    public void start(){
        Panel_login telaLogin = new Panel_login();
        this.view.setTelaLogin(telaLogin);
        this.view.mostraTela(telaLogin);   
    }

    public static AplicationView getView() {
        return view;
    }

    public static void setView(AplicationView view) {
        Controller.view = view;
    }
    
    
}

