package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //variavel
        Scanner entrada = new Scanner(System.in);
        int n1,n2;

        //entrada
        System.out.println("Digite o numero um: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o numero dois: ");
        n2 = entrada.nextInt();

        //func
        System.out.println("O resto é: " + divisao(n1,n2));

    }

    public static double divisao(double numerador, double denominador){
        if (denominador == 0){
            return 0;
        }else if (numerador < denominador){
            return numerador;
        }else {
          return divisao(numerador - denominador, denominador);
        }
    }

}
