import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        UsandoAnotacao prod = new UsandoAnotacao();

        Field[] fields = prod.getClass().getDeclaredFields();

        for (Field field : fields) {
            System.out.println("Nome comppleto: " + field);
            System.out.println("Nome simples: " + field.getName());
            System.out.println("Tipo de propriedade: " + field.getType());
        }
    }
}