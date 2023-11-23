package SeminarioHotel;

import java.util.ArrayList;

public class Hotel {
        private String nome;
        private int andares;
        private boolean possuiEstacionamento;
        private boolean aberto;

        private ArrayList<Quarto> quartos;

    public Hotel(String nome, boolean aberto, int andares, boolean temEstacionamento) {
        this.nome = nome;
        this.aberto = aberto;
        this.andares = andares;
        this.possuiEstacionamento = temEstacionamento; 
        quartos = new ArrayList<>();
    }

    public void addQuarto(Quarto quarto){
        if (quarto.isStatus())
            quartos.add(quarto);
    }

    public void removeQuarto(Quarto quarto){
        if (quartos != null)
            quartos.remove(quarto);
    }

    public int quantidadeQuartoDisponivel(){
        return quartos.size();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(ArrayList<Quarto> quartos) {
        this.quartos = quartos;
    }

    @Override
    public String toString() {
        return "\n============= HOTEL =============" +
                "\nNome = " + nome +
                "\nAberto = " + aberto +
                "\nQuantidade quartos disponiveis: " + this.quantidadeQuartoDisponivel() +
                "\n" + quartos +
                "\n================================\n";
    }
}
