public class PessoaFisica extends Pessoa {

    String cpf;

    public PessoaFisica(String nome, Integer idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }
}
