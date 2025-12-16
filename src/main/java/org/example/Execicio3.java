package org.example;

import java.util.Scanner;

/**
 * Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
 */
public class Execicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base de um triangulo:");
        double base = scanner.nextDouble();

        System.out.println("Digite o valor da altura de um triangulo:");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.printf("A área do retângulo é %s", area);
    }
}
