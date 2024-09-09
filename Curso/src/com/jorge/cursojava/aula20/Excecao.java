package com.jorge.cursojava.aula20;

public class Excecao {
    public static void main(String[] args) {
        try {
            int[] vetor = new int[4];

            System.out.println("Antes da Exception");

            vetor[4] = 1;

            System.out.println("Esse texto não será impresso");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Excecão ao acessar um indice do vetor que não existe");
        }

        System.out.println("Esse texto será impresso após a exception");
    }
}
