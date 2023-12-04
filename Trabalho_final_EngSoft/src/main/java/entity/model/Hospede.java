
package entity.model;
//teste 4
import java.util.Date;
import java.util.List;

public class Hospede {
    private int id;
    private String nome;
    private String telefone;
    private int quantidadeAcompanhantes;
    private Enum tipoQuarto;
    private String email;
    private String check_in;
    private String check_out;
    private List<String> servicos;

    public Hospede(String nome, String telefone, int quantidadeAcompanhantes, Enum tipoQuarto, String email, List<String> servicos) {
        this.nome = nome;
        this.telefone = telefone;
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
        this.tipoQuarto = tipoQuarto;
        this.email = email;
        this.servicos = servicos;
    }

    public List<String> getServicos() {
        return servicos;
    }

    public void setServicos(List<String> servicos) {
        this.servicos = servicos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getQuantidadeAcompanhantes() {
        return quantidadeAcompanhantes;
    }

    public void setQuantidadeAcompanhantes(int quantidadeAcompanhantes) {
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCheck_in() {
        return check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public String getCheck_out() {
        return check_out;
    }

    public void setCheck_out(String check_out) {
        this.check_out = check_out;
    }

    public Enum getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(Enum tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }
    
    
    
    public void adicionaServico(){
        
    }
    
    public Object realizaCheck_in(){
        Object exemplo = "exemplo";
        return exemplo;
    }
    
    public Object realizaCheck_out(){
        Object exemplo = "exemplo";
        return exemplo;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
