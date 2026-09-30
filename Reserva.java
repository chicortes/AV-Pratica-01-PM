import java.util.HashMap;

public class Reserva {
    private int codigo;
    private String nome;
    private String data;
    private String horario;
    private int convidados;
    private String status;
    private double valortotal;

    public Reserva(int codigo, String nome, String data, String horario, int convidados, String status,  double valortotal){
        this.codigo = codigo;
        this.nome = nome;
        this.data = data;
        this.horario = horario;
        this.convidados = convidados;
        this.status = status;
        this.valortotal = valortotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getConvidados() {
        return convidados;
    }

    public void setConvidados(int convidados) {
        this.convidados = convidados;
    }

    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
