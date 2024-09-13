public class PessoaJuridica extends Pessoa{

    String cnpj;

    public PessoaJuridica(String nome, Integer idade, String cnpj) {
        super(nome, idade);
        this.cnpj = cnpj;
    }
}
