import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tarefa1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes separado por virgúlas: ");

        String nomes = scanner.nextLine();

        String[] nomesSeparados = nomes.split(",");

        List<String> lista = new ArrayList<>(List.of(nomesSeparados));

        Collections.sort(lista);

        System.out.println(lista);
    }
}