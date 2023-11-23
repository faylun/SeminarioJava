package SeminarioHotel;

import java.util.Random;

public class Pedido {
    private final int numero;
    private final Cliente cliente;
    private final Vendedor vendedor;
    private final Hotel hotel;
    private final Quarto quarto;

    private Pedido(Cliente cliente, Vendedor vendedor, Hotel hotel, Quarto quarto) {
        this.numero = new Random().nextInt();
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.hotel = hotel;
        this.quarto = quarto;
    }

    public static class PedidoBuilder implements Builder{
        private Cliente cliente;
        private Vendedor vendedor;
        private Hotel hotel;
        private Quarto quarto;


        @Override
        public PedidoBuilder buildCliente(String nome, int codigo, String telefone){
            this.cliente = new Cliente(nome, codigo, telefone);
            return this;
        }

        @Override
        public PedidoBuilder buildVendedor(int codigo, String nome){
            this.vendedor = new Vendedor(codigo, nome);
            return this;
        }

        @Override
        public PedidoBuilder buildHotel(String nome, boolean aberto, int andares, boolean temEstacionamento){
            this.hotel = new Hotel(nome, aberto, andares, temEstacionamento);
            return this;
        }

        @Override
        public PedidoBuilder buildQuarto(String tipo, boolean status, int capacidade, double diaria){
            this.quarto = new Quarto(tipo, status, capacidade, diaria);
            return this;
        }

        @Override
        public Pedido build() {
            return new Pedido(cliente, vendedor, hotel, quarto);
        }
    }
    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }


    public Vendedor getVendedor() {
        return vendedor;
    }


    public Hotel getHotel() {
        return hotel;
    }


    public Quarto getQuarto() {
        return quarto;
    }


    @Override
    public String toString() {
        return "---------------- PEDIDO NUMERO " + Math.abs(this.numero) + " ----------------" +
                "\nNome do Hotel = " + hotel.getNome() +
                "\nNome do Cliente = " + cliente.getNome() +
                "\n\nQuarto Numero " + quarto.getNumero() +
                "\nCapacidade de Pessoas = " + quarto.getCapacidade() +
                "\nStatus do Quarto = " + (quarto.isStatus() ? "Disponivel" : "Indisponivel")  +
                "\nTipo do Quarto = " + quarto.getTipo() +
                "\nDiaria = R$" + quarto.getDiaria() +
                "\n----------------------------------------------------------";
    }
}
