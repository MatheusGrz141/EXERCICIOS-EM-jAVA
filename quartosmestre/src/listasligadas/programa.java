/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasligadas;

/**
 *
 * @author matheus
 */
public class programa {

    public static int menu() {
        int op = 0;
        do {
            System.out.println("\n*** Menu ***");
            System.out.println("1 - Inserir na Fila");
            System.out.println("2 - Remover da Fila");
            System.out.println("3 - Imprimir");
            System.out.println("4 - Sair\n");
          
            op = Input.readInt("opção: ");
            
            if (op > 4 || op < 1) {
                System.out.println("Valor iválido !!! ");
            }
        } while (op > 4 || op < 1);

        return op;
    }

    public static void main(String args[]) {
        listaligada fila = new listaligada();
        String aux;
        int op;

        op = menu();
        do {
            switch (op) {
                case 1 -> {
                    aux = Input.readString("nome do livro a ser adicionado: ");
                    fila.adicionar(aux);
                }
                case 2 -> {
                   // aux = Input.readString("nome do livro a ser removido: ");
                  System.out.println("valor removido: "+fila.getPrimeiro().getValor());  
                  fila.remover();
                    
                }
                case 3 -> {
                    for (int i = 0; i <fila.getTamanho(); i++) {
                        System.out.print(" "+fila.get(i));
                    }
                }
                case 4 -> {
                    System.out.println("Saindo!!!");
                    break;

                }

            }
            op = menu();

        } while (op != 4);
    }

}
