package edu.desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream()
                .map(String::valueOf)//transforma os digitos em String
                .flatMapToInt(String::chars)//divide as strings em seus caracteres
                .map(Character::getNumericValue)//transforma os caracteres em Int
                .sum();//soma

        System.out.println(soma);
    }
}
