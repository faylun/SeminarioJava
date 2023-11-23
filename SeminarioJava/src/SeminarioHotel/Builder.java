package SeminarioHotel;

public interface Builder {

    Builder buildCliente(String nome, int codigo, String telefone);
    Builder buildVendedor(int codigo, String nome);
    Builder buildHotel(String nome, boolean aberto, int andares, boolean temEstacionamento);
    Builder buildQuarto(String tipo, boolean status, int capacidade, double diaria);
    Pedido build();
}
