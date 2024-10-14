package edu.desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> impares = numeros.stream()
                .filter(n -> n % 2 != 0)//filtra os impares
                .filter(n -> n % 3 == 0 || n % 5 == 0)//filtra os numeros que dividem por 3 e 5
                .toList();

        System.out.println(impares);
    }
}
