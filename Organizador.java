public class Organizador {
    private String nome;
    private String cpf;
    private String telefone;
    private String area;

    public Organizador(String nome, String cpf, String telefone, String area){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
