import java.lang.annotation.RetentionPolicy;

@Tabela(value = "Tabela de preços")
public class UsandoAnotacao {

    String name;
    Long cpf;
    Boolean verificado;

    @Tabela(value = "Tabela de preços")
    static void metodoComAnotacao() {

    }

}
