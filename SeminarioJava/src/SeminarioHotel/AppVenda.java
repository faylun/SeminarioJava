package SeminarioHotel;

public class AppVenda {
    public static void main(String[] args) throws InterruptedException {

        /*        SEM O BUILDER        */

//        Vendedor vendedor1 = new Vendedor(1, "Kauan");
//        Vendedor vendedor2 = new Vendedor(2, "Maria");
//        Vendedor vendedor3 = new Vendedor(3, "Carla");
//
//        Quarto quarto1 = new Quarto("Suite", true, 3, 500.00);
//        Quarto quarto2 = new Quarto("Padrao", true,1, 150.00);
//        Quarto quarto3 = new Quarto("Deluxe", false,5, 800.00);
//
//        Cliente cliente1 = new Cliente("Jose", 2, "489999999");
//        Cliente cliente2 = new Cliente("Pedro", 4, "4897896967");
//        Cliente cliente3 = new Cliente("Vitor", 6, "4856499675");
//
//        Hotel hotel = new Hotel("Hotel tech", true);
//        hotel.addQuarto(quarto1);
//        hotel.addQuarto(quarto2);
//        hotel.addQuarto(quarto3);
//
//        Pedido pedido1 = new Pedido(cliente1, vendedor1, hotel, quarto1);
//        Pedido pedido2 = new Pedido(cliente2, vendedor2, hotel, quarto1);
//        Pedido pedido3 = new Pedido(cliente3, vendedor3, hotel, quarto1);
//
//        System.out.println(hotel);
//        System.out.println(cliente1);
//        System.out.println(vendedor1);
//
//        System.out.println(pedido1);
//        Thread.sleep(2000);
//        System.out.println();
//        System.out.println(pedido2);
//        Thread.sleep(2000);
//        System.out.println();
//        System.out.println(pedido3);


        /*        COM O BUILDER        */

        Pedido pedido = new Pedido.PedidoBuilder()
                .buildCliente("Joaozin Techzin", 1, "48999887766")
                .buildVendedor(1, "Jose Costa")
                .buildQuarto("5 estrelas", true, 3, 1200.00)
                .buildHotel("Techzin Liz", true)
                .build();

        System.out.println(pedido);
    }
}
