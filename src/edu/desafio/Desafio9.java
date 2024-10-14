package edu.desafio;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Set<Integer> numeroUnico = new HashSet<>(); // Set não permite duplicatas

        boolean verificar = numeros.stream()
                .allMatch(numeroUnico::add);//adiciona ao Set, caso tenha repetido o Set retorna false, sendo assim o All match também.

        System.out.println(verificar);
    }
}
