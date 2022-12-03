/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arvore;

import java.util.logging.Logger;

/**
 *
 * @author matheus
 */
public class Arvore {

    public void Arvore() {

    }
    int valor;
    private Arvore raiz;
    private Arvore esquerda;
    private Arvore direita;
    private int qtd = 0;

    public Arvore getRaiz() {
        return raiz;
    }

    public void setRaiz(Arvore raiz) {
        this.raiz = raiz;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Arvore getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Arvore esquerda) {
        this.esquerda = esquerda;
    }

    public Arvore getDireita() {
        return direita;
    }

    public void setDireita(Arvore direita) {
        this.direita = direita;
    }

    void Menu() {
        int op;
        do {
            System.out.println("\n*** Menu ***");
            System.out.println("0-Sair \n1-Inserção \n2-Remoção \n3-Busca \n4-Impressão \n5-altura da árvore\n");
            op = lista_inicio_fim.Input.readInt("opção: ");

            if (op > 5 || op < 0) {
                System.out.println("Valor Inválido !!! ");
            }

            switch (op) {
                case 0 -> {
                    System.out.println("Saindo...");
                }
                case 1 -> {
                     Inserir();
                }
                case 2 -> {
                    Remover();
                }
                case 3 -> {
                    Busca();
                }
                case 4 -> {
                    Imprime();
                }
                case 5 -> {
                    System.out.println("Altura da arvore: " + getQtd());;
                }

            }
        } while (op >5 || op < 0 || op != 0);

    }

    void Inserir() {
        Arvore aux, novo = new Arvore();
        aux = raiz;
        int i = 1;
        boolean armazenou = false;

        int valor = Input.readInt("Digite o valor a ser inserido: ");
        novo.setValor(valor);
        novo.setDireita(null);
        novo.setEsquerda(null);

        if (raiz == null) {

            raiz = novo;
            qtd++;
            armazenou = true;
            // System.out.println("Qtd" + qtd);
            System.out.println("Valor cadastrado");
        } else {

            while (armazenou != true) {

                if (aux.getValor() == valor) {
                    System.out.println("Valor ja esta cadastrado na ARVORE");
                    armazenou = true;
                    break;
                }

                // i++;
                if (aux.getDireita() == null && aux.getEsquerda() == null) {
                    i++;
                }
                if (aux.getValor() > valor) {
                    if (aux.getEsquerda() == null) {
                        aux.setEsquerda(novo);

                        armazenou = true;
                    } else {
                        i++;
                        aux = aux.getEsquerda();
                    }

                }
                if (aux.getValor() < valor) {
                    if (aux.getDireita() == null) {
                        aux.setDireita(novo);

                        armazenou = true;
                    } else {
                        i++;
                        aux = aux.getDireita();
                    }
                }
                if (armazenou == true) {
                    System.out.println("Valor cadastrado");
                }

            }
            //  System.out.println("i" + i);
            // System.out.println("Qtd" + qtd);
            if (i > qtd) {
                setQtd(i);

            }

        }
        //  if (armazenou == false) {
        //     System.out.println("Valor NÃO cadastrado.");
        // }
    }

    void Busca() {
        Arvore aux;
        aux = raiz;

        boolean achou = false;

        int valor = Input.readInt("Digite o valor a ser buscado: ");

        if (raiz == null) {

            achou = true;
            System.out.println("Arvore esta vazia");
        } else {
            while (achou != true) {
                if (aux.getValor() == valor) {
                    System.out.println("Valor esta na Arvore");
                    achou = true;
                    break;
                }
                if (aux.getValor() > valor) {
                    if (aux.getEsquerda() != null) {

                        aux = aux.getEsquerda();
                    } else {
                        System.out.println("Valor não esta na Arvore");
                        achou = true;
                    }
                }
                if (aux.getValor() < valor) {
                    if (aux.getDireita() != null) {

                        aux = aux.getDireita();
                    } else {
                        System.out.println("Valor não esta na Arvore");
                        achou = true;
                    }
                }
            }
        }
        // if (achou == false) {
        //    System.out.println("Valor NÃO cadastrado.");
        // }

    }

    void Imprime() {
        Arvore aux = new Arvore();
        aux = raiz;
        int op;

        do {
            if (raiz == null) {
                System.out.println("Arvore vazia");
                break;
            } else {
                if (raiz == null) {
                    System.out.println("Arvore vazia");
                    break;
                }
                op = Input.readInt("Escolha o metodo de impressão\n\n1-In Ordem\n2-Pré Ordem\n3-Pós Ordem\n4-raiz\n");

                switch (op) {
                    case 1 -> {
                        InOrdem(raiz);
                    }
                    case 2 -> {
                        PreOrdem(raiz);
                    }
                    case 3 -> {
                        PosOrdem(raiz);
                    }
                    case 4 -> {
                        System.out.println("Raiz: " + getRaiz().getValor());
                    }
                    default -> {
                        System.out.println("Valor Inválido");
                    }
                }
            }

        } while (op > 4 || op < 1);
    }

    void InOrdem(Arvore aux) {
        if (aux != null) {
            InOrdem(aux.getEsquerda());
            System.out.print(aux.getValor() + " ");
            InOrdem(aux.getDireita());
        }

    }

    void PreOrdem(Arvore aux) {
        if (aux != null) {
            System.out.print(aux.getValor() + " ");
            PreOrdem(aux.getEsquerda());
            PreOrdem(aux.getDireita());
        }
    }

    void PosOrdem(Arvore aux) {
        if (aux != null) {
            PosOrdem(aux.getEsquerda());
            PosOrdem(aux.getDireita());
            System.out.print(aux.getValor() + " ");
        }

    }

    private Arvore Direita(Arvore aux) {
        while (aux.direita != null) {
            aux = aux.getDireita();
        }
        return aux;
    }

    private Arvore Esquerda(Arvore aux) {
        while (aux.esquerda != null) {
            aux = aux.getDireita();
        }
        return aux;
    }

    public void Remover() {

        int x = Input.readInt("Valor a ser removido: ");
       // Arvore removido = new Arvore();
        //removido 
        raiz= remover(raiz, x);
    }

    private Arvore remover(Arvore aux, int elemento) {
        if (aux == null) {
            return null;
        } else {
            if (elemento < aux.getValor()) {
                aux.setEsquerda(remover(aux.getEsquerda(), elemento));

            } else if (elemento > aux.getValor()) {
                aux.setDireita(remover(aux.getDireita(), elemento));

            } else {
                if (aux.getEsquerda() != null) {
                    Arvore novoaux = Direita(aux.getEsquerda());
                    aux.setValor(novoaux.getValor());
                    aux.setEsquerda(remover(aux.getEsquerda(), novoaux.getValor()));

                } else if (aux.getDireita() != null) {
                    Arvore novoaux = Esquerda(aux.getDireita());
                    aux.setValor(novoaux.getValor());
                    aux.setDireita(remover(aux.getDireita(), novoaux.getValor()));

               // } else if (raiz.getDireita() == null && raiz.getEsquerda() == null && raiz.getValor() == elemento) {
                 //   raiz=null;
                   // System.out.println("Raiz removida");
                   // return null;
                } else {
                    System.out.println("valor removido");
                    return null;
                }

            }
        }
        return aux;
    }

}
