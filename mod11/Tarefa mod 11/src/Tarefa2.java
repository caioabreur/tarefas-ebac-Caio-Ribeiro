import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tarefa2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes e os sexos: ");
        String nomes = scanner.nextLine();

        String[] nomesSeparados = nomes.split(",");

        List<String> lista = new ArrayList<>(List.of(nomesSeparados));

        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        for (String i : lista) {
            String[] dados = i.split(" -");

            String nome = dados[0].trim();
            String sexo = dados[1].trim();

            if (sexo.equalsIgnoreCase("M")) {
                masculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                feminino.add(nome);
            }
        }

        Collections.sort(masculino);
        Collections.sort(feminino);

        System.out.println("Masculino: ");
        System.out.println(masculino);

        System.out.println("Feminino: ");
        System.out.println(feminino);
    }
}
