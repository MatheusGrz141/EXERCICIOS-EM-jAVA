/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trab_POO;

/**
 *
 * @author Matheus
 */
public class agencia {

    public String endereço;
    public int numero;

    public agencia() {
        endereço = Input.readString("Endereço da agencia: ");
        numero = Input.readInt("Numero da agencia: ");

    }

    public String GetEndereço() {

        return endereço;
    }

    public int GetNumero() {
        return numero;

    }
}
