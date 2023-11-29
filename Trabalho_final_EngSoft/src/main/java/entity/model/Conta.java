
package entity.model;
// PULL REQUEST
// teste 3
public class Conta {
    private int id;
    private Hospede hospede;
    private Servicos servicos;

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

    public Servicos getServicos() {
        return servicos;
    }

    public void setServicos(Servicos servicos) {
        this.servicos = servicos;
    }
    
    
    public void calculaTotal(){
        
    }
}
