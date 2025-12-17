package org.example.fundamentos.da.linguagem.de.programação.java;

import java.util.Scanner;

/**
 * Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade da primeira pessoa:");
        int idade1 = scanner.nextInt();
        System.out.println("Digite a idade da segunda pessoa:");
        int idade2 = scanner.nextInt();

        if (idade1 >= idade2){
            int diferenca = idade1 - idade2;
            System.out.printf("A diferença de idade é de %s", diferenca);
        }
        else{
            int diferenca = idade2 - idade1;
            System.out.printf("A diferença de idade é de %s", diferenca);
        }

    }
}
