/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trab_POO;

/**
 *
 * @author Matheus
 *
 * Cadastrar conta: o usuário informa o número da agência, o número da conta e o
 * CPF do cliente;
 */
public class conta {

    public int numagenc, numcont, numcpf;

    public conta() {
        numagenc = Input.readInt("Numero da agencia: ");
        numcont = Input.readInt("Numero da conta: ");
        numcpf = Input.readInt("Numero do cpf: ");

    }

    public int Getnumagenc() {

        return numagenc;
    }

    public int Getnumcpf() {
        return numcpf;

    }

    public int Getnumcont() {
        return numcont;

    }

    public void Imprime() {
        System.out.println("Numero da agencia: " + Getnumagenc());
        System.out.println("Numero da conta: " + Getnumcont());
        System.out.println("Numero do cpf: " + Getnumcpf());
        System.out.println("");
    }

}
