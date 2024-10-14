package edu.desafio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .distinct()//remove duplicatas
                .sorted(Comparator.reverseOrder())//ordena em ordem decrescente
                .skip(1)//pula n elementos
                .findFirst();//encontra o primeiro elemento da lista

        if(segundoMaior.isPresent()){
            System.out.println("Segundo maior: " + segundoMaior.get());
        }else {
            System.out.println("Não possui segundo maior");
        }
    }
}
