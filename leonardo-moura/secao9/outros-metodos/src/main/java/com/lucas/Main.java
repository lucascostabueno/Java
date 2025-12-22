package com.lucas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aluno a1= new Aluno ("Апа", 7.8);
        Aluno a2 = new Aluno ("Bia", 5.8);
        Aluno a3 = new Aluno ("Daniel", 9.8);
        Aluno a4 = new Aluno ("Gui", 6.8);
        Aluno a5 = new Aluno ("Rebeca", 7.1);
        Aluno a6 = new Aluno ("Pedro", 8.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        System.out.println("distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\ntakeWhile");
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);
    }
}