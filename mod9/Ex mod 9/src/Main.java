import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número");
        int numero = scanner.nextInt();
        int numero2 = Integer.valueOf(numero);
        
        System.out.println("O número foi: ");
        System.out.println(numero2);
    }
}