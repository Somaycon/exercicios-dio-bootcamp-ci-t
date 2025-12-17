package org.example.fundamentos.da.linguagem.de.programação.java;

import java.util.Scanner;

public class Execicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = scanner.next();

        System.out.println("Qual é o seu ano de nascimento?");
        int anoNas = scanner.nextInt();
        int anos = 2025 - anoNas;

        System.out.printf("Olá %s, você tem %s anos", nome, anos);
    }
}
