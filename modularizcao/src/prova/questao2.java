/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

/**
 *
 * @author Matheus 2) Criar um programa recursivo para determinar o valor do
 * menor elemento ímpar de um vetor v[0 .. n-1], em que n corresponde ao número
 * de elementos do vetor. (1,0)
 */
public class questao2 {

    public static int menorvalor(int vet[], int n, int menor) {
        if (n > 0) {

            if (vet[n] % 2 != 0) {
                if (vet[n] < menor) {
                    menor = vet[n];
                }
            }

            return menorvalor(vet, --n, menor);

        }

        return menor;

    }

    public static void main(String args[]) {

        int vet[], n, x, menor;
        menor = 0;
        n = Input.readInt("Tamanho do vetor: ");

        vet = new int[n];

        for (x = 0; x < n; x++) {
            vet[x] = Input.readInt("valor: ");
            if (vet[x] % 2 != 0) {
                menor = vet[x];
               // System.out.println("menor valor impar: " + menor + " !!!");

            }
        }

        x = menorvalor(vet, --n, menor);

        if (x == 0) {

            System.out.println("Não existe um valor impar !!!");

        } else {
            System.out.println("menor valor impar: " + x + " !!!");
        }

    }
}
