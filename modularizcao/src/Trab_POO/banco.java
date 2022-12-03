/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trab_POO;

/**
 *
 * @author Matheus
 */
public class banco {

    cliente vetclient[];
    conta vetcont[];
    agencia vetagenc[];
    int qtdclient = 0, qtdagenc = 0, qtdconta = 0, x, y, z;

    public banco() {

        x = Input.readInt("Quantidade de agencias a serem cadastrados: ");
        z = Input.readInt("Quantidade de clientes a serem cadastrados: ");
        y = Input.readInt("Quantidade de  contas a serem cadastrados: ");
        vetagenc = new agencia[x];
        vetclient = new cliente[y];
        vetcont = new conta[z];
    }

    public void CadAgenc() {

        if (qtdagenc < x) {
            vetagenc[qtdagenc] = new agencia();
            qtdagenc++;
        } else {
            System.out.println("A quantidade maxima de agencias foi cadastrada!!!");
        }

    }

    public void CadClient() {

        if (qtdclient < y) {
            vetclient[qtdclient] = new cliente();
            qtdclient++;
        } else {
            System.out.println("A quantidade maxima de clietes foi cadastrada!!!");
        }

    }

    public void CadCont() {

        if (qtdconta < z) {
            vetcont[qtdconta] = new conta();
            qtdconta++;
        } else {
            System.out.println("A quantidade maxima de contas foi cadastrada!!!");
        }
    }

    public void ListAgenc() {
        int i, x, buscar;
        buscar = Input.readInt("Numero da agencia a ser listado : ");
        for (x = 0; x < qtdagenc; x++) {
            if (vetcont[x].Getnumagenc() == buscar) {
                for (i = 0; i < qtdclient; i++) {
                    if (vetclient[i].GetCpf() == vetcont[x].Getnumcpf()) {
                        System.out.println("cliente: " + vetclient[i].GetNome() + "Conta: " + vetcont[x].numcont);
                    }

                }
            }
        }

    }

    public void ListClient() {
        int x, buscar;
        buscar = Input.readInt("Numero do CPF a ser listado : ");
        for (x = 0; x < qtdclient; x++) {
            if (vetcont[x].Getnumcpf() == buscar) {
                vetcont[x].Imprime();
            }

        }
    }

    public void LIstClientAgenc() {
        int x, i, buscar;
        buscar = Input.readInt("Numero da agencia a ser listado : ");

        for (x = 0; x < qtdagenc; x++) {
            if (vetcont[x].Getnumagenc() == buscar) {
                for (i = 0; i < qtdclient; i++) {
                    if (vetclient[i].GetCpf() == vetcont[x].Getnumcpf()) {
                        System.out.println("cliente: " + vetclient[i].GetNome() + "Telefone: " + vetclient[i].Gettelefone());
                    }

                }
            }
        }
    }

    public void menu() {
        int op;
        System.out.println("1-Cadastrar agência: ");
        System.out.println("2-Cadastrar cliente: ");
        System.out.println("3-Cadastrar conta: ");
        System.out.println("4-Listagem de contas por agência: ");
        System.out.println("5-Listagem de contas por cliente ");
        System.out.println("6-Listagem de clientes por agência: ");
        System.out.println("0-sair: \n");
        do {
            op = Input.readInt("Escolha uma opção: ");

            switch (op) {
                case 1 ->
                    CadAgenc();
                case 2 ->
                    CadClient();
                case 3 ->
                    CadCont();
                case 4 ->
                    ListAgenc();
                case 5 ->
                    ListClient();
                case 6 ->
                    LIstClientAgenc();
                case 0 ->
                    Fim();
                default ->
                    System.out.println("Opção inválida!");
            }

        } while (op != 0);

    }

    public static void Fim() {
        System.out.println("\nFim da execução!!!");
    }

    public static void main(String args[]) {
       

        banco obj;
        obj = new banco();
        obj.menu();

    }

}
