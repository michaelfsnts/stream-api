package edu.exemplos;

import java.util.List;
import java.util.stream.Stream;

public class SupplierExemplo {
    public static void main(String[] args) {

        List<String> listaSaudacao = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
                .limit(5)
                .toList();

        listaSaudacao.forEach(System.out::println);

    }
}
