import java.util.ArrayList;
import java.util.HashMap;

public class Salao {
    private int numero;
    private int capacidade;
    private String nome;
    private String localidade;
    private String tipo;
    private Organizador organizador;
    private ArrayList<Reserva> reservaFeita;

    public Salao(int numero, int capacidade, String nome, String localidade, String tipo, Organizador organizador, ArrayList<Reserva> reservaFeita){
        this.numero = numero;
        this.capacidade = capacidade;
        this.nome = nome;
        this.localidade = localidade;
        this.tipo = tipo;
        this.organizador = organizador;
        this.reservaFeita = new ArrayList<>();
    }
    public ArrayList<Reserva> getReservaFeita() {
        return reservaFeita;
    }
    public void setReservaFeita(ArrayList<Reserva> reservaFeita) {
        this.reservaFeita = reservaFeita;
    }
    public Organizador getOrganizador() {
        return organizador;
    }
    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void organizadorResponsavel(Organizador organizador){
        this.organizador = organizador;
    }

    public void cadastrarReservas(Reserva reserva){
        if (reserva.getStatus().equals("finalizada") && reserva.getStatus().equals("solicitada")){
            System.out.println("Reserva Indisponivel");
        }else{
            reservaFeita.add(reserva);
        }
    }

    public int totalReservas(){
        return reservaFeita.size();
    }

    public int reservaFinalizada(){
        int total = 0;
        for(Reserva reserva : reservaFeita){
            if(reservaFeita.getStatus().equals("finalizada")){
                total++;
            }
        }
    }
}
