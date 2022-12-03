/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularizacao2;

/**
 *
 * @author Matheus
 */
public class exercicio3 {

    public static void cadastrar_contas(int x, double s[][], int cc[]) {

        int i, j;
        s = new double[x][2];
        cc = new int[x];

        for (i = 0; i < x; i++) {
            System.out.println("");
            cc[i] = Input.readInt("Conta corrente cliente " + (i + 1) + ": ");

            s[i][0] = Input.readDouble("Saldo cheque especial: ");
            s[i][1] = Input.readDouble("limite cheque especial: ");

        }

    }

    public static void relatorio_contas(int x, double s[][], int cc[]) {
        int i;

        for (i = 0; i < x; i++) {
            System.out.println(cc[i]);

            System.out.println(s[i][0]);
            System.out.println(s[i][1]);

        }
    }

    public static void main(String args[]) {

        int contacorente[];
        double saldocheque[][];

        int x = Input.readInt("Quantidade a ser cadastrada: ");
        contacorente = new int[x];
        saldocheque = new double[x][2];

        cadastrar_contas(x, saldocheque, contacorente);
        
        
        relatorio_contas(x, saldocheque, contacorente);
        
        
        
    }
}
