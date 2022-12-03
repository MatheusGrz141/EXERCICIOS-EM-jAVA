/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_inicio_fim;

import listasligadas.*;

/**
 *
 * @author matheus
 */
public class elemento {

    private String valor;
    private elemento proximo;

    public elemento(String novoValor) {
        this.valor = novoValor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public elemento getProximo() {
        return proximo;
    }

    public void setProximo(elemento proximo) {
        this.proximo = proximo;
    }

}
