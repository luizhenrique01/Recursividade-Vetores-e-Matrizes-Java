package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //vetor
        double [] notas = new double[10];

        PreenchimentoNotas(notas);
        LeituraDeNotas(notas);
    }

    public static void PreenchimentoNotas(double[] notas) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a nota dos alunos: ");
        for(int i = 0; i < notas.length; i++){
            notas[i] = entrada.nextDouble();
        }
    }

    public static void LeituraDeNotas(double[] notas){
        double media = 0,total = 0;
        int cont = 0;

        for (int j = 0; j < notas.length; j++){
            media =  (notas[j] / 2);
            media += media;
        }

        for (int k = 0; k < notas.length; k++){

            if (notas[k] > media){
                cont++;
            }
        }
        System.out.println("A média da turma é: " + media);
        System.out.println("A quantidade de alunos acima da média é: " + cont);
    }

}
