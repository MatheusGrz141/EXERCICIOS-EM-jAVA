
import modularizacao2.Input;

/*
 Faça um programa que mostra a soma e a média dos elementos
de um vetor.

 */

/**
 *
 * @author Matheus
 */
public class exercicio7 {

    public static void somavetor(int V[], int X) {
        int S, i;
        double M;
        S = 0;
        for (i = 0; i < X; i++) {
            S = S + V[i];
        }
        M = S / X;
        System.out.println("Soma: " + S);
        System.out.println("MÉDIA: " + M);

    }

    public static void main(String Args[]) {

        double media;
        int vet[], soma, x, i;

        x = Input.readInt("tamanho do vetor: ");

        vet = new int[x];

        for (i = 0; i < x; i++) {
            vet[i] = Input.readInt("Valor: ");
        }

        somavetor(vet, x);

    }

}
