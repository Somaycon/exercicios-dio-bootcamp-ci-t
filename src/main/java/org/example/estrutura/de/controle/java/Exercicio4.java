package org.example.estrutura.de.controle.java;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("Digite um numero inteiro:");
            int numero1 = scanner.nextInt();

            System.out.println("Digite outro numero:");
            int numero2 = scanner.nextInt();

            if (numero1 % numero2 == 0){
                System.out.println("Deu certo");

            }
        }
    }
}
