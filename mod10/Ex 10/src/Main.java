import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as notas: ");
        Integer nota1 = scanner.nextInt();
        Integer nota2 = scanner.nextInt();
        Integer nota3 = scanner.nextInt();
        Integer nota4 = scanner.nextInt();

        calcMedia(nota1, nota2, nota3, nota4);
    }

    private static void calcMedia(Integer n1, Integer n2, Integer n3, Integer n4) {

        Integer media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7) {
            System.out.print("Aprovado!");
        } else if (media >= 5) {
            System.out.print("Recuperação!");
        } else {
            System.out.print("Reprovado!");
        }
    }
}