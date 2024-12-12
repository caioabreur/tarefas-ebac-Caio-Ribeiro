import java.lang.annotation.*;


@Target({ElementType.METHOD, ElementType.TYPE})
@Documented
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Tabela {

    String value();

}
