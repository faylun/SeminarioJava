public class Usuario {
    private String nome;
    private String sobrenome;
    private Integer idade;
    private String telefone;
    private String endereco;

    private Usuario(String nome, String sobrenome, Integer idade, String telefone, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public static class usuarioBuilder {
        private String nome;
        private String sobrenome;
        private int idade;
        private String telefone;
        private String endereco;
        public usuarioBuilder usuarioComNome(String nome){
            this.nome = nome;
            return this;
        }

        public usuarioBuilder usuarioComSobrenome(String sobrenome){
            this.sobrenome = sobrenome;
            return this;
        }

        public usuarioBuilder usuarioIdade(int idade){
            this.idade = idade;
            return this;
        }

        public usuarioBuilder usuarioTelefone(String telefone){
            this.telefone = telefone;
            return this;
        }

        public usuarioBuilder usuarioEndereco(String endereco){
            this.endereco = endereco;
            return this;
        }

        public Usuario build(){
            return new Usuario(nome, sobrenome, idade, telefone, endereco);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Usuario {\n\n" +
                "Nome = " + nome + '\n' +
                "Sobrenome = " + sobrenome + '\n' +
                "Idade = " + this.idade + '\n' +
                "Telefone = " + telefone + '\n' +
                "Endereco = " + endereco + '\n' +
                "\n}";
    }
}
