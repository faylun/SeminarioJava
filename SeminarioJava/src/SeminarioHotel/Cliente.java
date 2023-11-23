package SeminarioHotel;

public class Cliente {
    private String nome;
    private int codigo;
    private String telefone;

    public Cliente(){

    }

    public Cliente(String nome, int codigo, String telefone) {
        this.nome = nome;
        this.codigo = codigo;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "\n\tNome = " + nome  +
                "\n\tCodigo = " + codigo +
                "\n\tTelefone = " + telefone +
                "\n}";
    }
}
