/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasligadas;

/**
 *
 * @author matheus
 */
public class listaligada {

    private elemento primeiro;
    private elemento ultimo;
    private int tamanho;

    public listaligada() {
        this.tamanho = 0;
    }

    public elemento getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(elemento primeiro) {
        this.primeiro = primeiro;
    }

    public elemento getUltimo() {
        return ultimo;
    }

    public void setUltimo(elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor) {
        elemento novoElemento = new elemento(novoValor);
        if (primeiro == null && ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;

        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;

    }

    public void remover() {
      // elemento anterior = null;
      //  elemento atual = this.primeiro;
        
        this.primeiro = primeiro.getProximo();
        //atual.setProximo(null);
         this.tamanho--;
        /*  for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equalsIgnoreCase(valorProcurado)) {
                if (this.tamanho == 1) {
                    this.primeiro = null;
                    this.ultimo = null;
                    
                } if (atual == primeiro) {
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);

                } else if (atual == ultimo) {
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                    
                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }

                this.tamanho--;
                break;
            }
            anterior = atual;
        atual = atual.getProximo();

        }*/

    }

    public String get(int posicao) {

        elemento atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual.getValor();
    }

}
