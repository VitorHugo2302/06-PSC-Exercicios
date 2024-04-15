/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios15.pkg04;

import java.util.Scanner;

/**
 *
 * @author 42414189
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[9];
        System.out.println("Digite 9 números inteiros para preencher o vetor:");
        for (int i = 0; i < 9; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Números primos e suas respectivas posições:");

        for (int i = 0; i < vetor.length; i++) {
            if (ehPrimo(vetor[i])) {
                System.out.println("Número primo: " + vetor[i] + ", Posição: " + i);
            }
        }
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
