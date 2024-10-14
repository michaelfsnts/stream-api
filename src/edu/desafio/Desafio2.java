package edu.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaPares = numeros.stream()
                .filter(n -> n % 2 == 0)//filtra os numeros pares
                .mapToInt(Integer::intValue)//Converte em int
                .sum();//soma
        System.out.println(somaPares);
    }
}
