import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        UsandoAnotacao prod = new UsandoAnotacao();

        if (prod.getClass().isAnnotationPresent(Tabela.class)) {

            Tabela tabela = prod.getClass().getAnnotation(Tabela.class);
            System.out.println("Nome da anotação: " + tabela.getClass().getName());
            System.out.println("Valor da anotação: " + tabela.value());
        }
    }
}