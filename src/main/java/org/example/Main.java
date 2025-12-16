package org.example;

import java.util.Scanner;

/**
 * Escreva um código que receba o nome e o ano de nascimento de alguém
 * e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
 */
public class Main {
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