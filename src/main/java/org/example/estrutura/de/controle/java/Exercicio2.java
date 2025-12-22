package org.example.estrutura.de.controle.java;

import java.util.Scanner;

/**
 * Escreva um código onde o usuário entra com sua altura e peso,
 * seja feito o calculo do seu IMC(IMC = peso/(altura * altura))
 * e seja exibida a mensagem de acordo com o resultado:
 *
 * Se for menor ou igual a 18,5 "Abaixo do peso";
 * se for entre 18,6 e 24,9 "Peso ideal";
 * Se for entre 25,0 e 29,9 "Levemente acima do peso";
 * Se for entre 30,0 e 34,9 "Obesidade Grau I";
 * Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
 * Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso:");
        double peso = scanner.nextDouble();

        double imc = peso/(altura * altura);

        if (imc <= 18.5){
            System.out.printf("Seu imc é: %s\n", imc);
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 || imc <= 24.9) {
            System.out.printf("Seu imc é: %s\n", imc);
            System.out.println("Peso ideal");
        } else if (imc >= 25.0 || imc <= 29.9) {
            System.out.printf("Seu imc é: %s\n", imc);
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 || imc <= 34.9) {
            System.out.printf("Seu imc é: %s\n", imc);
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35.0 || imc <= 39.9 ) {
            System.out.printf("Seu imc é: %s\n", imc);
            System.out.println("Obesidade Grau II (Severa)");
        } else if (imc >= 40) {
            System.out.printf("Seu imc é: %s\n", imc);
            System.out.println("Obesidade III (Mórbida)");
        }
    }
}
