package edu.desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

       boolean verificar = numeros.stream()
               .anyMatch(n -> n > 10);//verifica a lista se tem um numero maior que 10

        System.out.println("A lista tem um número maior que 10? " + verificar);
    }
}
