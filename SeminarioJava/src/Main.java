public class Main {
    public static void main(String[] args) {
            Usuario usuario = new Usuario.usuarioBuilder().usuarioComNome("Chat")
                    .usuarioComSobrenome("GPT")
                    .usuarioIdade(23)
                    .usuarioTelefone("489999999")
                    .usuarioEndereco("Rua Limaozin").build();

        System.out.println();
        System.out.printf(usuario.toString());
    }
}