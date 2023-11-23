package SeminarioHotel;

public class Diretor {
    public void construirPedidoCompleto(Pedido.PedidoBuilder pedidoBuilder) {
        pedidoBuilder
                .buildVendedor(1, "VendedorNome")
                .buildHotel("Hotel Tech", true, 7, true)
                .build();
    }
}
