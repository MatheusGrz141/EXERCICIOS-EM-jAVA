/*
 1) Dada uma matriz P, de tamanho n x m, faça um método que:
a) Some os quadrados dos elementos da primeira coluna;
b) Some os elementos da segunda linha;
c) Some os elementos da diagonal principal (em caso de quadrada);
d) Some todos os elementos;
e) Some os elementos de índice ímpar da segunda linha
Todos esses retornos devem estar em um vetor de resposta a ser impresso na
main
 */
package modularizacao2;

public class exercicio1 {

    public static void CalculoMatriz(int n, int m) {

        int mat[][], i, j;
        int vet[] = new int[5];
        mat = new int[n][m];

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                mat[i][j] = Input.readInt("Digite um valor: ");

                if (j == 0) {//somacoluna
                    vet[0] = vet[0] + (mat[i][0] * mat[i][0]);
                }

                if (i == 1) {//somasegun
                    vet[1] = vet[1] + mat[1][j];
                }

                if (m == n) {
                    if (i == j) {//somadiagonal
                        vet[2] = vet[2] + mat[i][i];
                    }
                }

                vet[3] = vet[3] + mat[i][j];//somatotal

                if (i == 1 && j % 2 != 0) {//impasegund
                    vet[4] = vet[4] + mat[1][j];

                }

            }
        }
        System.out.println("quadrados dos elementos da primeira coluna: "+vet[0]);
        System.out.println("elementos da segunda linha: "+vet[1]);
        System.out.println("Some os elementos da diagonal principal: "+vet[2]);
        System.out.println("Some todos os elementos: "+vet[3]);
        System.out.println("Some os elementos de índice ímpar da segunda linha: "+vet[4]);
        System.out.println("");
        
        
    
    }

    public static void main(String args[]) {
        int n, m;

        n = Input.readInt("linhas da Matriz: ");
        m = Input.readInt("Colunas da Matriz: ");
        
        CalculoMatriz(n,m);

    }
}
