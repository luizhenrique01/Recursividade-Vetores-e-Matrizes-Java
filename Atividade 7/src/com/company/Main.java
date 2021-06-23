package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //variaveis
        Scanner entrada = new Scanner(System.in);
        int [] vetorX = new int[4];
        int [] vetorY = new int[4];

        PreenchimentoVetores(entrada, vetorX, vetorY);

        CriacaoNovoVetor(vetorX, vetorY);


    }

    public static void PreenchimentoVetores(Scanner entrada, int[] vetorX, int[] vetorY) {
        System.out.println("Digite o valor dos vetores");
        for (int i = 0; i < vetorX.length; i++){
            vetorX[i] = entrada.nextInt();
        }

        for (int j = 0; j < vetorX.length; j++){
            vetorY[j] = entrada.nextInt();
        }
    }

    public static void CriacaoNovoVetor(int[] vetorX, int[] vetorY) {
        int [] novoVetor = new int[20];
        for (int k = 0; k < novoVetor.length; k++){
            for (int l = 0; l < vetorX.length; l++){
                novoVetor[k] = vetorX[l];
            }
        }
        for (int k = 0; k < novoVetor.length; k++){
            for (int l = 0; l < vetorY.length; l++){
                novoVetor[k] = vetorY[l];
            }
        }
    }
}
