/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

/**
 *
 * @author matheus
 */
public class Grafo extends Elemento {

    private Elemento atual;
    private Elemento filaDeProximos;

    public Elemento getAtual() {
        return atual;
    }

    public void setAtual(Elemento atual) {
        this.atual = atual;
    }

    public Elemento getFilaDeProximos() {
        return filaDeProximos;
    }

    public void setFilaDeProximos(Elemento filaDeProximos) {
        this.filaDeProximos = filaDeProximos;
    }

    public Grafo() {

    }

    public void menu() {
        int op;
        do {
            System.out.println("0-Sair \n1-Inserir Vertice\n2-Inserir Aresta\nbuscar\n3-Imprimir");
            op = Input.readInt("opção:");

            switch (op) {
                case 0 -> {
                    System.out.println("Grafo Finalizado");
                }
                case 1 -> {
                    InserirVertice();
                }
                case 2 -> {
                    InserirAresta();
                }
                case 3 -> {
                    // buscar();
                }
                case 4 -> {
                    //Imprimir();
                }

                default -> {
                    System.out.println("Valor Inválido");
                }
            }
        } while (op != 0);

    }

    public void InserirVertice() {
        Elemento novo = new Elemento();
        novo.setValor(Input.readInt("Valor a ser inserido: "));
        if (atual == null) {
            atual = novo;

        } else {
            InserirAresta(novo.getValor());
        }

    }

    public void InserirAresta() {

        int aux = Input.readInt("1° valor: ");
        int aux2 = Input.readInt("2° valor: ");

        Elemento elemento = buscar(aux);
        Elemento elemento2 = buscar(aux2);
        Elemento elementoAux = buscar(aux);
        Elemento elementoAux2 = buscar(aux2);

        if (elemento != null && elemento2 != null) {
            while (elementoAux.getVizinhos() != null) {
                elementoAux = elementoAux.getVizinhos();
            }
            while (elementoAux2.getVizinhos() != null) {
                elementoAux2 = elementoAux2.getVizinhos();
            }

            elementoAux.setVizinhos(elemento2);
            elementoAux2.setVizinhos(elemento);

        } else {
            System.out.println("Um dos dois elementos não esta no grafo!!!");
        }
    }

    public void InserirAresta(int x) {

        int aux = x;

        int aux2 = Input.readInt("Aresta entre " + x + " e qual numero: ");

        Elemento elemento = buscar(aux);
        Elemento elemento2 = buscar(aux2);
        Elemento elementoAux = buscar(aux);
        Elemento elementoAux2 = buscar(aux2);

        if (elemento != null && elemento2 != null) {
            while (elementoAux.getVizinhos() != null) {
                elementoAux = elementoAux.getVizinhos();
            }
            while (elementoAux2.getVizinhos() != null) {
                elementoAux2 = elementoAux2.getVizinhos();
            }

            elementoAux.setVizinhos(elemento2);
            elementoAux2.setVizinhos(elemento);

        } else {
            System.out.println("Um dos dois elementos não esta no grafo!!!");
        }
    }

    public Elemento buscar(int aux) {
        Elemento fila = new Elemento();
        fila = this.atual;
        while (fila.getVizinhos() != null) {
            System.out.print(" " + fila.getValor());

            fila = fila.getVizinhos();
            buscar(fila.getValor());
        }

        return fila;
    }

}
