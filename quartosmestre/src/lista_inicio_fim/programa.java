package lista_inicio_fim;

import listasligadas.*;

/*1 - Fazer a remoção do n-ésimo termo de uma lista encadeada simples.
2- Dividir uma lista simples em 2 a partir do termo especificado como parâmetro.
3- Concatenar Duas Listas.
4- Dadas duas listas L1 e L2 simplesmente encadeadas e ordenadas, criar uma lista L3 também ordenada a partir de L1 e L2.
5- Ordenar uma lista encadeada simples inserindo um elemento por vez.
6- Obter uma lista encadeada simples em ordem inversa.
7- Dadas duas listas encadeadas simples, deixar na l1 apenas os elementos pares e na l2 apenas os elementos ímpares.
8 - Considere uma lista com apontadores para o elemento anterior e posterior em um elem. Fazer o método de inserção e remoção em Fila.*/
public class programa {

    public static int menu() {
        int op = 0;
        do {
            System.out.println("\n*** Menu ***");
            System.out.println("0 - inserir no inicio");
            System.out.println("1 - Inserir no final");
            System.out.println("2 - Remover do inicio da Fila");
            System.out.println("3 - buscar valor");
            System.out.println("4 - Sair");
            System.out.println("5 - Imprimir");
            System.out.println("6 - Inserir depois de um valor");
            System.out.println("7 - remoção do n-ésimo ");
            System.out.println("8 - dividir a lista em dois ");
            System.out.println("9 - Concatenar Duas Listas \n");
            System.out.println("10-criar  L3 ordenada a partir de L1 e L2.");

            op = Input.readInt("opção: ");

            if (op > 10 || op < 0) {
                System.out.println("Valor iválido !!! ");
            }
        } while (op > 10 || op < 0);

        return op;
    }

    public static void main(String args[]) {
        listaligada fila = new listaligada();
        elemento f2 = new elemento("a");
        String aux, aux2;
        int op;

        do {
            op = menu();
            switch (op) {
                case 0 -> {
                    aux = Input.readString("nome do livro a ser adicionado: ");
                    fila.adicionarinicio(aux);
                }
                case 1 -> {
                    aux = Input.readString("nome do livro a ser adicionado: ");
                    fila.adicionarfinal(aux);
                }
                case 2 -> {
                    // aux = Input.readString("nome do livro a ser removido: ");
                    System.out.println("valor removido: " + fila.getPrimeiro().getValor());
                    fila.remover();

                }
                case 3 -> {
                    aux = Input.readString("nome do livro a ser buscado: ");
                    aux = fila.get(aux);
                    if (aux != null) {
                        System.out.println("Valor esta na lista");
                    } else {
                        System.out.println("Valor não esta na lista");
                    }

                }
                case 4 -> {
                    System.out.println("Saindo!!!");
                    break;

                }
                case 5 -> {
                    fila.getlst(fila);

                }

                case 6 -> {
                    aux2 = Input.readString("qual o nome do ivro a ser inserido: ");
                    aux = Input.readString("Inserir depois de qual valor: ");
                    fila.insereaux(aux, aux2);
                }
                case 7 -> {
                    fila.removen();//não funviona mias de 2
                }
                case 8 -> {

                    f2 = fila.DividirLista(f2);
                }
                case 9 -> {
                    if (f2 == null) {
                        fila = fila.ConcatenarDuasListas(f2, fila);
                    }
                }
                case 10 -> {
                    elemento f3 = new elemento("a");
                    //  f3 = fila.ordenarf3(fila, f2);
                }
            }
            //  op = menu();

        } while (op != 4);
    }

    

}
