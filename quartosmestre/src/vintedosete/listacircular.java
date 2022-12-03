/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vintedosete;

/**
 *
 * @author matheus
 */
public class listacircular {

    private int valor, qtd = 0;
    private listacircular proximo, anterior, primeiro, ultimo;

    public listacircular getAnterior() {
        return anterior;
    }

    public void setAnterior(listacircular anterior) {
        this.anterior = anterior;
    }

    public listacircular getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(listacircular primeiro) {
        this.primeiro = primeiro;
    }

    public listacircular getUltimo() {
        return ultimo;
    }

    public void setUltimo(listacircular ultimo) {
        this.ultimo = ultimo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public listacircular getProximo() {
        return proximo;
    }

    public void setProximo(listacircular proximo) {
        this.proximo = proximo;
    }

    public void PrintQtd(listacircular lista) {
        System.out.println("qtd: " + qtd);
    }

    public void PrintElm(listacircular lista) {
        listacircular aux = new listacircular();
        aux = primeiro;
        while (aux != null) {
            System.out.print(" " + aux.getValor());
            aux = aux.getProximo();
        }
        System.out.println("");
    }

    public void InsereFim(listacircular lista) {
        int aux = Input.readInt("valor: ");
        if (lista.primeiro == null) {
            listacircular novo = new listacircular();
            novo.setValor(aux);
            lista.setPrimeiro(novo);
            lista.setUltimo(novo);
            lista.setAnterior(null);
            lista.setProximo(null);
        } else {
            listacircular novo = new listacircular();

            novo.setValor(aux);

            novo.setAnterior(lista.getUltimo());
            lista.getUltimo().setProximo(novo);
            novo.setProximo(null);
            lista.setUltimo(novo);
        }
        qtd++;
    }

    public void InsereIni(listacircular lista) {
        int aux = Input.readInt("valor: ");
        if (lista.primeiro == null) {
            listacircular novo = new listacircular();
            novo.setValor(aux);
            lista.setPrimeiro(novo);
            lista.setUltimo(novo);
            lista.setAnterior(null);
            lista.setProximo(null);
        } else {
            listacircular novo = new listacircular();

            novo.setValor(aux);

            novo.setProximo(lista.getPrimeiro());
            lista.getPrimeiro().setAnterior(novo);
            novo.setAnterior(null);
            lista.setPrimeiro(novo);

        }
        qtd++;
    }

    public void ExluirIni() {
        primeiro = primeiro.getProximo();
        primeiro.setAnterior(null);
        qtd--;
    }

    public void ExluirFim() {
        ultimo = ultimo.getAnterior();
        ultimo.setProximo(null);
        qtd--;
    }

    public void BuscaValor() {
        int busca = Input.readInt("Valor procurado: ");
        boolean achou = false;
        listacircular aux = primeiro;

        while (aux.getProximo() != null && achou == false) {
            if (busca == aux.getValor()) {
                achou = true;
                System.out.println("Valor :" + busca + " esta na lista.");
            } else {
                aux = aux.getProximo();
            }
        }
        if (achou == false) {
            System.out.println("Valor: " + busca + " não esta na lista");
        }
    }

}
