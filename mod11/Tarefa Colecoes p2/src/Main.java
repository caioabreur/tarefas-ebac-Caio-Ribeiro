import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Map<String, String> listaDeAlunos = new HashMap<>();
    static List<String> feminino = new ArrayList<>();
    static List<String> masculino = new ArrayList<>();

    public static void main(String[] args) {

        cadastrarAlunos();
        separarAlunos();
        mostrarGrupoDeAlunos();
    }

    private static void mostrarGrupoDeAlunos() {

        System.out.println("Grupo Feminino: ");
        System.out.println(feminino);
        System.out.println("Grupo Masculino");
        System.out.println(masculino);
    }

    private static void separarAlunos() {

        listaDeAlunos.forEach((aluno, sexo) -> {
            if(sexo.equalsIgnoreCase("M")) {
                masculino.add(aluno);
            } else {
                feminino.add(aluno);
            }
        });
    }

    private static void cadastrarAlunos() {

        novoAluno();

        String cadastro = "";

        while (!cadastro.equalsIgnoreCase("N")) {
            System.out.println("Deseja cadastra mais um aluno? S/N");
            cadastro = scanner.nextLine();

            if (cadastro.equalsIgnoreCase("S")) {
                novoAluno();
            }
        }
    }

    private static void novoAluno() {

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        System.out.println(" ");
        System.out.print("Digite o sexo do aluno: ");
        String sexoAluno = scanner.nextLine();

        listaDeAlunos.put(nomeAluno, sexoAluno);
    }
}