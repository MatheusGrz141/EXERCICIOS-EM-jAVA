/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trab_POO;

/**
 *
 * @author Matheus
 */
public class cliente {

    public String nome;
    private int cpf, cpfind, telefone, op;

    public cliente() {
        // o usuário informa o CPF, o nome e o telefone do cliente e o CPF do cliente que o indicou (se houver);
        nome = Input.readString("Nome do cliente: ");
        cpf = Input.readInt("CPF do cliente: ");
        telefone = Input.readInt("Telefone do cliente: ");
        op = Input.readInt("Alguem indicou o cliente? 1 -S , 2 - N ");
        if (op == 1) {
            cpfind = Input.readInt("Cpf de quem indicou o cliente: ");
        } else {
            cpfind = 0;
        }

    }

    public String GetNome() {

        return nome;
    }

    public int GetCpf() {
        return cpf;

    }

    public int Gettelefone() {
        return telefone;

    }

    public int GetCpfind() {
        return cpfind;

    }

    public void Imprime() {
        System.out.println("nome: " + GetNome());
        System.out.println("telefone: " + Gettelefone());
        System.out.println("");
    }

}
