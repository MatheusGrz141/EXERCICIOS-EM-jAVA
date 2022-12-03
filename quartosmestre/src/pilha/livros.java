/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilha;

/**
 *
 * @author matheus
 */
public class livros {

    public String nome;

    public livros() {
        nome = Input.readString("Digite o nome: ");

    }

    public void imprime() {
        System.out.println("Nome: " + nome);

    }
}
