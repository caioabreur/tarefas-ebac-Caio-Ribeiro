package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();



        System.out.println("Cadastrar pessoa: ");

        while (true) {
            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo: ");
            String sexo = scanner.nextLine().toUpperCase();

            if (!nome.isEmpty() && !sexo.isEmpty()) {
                pessoas.add(new Pessoa(nome, sexo));
            }


            System.out.println("Digite S para cadastrar mais uma pessoa: ");
            String opcao = scanner.nextLine();

            if (!opcao.equalsIgnoreCase("s")) {
                break;
            }
        }


        Stream<Pessoa> mulheres = pessoas.stream()
                                    .filter(pessoa -> pessoa.sexo.equalsIgnoreCase("f"));

        System.out.println("Mulheres da lista: ");
        mulheres.forEach(mulher -> System.out.println(mulher.getName()));


    }
}