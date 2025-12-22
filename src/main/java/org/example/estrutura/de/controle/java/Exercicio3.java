package org.example.estrutura.de.controle.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro numero inteiro maior que o anterior:");
        int num2 = scanner.nextInt();
        if (num2 <= num1){
            System.out.println("O segundo numero informado é menor ou igual ao primeiro");
            return;
        }
        while (true){
            ArrayList<Integer> listaNumPar = new ArrayList<>();
            ArrayList<Integer> listaNumImpar = new ArrayList<>();
            System.out.println("Escolha uma opção:");
            System.out.println("1. Impar");
            System.out.println("2. Par");
            int opcao = scanner.nextInt();

            for (int i = num1; i < num2; i++){
                if (i % 2 == 0){
                    listaNumPar.add(0, i);
                }else{
                    listaNumImpar.add(0, i);
                }
            }
            switch (opcao){
                case 1:
                    System.out.println(listaNumImpar);
                    break;
                case 2:
                    System.out.println(listaNumPar);
                    break;
            }
        }
    }
}
