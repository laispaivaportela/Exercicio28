/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio28;

import javax.swing.JOptionPane;


/**
 *
 * @author laisp_omzy4s1
 */

 /*(JAVA) EXERCÍCIO 28
        Faça um algoritmo que leia uma matriz de ordem 3x3 de números inteiros. Após a leitura faça:

        A Calcule e mostre a soma dos elementos da primeira coluna;
        B Calcule e mostre a soma dos elementos de cada coluna;
        C Calcule e mostre o produto dos elementos da primeira linha;
        D Calcule e mostre a soma de todos os elementos da matriz;
        E Calcule e mostre a média dos elementos da matriz;
        F Calcule e mostre os elementos que são maiores que a média;
        G Calcule e mostre o maior elemento da matriz e sua posição;
        H Calcule e mostre o menor elemento da matriz e sua posição;
        I Calcule e mostre a soma dos elementos da diagonal principal da matriz;
        J Calcule e mostre a soma dos elementos da diagonal secundária da matriz;

        observações: adicionei a impressão da matriz
 */

import java.util.Scanner;

public class Exercicio28 {

    static Scanner input = new Scanner(System.in);
    static int[][] numeros;

    public static void main(String[] args) {
        numeros = new int[3][3]; //inicializa array
        //preenche o array multidimensional com a entrada do usuario
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = new int[3];
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                numeros[i][j] = input.nextInt();
            }
        }
        System.out.println("\nMatriz formatada:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.printf("%3d ", numeros[i][j]);
            }
            System.out.println(" |");
        }


        //A. Calcule e mostre a soma dos elementos da primeira coluna;
        System.out.println();
        System.out.println("A. Calcule e mostre a soma dos elementos da primeira coluna");
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += numeros[i][0];
        }
        System.out.println("A soma dos elementos da primeira coluna é: " + soma);

        //B. Calcule e mostre a soma dos elementos de cada coluna;
        System.out.println();
        System.out.println("B. Calcule e mostre a soma dos elementos de cada coluna");
        int somaColuna = 0;
        for (int i = 0; i < 3; i++) {
            somaColuna = 0;
            for (int j = 0; j < 3; j++) {
                somaColuna += numeros[j][i];
            }
            System.out.println("A soma dos elementos da coluna " + i + " é: " + somaColuna);
        }

        //C. Calcule e mostre o produto dos elementos da primeira linha;
        System.out.println();
        System.out.println("C. Calcule e mostre o produto dos elementos da primeira linha");
        int produtoLinha = 1;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                produtoLinha *= numeros[0][j];
            }
        }
        System.out.println("O produto dos elementos da primeira linha é: " + produtoLinha);

        //D. Calcule e mostre a soma de todos os elementos da matriz;
        System.out.println();
        System.out.println("D. Calcule e mostre a soma de todos os elementos da matriz");
        //calcula a soma total (para ficar mais pratico para algumas questoes)
        int somaTotal = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somaTotal += numeros[i][j];
            }
        }

        System.out.println("A soma de todos os elementos da matriz é: " + somaTotal);

        int tamanho = numeros.length * numeros[0].length;
        
        //E; Calcule e mostre a média dos elementos da matriz;
        System.out.println();
        System.out.println("E. Calcule e mostre a média dos elementos da matriz");
        //calcula a media (para ficar mais pratico para algumas questoes)

        double media = (double) somaTotal / (double) tamanho;

        System.out.printf("A média dos elementos da matriz é: %.2f\n", media);

        //F. Calcule e mostre os elementos que são maiores que a média;
        System.out.println();
        System.out.println("F. Calcule e mostre os elementos que são maiores que a média");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor = numeros[i][j];
                if (media < valor) {
                    System.out.println(valor + " é maior que a média.");
                }
            }
        }

        //G. Calcule e mostre o maior elemento da matriz e sua posição;
        System.out.println();
        System.out.println("G. Calcule e mostre o maior elemento da matriz e sua posição");
        int maior = numeros[0][0];
        int posicaoLinha = 0;
        int posicaoColuna = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] > maior) {
                    maior = numeros[i][j];
                    posicaoLinha = i;
                    posicaoColuna = j;
                }
            }
        }

        System.out.printf("O maior número do array é: %d\nA posição do menor número no array é: [%d][%d]\n", maior, posicaoLinha, posicaoColuna);

        //H. Calcule e mostre o menor elemento da matriz e sua posição;
        System.out.println();
        System.out.println("H. Calcule e mostre o menor elemento da matriz e sua posição");

        int menor = numeros[0][0];
        posicaoLinha = 0;
        posicaoColuna = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] < menor) {
                    menor = numeros[i][j];
                    posicaoLinha = i;
                    posicaoColuna = j;
                }
            }
        }

        System.out.printf("O menor número do array é: %d\nA posição do menor número no array é: [%d][%d]\n", menor, posicaoLinha, posicaoColuna);

        //I Calcule e mostre a soma dos elementos da diagonal principal da matriz;
        System.out.println();
        System.out.println("I. Calcule e mostre a soma dos elementos da diagonal principal da matriz");
        //"para calcular a diagonal principal de uma matriz em Java, você pode usar um loop para iterar sobre os elementos da matriz, acessando-os quando a linha e a coluna forem iguais."
        soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i][i];
        }
        System.out.println("Soma da diagonal principal: " + soma);

        //J Calcule e mostre a soma dos elementos da diagonal secundária da matriz;
        System.out.println();
        System.out.println("J. Calcule e mostre a soma dos elementos da diagonal secundária da matriz");
        soma = 0;
        int n = numeros.length;
        for (int i = 0; i < n; i++) {
            soma += numeros[i][n - 1 - i];
        }
        System.out.println("Soma da diagonal secundária: " + soma);
    }
}
