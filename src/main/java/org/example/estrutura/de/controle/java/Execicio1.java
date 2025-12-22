package org.example.estrutura.de.controle.java;

import java.util.Scanner;

/**
 * Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
 */
public class Execicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um nummero inteiro:");
        int numero = scanner.nextInt();
        int numTabuada = 0;

        for (int i = 0; i <=10; i++){
            int multiplicacao = numero * numTabuada;
            System.out.printf("%s x %s = %s\n", numero, numTabuada, multiplicacao);
            numTabuada++;
        }
    }
}
