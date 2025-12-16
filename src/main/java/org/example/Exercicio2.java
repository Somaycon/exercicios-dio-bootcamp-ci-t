package org.example;

import java.util.Scanner;

/**
 * Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor referente a um lado de um quadrado: \n");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.printf("A área do quadrado é %s", area);
    }
}
