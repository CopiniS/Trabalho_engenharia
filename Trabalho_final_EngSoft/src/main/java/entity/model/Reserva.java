
package entity.model;

public class Reserva {
    private int id;
    private Hospede hospede;
    private Enum statusQuarto;
    private Servicos servico;

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
    
    
    
    public void VerificaQuartos(){
        
    }
}
