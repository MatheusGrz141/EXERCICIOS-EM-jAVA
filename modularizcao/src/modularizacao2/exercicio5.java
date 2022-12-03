/*
 5) Considerando a necessidade de desenvolver uma agenda que contenha
nomes, endereços e telefones de 10 pessoas, construa um programa com uso
de vetores e sub-rotinas que apresente um menu com as seguintes
funcionalidades:
a) cadastrar contato: cadastra o nome (caractere), endereço (caractere) e
telefone (inteiro)
b) pesquisa nome: busca um nome entre os nomes existentes e apresenta
todas as informações da pessoa encontrada.
c) classificar os contatos: ordena os vetores de nome, endereço e telefone por
ordem de nome.
d) apresentar contatos: apresenta todas as informações de todas as pessoas
e) sair do programa: termina o programa
 */
package modularizacao2;

/**
 *
 * @author Matheus
 *
 */
class cadastro {

    String nome;
    String endereco;
    int telefone;
}

public class exercicio5 {

    public static cadastro cadastrar(int i) {

        cadastro vet[] = new cadastro[10];
        vet[i] = new cadastro();
        vet[i].nome = Input.readString("nome: ");
        vet[i].endereco = Input.readString("endereço: ");
        vet[i].telefone = Input.readInt("telefone: ");
        System.out.println("");

        return vet[i];

    }

    public static void pesquisanome(cadastro vet[], String nome) {
        int achou = 0, i = 0;

        while (achou == 0 && i < 10) {

            if (nome == vet[i].nome) {
                System.out.println("Nome encontrado ");
                achou = 1;
            }
            i++;

        }
        if (achou == 0) {
            System.out.println("Nome não encontrado ");
        }

    }

    public static void main(String args[]) {

        int i;
        cadastro vet[] = new cadastro[10];

        for (i = 0; i < 10; i++) {

            vet[i] = cadastrar(i);
        }

    }

}
