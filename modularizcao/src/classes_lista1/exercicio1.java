/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes_lista1;

/**
 * Escreva uma classe Computador que possua as caraterísticas que definam a
 * configuração de um microcomputador (tipo e preço do processador, tipo e preço
 * da memória RAM, tipo e preço do disco rígido, tipo e preço do monitor). Essa
 * classe deve ter implementada seus métodos setters e getters, um método
 * calculaPreço que calcule o preço do computador como sendo a soma do custo de
 * seus componentes, bem como um método para mostrar a sua configuração.
 *
 * @author Matheus
 */
class Computador {

    String processador;
    String monitor;
    String ram;
    String hd;

    double processadorpreço;
    double monitorpreço;
    double rampreço;
    double hdpreço;

}

public class exercicio1 {
    public static void preçopc(){
        
    }
      public static void Configpc(){
        
    }

    public static void main(String args[]) {
        Computador vet[];
       int x;
        
        x = Input.readInt("Qtd de Computador: ");
        vet = new Computador[x];
        for (int i = 0; i < x; i++) {
            vet[i] = new Computador();
            System.out.println("Modelo ");
            vet[i].ram = Input.readString("Ram: ");
            vet[i].monitor = Input.readString("monitor: ");
            vet[i].hd = Input.readString("HD: ");
            vet[i].processador = Input.readString("Processador: ");

            vet[i].rampreço = Input.readDouble("preço da Ram: ");
            vet[i].monitorpreço = Input.readDouble("preço da  monitor: ");
            vet[i].hdpreço = Input.readDouble("preço da HD: ");
            vet[i].processadorpreço = Input.readDouble("preço da Processador: ");

        }
    }

}
