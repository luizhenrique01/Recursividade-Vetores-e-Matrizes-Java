package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //variavel
        Scanner entrada = new Scanner(System.in);
        int[] A = new int[10];

        PreenchimentoVetor(entrada, A);

        System.out.println(LeituraVetor(A));
    }

    private static void PreenchimentoVetor(Scanner entrada, int[] A) {
        System.out.println("Digite o valor de entrada:");
        for (int i = 0; i < A.length; i++) {
            A[i] = entrada.nextInt();
        }
    }

    public static double LeituraVetor(int[] A){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero que deseja verificar");
        int valor = entrada.nextInt();
        int cont = 0;

        for (int posicao = 0; posicao < A.length; posicao++) {
            if (A[posicao] == valor){
                cont++;
            }
        }
        return cont;
    }
}