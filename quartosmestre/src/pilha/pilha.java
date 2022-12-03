/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilha;

/**
 *
 * @author matheus
 */
public class pilha {

    public livros vlivros[];
    public int qtdlivros, x, y;

    public pilha() {

        x = Input.readInt("numero maximos de livro: ");
        vlivros = new livros[x];
    }

    public void inserir() {
        if (qtdlivros < vlivros.length) {
            vlivros[qtdlivros++] = new livros();
            System.out.println("Inserção concluída");
        } else {
            System.out.println("Vetor sem espaço!");
        }

    }

    public void remover() {
        qtdlivros--;
        System.out.println("Ultimo livro removido");
    }

    public void numprat() {
        System.out.println("total de livros no momento: " + qtdlivros);

    }

    public void imprimir() {
        for (y = 0; y < qtdlivros; y++) {

            System.out.print(" " + vlivros[y].nome);

        }
        System.out.println("");
    }

}
