import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite suas notas!");
        long nota1 = scanner.nextLong();
        long nota2 = scanner.nextLong();
        long nota3 = scanner.nextLong();
        long nota4 = scanner.nextLong();

        calcMedia(nota1, nota2, nota3, nota4);
    }

    public static void calcMedia(long n1, long n2, long n3, long n4) {
        long media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Sua nota média é:");
        System.out.println(media);
    }
}
