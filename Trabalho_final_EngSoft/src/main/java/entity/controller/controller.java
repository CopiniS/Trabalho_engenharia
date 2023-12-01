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

    public Controller(AplicationView view) {
        this.view = view;

        controllerLoging = new Controller_login();
        controllerCadastroHospede = new Controller_cadastroHospede();
        controllerCalendario = new Controller_calendario();
        controllerDayUse = new Controller_dayUSe();
        controllerHome = new Controller_home();
        controllerMainling = new Controller_mailing();
        controllerReservar = new Controller_reservar();
    }

    public Controller_login getControllerLoging() {
        return controllerLoging;
    }

    public void setControllerLoging(Controller_login controllerLoging) {
        this.controllerLoging = controllerLoging;
    }

    public Controller_cadastroHospede getControllerCadastroHospede() {
        return controllerCadastroHospede;
    }

    public void setControllerCadastroHospede(Controller_cadastroHospede controllerCadastroHospede) {
        this.controllerCadastroHospede = controllerCadastroHospede;
    }

    public Controller_calendario getControllerCalendario() {
        return controllerCalendario;
    }

    public void setControllerCalendario(Controller_calendario controllerCalendario) {
        this.controllerCalendario = controllerCalendario;
    }

    public Controller_dayUSe getControllerDayUse() {
        return controllerDayUse;
    }

    public void setControllerDayUse(Controller_dayUSe controllerDayUse) {
        this.controllerDayUse = controllerDayUse;
    }

    public Controller_home getControllerHome() {
        return controllerHome;
    }

    public void setControllerHome(Controller_home controllerHome) {
        this.controllerHome = controllerHome;
    }

    public Controller_mailing getControllerMainling() {
        return controllerMainling;
    }

    public void setControllerMainling(Controller_mailing controllerMainling) {
        this.controllerMainling = controllerMainling;
    }

    public Controller_reservar getControllerReservar() {
        return controllerReservar;
    }

    public void setControllerReservar(Controller_reservar controllerReservar) {
        this.controllerReservar = controllerReservar;
    }

    public void start() {
        Controller.view.setTelaLogin(new Panel_login());
        Controller.view.mostraTela(Controller.view.getTelaLogin()); // Mostra a tela de cadastro.
    }

    public static AplicationView getView() {
        return view;
    }

    public static void setView(AplicationView view) {
        Controller.view = view;
    }

}
