package edu.desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream()
                .map(n -> n * n) // Eleva cada numero ao quadrado
                .mapToInt(Integer::intValue)//Converte em IntStream
                .sum();//soma

        System.out.println(soma);
    }
}
