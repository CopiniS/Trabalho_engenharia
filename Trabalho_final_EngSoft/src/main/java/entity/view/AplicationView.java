
package entity.view;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class AplicationView {
    private Janela janela;
    private Panel_login telaLogin;
    private Panel_cadastroHospede telaCadastro;
    private panel_cadastroReserva telaCalendario;
    private Panel_dayUse telaDayUse;
    private Panel_home telaHome;
    private Panel_mailing telaMainling;
    private Panel_reservar telaReservar;
    
    
    public AplicationView(){
           this.janela = new Janela();
        this.janela.setLocationRelativeTo(null);   //Posiciona no meio da tela.
        this.janela.setVisible(true);  
    }
    
    
    //Método genérico que recebe por parâmetro o painel que será mostrado no JFrame janela.
    public void mostraTela(JPanel newPanel){
        this.janela.getContentPane().removeAll();       //Remove o conteúdo atual do frame.
        this.janela.add(newPanel, BorderLayout.CENTER); //Adiciona o novo painel ao frame.
        this.janela.pack();   
            
    //Redimensiona o frame.
    }
    
    //Método para encerrar a aplicação.
    public void fechaJanela(){
        this.janela.dispose(); //Fecha o frame.
    }
    
    public Janela getJanela() {
        return janela;
    }

    public void setJanela(Janela janela) {
        this.janela = janela;
    }
    
    public Panel_login getTelaLogin() {
        return telaLogin;
    }

    public void setTelaLogin(Panel_login telaLogin) {
        this.telaLogin = telaLogin;
    }
    
    public Panel_cadastroHospede getTelaCadastro() {
        return telaCadastro;
    }

    public void setTelaCadastro(Panel_cadastroHospede telaCadastro) {
        this.telaCadastro = telaCadastro;
    }
    
    public panel_cadastroReserva getTelaCalendario() {
        return telaCalendario;
    }

    public void setTelaCalendario(panel_cadastroReserva telaCalendario) {
        this.telaCalendario = telaCalendario;
    }
    
    public Panel_dayUse getTelaDayUse() {
        return telaDayUse;
    }

    public void setTelaDayUse(Panel_dayUse telaDayUse) {
        this.telaDayUse = telaDayUse;
    }
    
    public Panel_home getTelaHome() {
        return telaHome;
    }

    public void setTelaHome(Panel_home telaHome) {
        this.telaHome = telaHome;
    }
    
    public Panel_mailing getTelaMailing() {
        return telaMainling;
    }

    public void setTelaMailing(Panel_mailing telaMailing) {
        this.telaMainling = telaMailing;
    }
    
    public Panel_reservar getTelaReservar() {
        return telaReservar;
    }

    public void setTelaReservar(Panel_reservar telaReservar) {
        this.telaReservar = telaReservar;
    }
    
}
