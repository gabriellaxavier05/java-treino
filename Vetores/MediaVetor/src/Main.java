/*
Crie uma função chamada mediaVetor que recebe um vetor de números e retorna a média dos seus elementos.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto para leitura de dados
        Scanner leitura = new Scanner(System.in);

        System.out.println("** CÁLCULO DE MÉDIA DE ELEMENTOS DO VETOR **");

        // Criando um vetor de 5 posições:
        float [] vet = new float[5];

        // Pedindo ao usuário que informe 5 números:
        for (int i = 0; i <  5; i++){
            System.out.println("Informe o " + (i+1) + "o número: ");
            vet[i] = leitura.nextFloat(); // guarda o valor lido na posição atual percorrida
        }

        // Realizando a soma dos elementos do vetor
        float soma = 0;
        for (int c = 0; c < 5; c++){
            soma = soma + vet[c];
        }

        // Calculando a média:
        float mediaVet = soma / (vet.length);

        // Apresentando resultados:
        System.out.println("\nSoma dos elementos do vetor: " + soma);
        System.out.printf("Média dos elementos do vetor: %.1f", mediaVet);
    }
}