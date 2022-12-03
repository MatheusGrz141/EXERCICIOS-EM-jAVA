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

    public void adicionarfinal(String novoValor) {
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

    public void adicionarinicio(String novoValor) {
        elemento novoElemento = new elemento(novoValor);
        if (primeiro == null && ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            novoElemento.setProximo(primeiro);
            this.primeiro = novoElemento;
        }
        this.tamanho++;
    }

    public void remover() {
        this.primeiro = primeiro.getProximo();
        this.tamanho--;
    }

    public String get(String valor) {

        elemento atual = this.primeiro;
        for (int i = 0; i < getTamanho(); i++) {

            if (atual.getValor() == null ? (valor) == null : atual.getValor().equals(valor)) {
                return atual.getValor();
            } else if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }

        }

        return null;
    }

    public void getlst(listaligada fila) {

        elemento atual = this.primeiro;
        elemento auxilio;
        auxilio = fila.getPrimeiro();

        while (auxilio != null) {
            System.out.print(" " + auxilio.getValor());
            auxilio = auxilio.getProximo();
        }
    }

    public void insereaux(String valorProcurado, String valor) {
        elemento novoElemento = new elemento(valor);
        elemento atual = this.primeiro;
        boolean achou = false;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equalsIgnoreCase(valorProcurado)) {
                novoElemento.setProximo(atual.getProximo());
                atual.setProximo(novoElemento);
                achou = true;
                this.tamanho++;
                break;
            }
            atual = atual.getProximo();
        }
        if (achou == true) {
            System.out.println("Valor colocado na lista: ");

        } else {
            System.out.println("vaor não esta na lista ");
        }
    }

    public void removen() {
        elemento atual = this.primeiro;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual == null) {
                this.ultimo = null;
                this.primeiro = null;
                System.out.println("Fila ja esta vazia!!!");
                break;
            } else if (atual.getProximo() == null) {
                this.ultimo = null;
                this.primeiro = null;
                atual = null;
                this.tamanho--;
                System.out.println("unico valor remvido!!");
                break;

            } else if (atual.getProximo().getProximo() == null) {

                atual.setProximo(null);
                ultimo = atual;
                this.tamanho--;
                System.out.println("ultimo valor remvido!!");
                break;
            } else {
                System.out.println("não entrou nos if");
            }
        }

    }

    public elemento DividirLista(/*listaligada fila,*/elemento f2) {
        elemento atual = primeiro;
        elemento auxilio = primeiro;
        String aux;

        aux = Input.readString("qual sera o inicio da lista 2: ");

        while (atual.getProximo() != null) {
            if (aux == null ? atual.getProximo().getValor() == null : aux.equals(atual.getProximo().getValor())) {
                f2 = atual.getProximo();
                atual.setProximo(null);
                break;

            } else {
                atual = atual.getProximo();

            }
        }

        auxilio = f2;
        while (auxilio != null) {
            System.out.print(" " + auxilio.getValor());
            auxilio = auxilio.getProximo();
        }
        return f2;
    }

    public listaligada ConcatenarDuasListas(elemento f2, listaligada lista) {
        lista.getUltimo().setProximo(f2);
        return lista;
    }

  /*  public listaligada ordenarf3(listaligada fila, elemento f2) {
        listaligada f3 = new listaligada();
        
        int x = fila.getPrimeiro().getValor().compareTo(f2.getValor());

        if (f3.getPrimeiro() == null) {
            if (x < 0) {
                f3.primeiro = fila.getPrimeiro();
                f3.ultimo = fila.getPrimeiro();
            } else {
                f3.primeiro = f2;
                f3.ultimo = f2;
            }

        } else {
            if (x < 0) {
                f3.getUltimo().setProximo(fila.getPrimeiro());
                f3.setUltimo(ultimo);
            } else {
                f3.getUltimo().setProximo(f2);
            }
        }

    }*/
    

}
