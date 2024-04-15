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

public class Exercicio2 {

    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        preencherVetor(vetor1);
        preencherVetor(vetor2);

        System.out.println("Vetor 1: " + Arrays.toString(vetor1));
        System.out.println("Vetor 2: " + Arrays.toString(vetor2));

        int[] vetorIntercalado = intercalarVetores(vetor1, vetor2);

        System.out.println("Vetor Intercalado: " + Arrays.toString(vetorIntercalado));
    }

    public static void preencherVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }
    }

    public static int[] intercalarVetores(int[] vetor1, int[] vetor2) {
        int[] vetorIntercalado = new int[vetor1.length + vetor2.length];
        int indexVetor1 = 0;
        int indexVetor2 = 0;

        for (int i = 0; i < vetorIntercalado.length; i++) {
            if (indexVetor1 < vetor1.length) {
                vetorIntercalado[i] = vetor1[indexVetor1];
                indexVetor1++;
            }
            if (indexVetor2 < vetor2.length) {
                vetorIntercalado[++i] = vetor2[indexVetor2];
                indexVetor2++;
            }
        }
        return vetorIntercalado;
    }
}
