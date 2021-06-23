package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] vetorX = new int[10];

        for(int i =0; i < vetorX.length; i++){
            vetorX[i] = entrada.nextInt();
        }
        System.out.println("O vetor em forma negativa e : " + Test(vetorX));
    }

    public static int[] Test(int [] vetorPositivo){
        int contNegativo = 0;
        for (int j = 0; j < vetorPositivo.length; j++){
            if (vetorPositivo[j] < 0){
                contNegativo++;
            }
        }
        int [] vetorNegativo = new int[contNegativo];

        for (int k = 0; k < vetorPositivo.length;k++){
            if (vetorPositivo[k] < 0){
                for (int l = 0; l < vetorNegativo.length; l++){
                    vetorNegativo[l] = vetorPositivo[k];
                }
            }
        }
        return vetorNegativo;
    }



}
