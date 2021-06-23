package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //variavel
        Scanner entrada = new Scanner(System.in);
        int n1,n2;

        //entrada
        System.out.println("Digite o numero 1: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o numero 2: ");
        n2 = entrada.nextInt();

        //saida
        System.out.println("A divisão é: " + Divisao(n1,n2));

    }

    public static double Divisao(double numerador, double denominador){
        int cont = 0;
        if (denominador == 0){
            return 0;
        }else if (numerador == 0){
            return 0;
        }else{
            cont++;
            return cont + Divisao(numerador-denominador, denominador);
        }
    }

}
