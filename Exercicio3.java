/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios15.pkg04;

/**
 *
 * @author 42414189
 */
import java.util.Arrays;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] vetorOriginal = new int[8];
        int[] vetorPositivos = new int[8];
        int[] vetorNegativos = new int[8];

        preencherVetor(vetorOriginal);

        separarPositivosNegativos(vetorOriginal, vetorPositivos, vetorNegativos);

        System.out.println("Vetor Original: " + Arrays.toString(vetorOriginal));
        System.out.println("Vetor Positivos: " + Arrays.toString(vetorPositivos));
        System.out.println("Vetor Negativos: " + Arrays.toString(vetorNegativos));
    }

    public static void preencherVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 20) - 10;
        }
    }

    public static void separarPositivosNegativos(int[] vetorOriginal, int[] vetorPositivos, int[] vetorNegativos) {
        int indicePositivo = 0;
        int indiceNegativo = 0;

        for (int i = 0; i < vetorOriginal.length; i++) {
            if (vetorOriginal[i] >= 0) {
                vetorPositivos[indicePositivo] = vetorOriginal[i];
                indicePositivo++;
            } else {
                vetorNegativos[indiceNegativo] = vetorOriginal[i];
                indiceNegativo++;
            }
        }
    }
}
