
package entity.model;

import java.util.Date;

public class Reserva {
    private int id;
    private Date chegada;
    private Date saida;
    private Hospede hospede;
    private Enum statusQuarto;
    private Servicos servico;

    public Reserva(Date chegada, Date saida, Hospede hospede, Enum statusQuarto) {
        this.chegada = chegada;
        this.saida = saida;
        this.hospede = hospede;
        this.statusQuarto = statusQuarto;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Enum getStatusQuarto() {
        return statusQuarto;
    }

    public void setStatusQuarto(Enum statusQuarto) {
        this.statusQuarto = statusQuarto;
    }

    public Servicos getServico() {
        return servico;
    }

    public void setServico(Servicos servico) {
        this.servico = servico;
    }

    public Date getChegada() {
        return chegada;
    }

    public void setChegada(Date chegada) {
        this.chegada = chegada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }
    
    
    
    public void VerificaQuartos(){
        
    }
    
}
