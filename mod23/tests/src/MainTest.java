package src;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testeMain() {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", "F"));
        pessoas.add(new Pessoa("Maria", "F"));
        pessoas.add(new Pessoa("Pedro", "M")); // Não é mulher

        Stream<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("F"));

        assertTrue(mulheres.allMatch(pessoa -> pessoa.getSexo().equalsIgnoreCase("F"))
        );
    }
}