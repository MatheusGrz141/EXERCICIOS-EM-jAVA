/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vintedosete;

/**
 *
 * @author matheus
 *
 * Lembre-se que após a correção ela não poderá ser reenviada, tire suas dúvidas
 * antes de enviá-la. Lista Simplesmente Encadeada Circular
 *
 * Implementar as funções para:
 *
 * Inicializar a estrutura
 *
 * Retornar a quantidade de elementos
 *
 * Exibir os elementos da estrutura (Impressão)
 *
 * Buscar por um elemento na estrutura (Busca)
 *
 * Inserir elemento na estrutura (Início e Final)
 *
 * Excluir elemento da estrutura (Início, Final e com valor específico)
 */
public class exercicio {

    public static int menu() {
        int op;
        do {
            System.out.println(" 1-Retornar a quantidade de elementos \n 2- Exibir os elementos da estrutura(Impressão\n 3-Buscar por um elemento na estrutura (Busca\n 5-Inserir elemento na estrutura  Final \n 4-Inserir elemento na estrutura Início\n 6-Excluir elemento Inicial \n 7-Excluir elemento Final \n0- Sair)");
      
            op = Input.readInt("Escolha uma opção: ");

        } while (op < 0 || op > 7);
        return op;
    }

    public static void main(String args[]) {
        listacircular lista = new listacircular();

        int op;

        do {
            op = menu();
            switch (op) {
                case 0 ->
                    System.out.println("Saindo...");

                case 1 -> {
                    lista.PrintQtd(lista);

                }
                case 2 -> {
                    lista.PrintElm(lista);
                }
                case 3 -> {
                    lista.BuscaValor();
                }
                case 4 -> {
                    lista.InsereIni(lista);
                }
                case 5 -> {
                    lista.InsereFim(lista);
                }
                case 6 -> {
                    lista.ExluirIni();
                }
                case 7 -> {
                    lista.ExluirFim();
                }
            }
        } while (op != 0);
    }

}
