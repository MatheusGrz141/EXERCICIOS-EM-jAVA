
import modularizacao2.Input;

/*
 10) Escreva um algoritmo que leia um vetor de 10 posições e mostreo. Faça um procedimento que faça um vetor inverso, trocando o 1º
elemento com o último, o 2º elemento com o penúltimo e assim
sucessivamente. Mostre o novo vetor depois da troca.
 */

/**
 *
 * @author Matheus
 */
public class exercicio10 {

    public static void invertvetor(int v[], int x) {

        int VR[] = new int[x], i;
        System.out.println("novo vetor:");

        for (i = 0; i < x; i++) {
            VR[x - i - 1] = v[i];
        }
        for (i = 0; i < x; i++) {
            System.out.println(i + " " + VR[i]);
        }

    }

    public static void main(String args[]) {

        int i, vet[] = new int[10];

        for (i = 0; i < 10; i++) {
            vet[i] = Input.readInt("digite o valor da posi " + i + ": ");
        }

        invertvetor(vet, 10);

    }

}
