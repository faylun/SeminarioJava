package SeminarioHotel;

import java.util.Random;

public class Quarto {
    private final int numero;
    private String tipo;
    private boolean status;
    private int capacidade;
    private double diaria;

    public Quarto(String tipo, boolean status, int capacidade, double diaria) {

        this.tipo = tipo;
        this.status = status;
        this.capacidade = capacidade;
        this.diaria = diaria;
        this.numero = new Random().nextInt(100) + 1;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    @Override
    public String toString() {
        return "\n\nQuarto Numero " + this.numero + "\n{" +
                "\n\tTipo = " + tipo +
                "\n\tStatus = " + (this.status ? "Disponivel" : "Indisponivel") +
                "\n\tCapacidade = " + capacidade +
                "\n\tDiaria = R$" + this.diaria +
                "\n}";
    }
}
