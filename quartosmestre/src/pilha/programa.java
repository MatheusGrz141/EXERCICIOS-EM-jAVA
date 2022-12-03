/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilha;



/**
 *
 * @author matheus
 *
 * Considere agora a manipulação de livros por um bibliotecário da UCDB em que
 * os livros empilhados pelos alunos devem ser devolvidos às suas respectivas
 * prateleiras. Sabendo que o bibliotecário sempre adiciona ou remove livros do
 * topo dessa programa elabore ações por meio de um MENU para:
 *
 * 1) Inserir um livro na programa de livros manipulada; 2) Remover um livro da
 * programa de livros manipulada; 3) Retornar o número de livros na programa de
 * livros em um determinado momento; 4) Imprimir o nome dos livros na programa
 * de livros.
 */
public class programa {

    public static int menu() {
        int op;
        do {
            System.out.println("1) Inserir livros na pilha;");
            System.out.println("2) Remover livros da pilha");
            System.out.println("3) Retornar o número de livros na pilha de livros  em um determinado momento;");
            System.out.println("4 ) Imprimir o nome dos livros na pilha de livros");
            System.out.println("5 ) sair");
            op = Input.readInt("escolha uma opção: ");
            if (op > 5 || op < 0) {
                System.out.println("Valor invalido");
            }
        } while (op > 5 || op < 0);

        return op;
    }

    public static void main(String args[]) {
        int op;

        pilha livr;

        livr = new pilha();

        do {
            op = menu();
            switch (op) {
                case 1 ->
                    livr.inserir();
                case 2 ->
                    livr.remover();
                case 3 ->
                    livr.numprat();
                case 4 ->
                    livr.imprimir();
                case 5-> 
                    System.out.println("Fim da execução");

            }

        } while (op != 5);
    }
}
