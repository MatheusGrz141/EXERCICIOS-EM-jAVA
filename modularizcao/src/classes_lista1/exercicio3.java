/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes_lista1;

/**
 * Crie um programa em java para representar um cliente de uma agência bancária.
 * Para isso tenha como características o nome, o cpf, idade, endereço,
 * telefone, profissão e ano de cadastro. Implemente os métodos de acesso e
 * modificação de todos os atributos. Crie uma lista de clientes (vetor) e crie
 * um método para listar o nome dos clientes de acordo com um parâmetro definido
 * como exemplo nome e cpf. Sua classe deve ter também um método que imprima as
 * informações de cada cliente e de todos os clientes cadastrados. Implemente
 * também uma funcionalidade que permita o banco consultar os clientes por ano
 * de cadastro e apresentar um quantitativo.
 *
 * @author Matheus
 *
 *
 *
 */
class Pessoa {

    String nome;
    int cpf, idade, telefone, anoCadastro;
    String endereço, profissão;

}

public class exercicio3 {

    public static void main(String args[]) {

        Pessoa vet[];
        int x;

        x = Input.readInt("Qtd de pessoas: ");
        vet = new Pessoa[x];
        for (int i = 0; i < x; i++) {
            vet[i] = new Pessoa();
           
            vet[i].nome = Input.readString("Nome: ");
            vet[i].cpf = Input.readInt("cpf: ");
            vet[i].idade = Input.readInt("idade: ");
            vet[i].telefone = Input.readInt("telefone: ");
            vet[i].anoCadastro = Input.readInt("ano de cadastro: ");
            vet[i].endereço = Input.readString("endereço: ");
            vet[i].profissão = Input.readString("profissão: ");

        }

    }
}
