/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularização3;
//1) Utilizando recursividade, a partir de um número X, mostre em ordem decrescente todos os números pares até o valor 0.//
/**
 *
 * @author Matheus
 */

public class exercicio1 {
    public static void calculapar(int x){
        if(x>0){
        if(x%2==0){
            System.out.println(x+" ");
            x=x-2;
        }
        else
            x=x-1;
        calculapar(x);
        
        }
}
    public static void main(String args[]){
        
        int x;
        
        x = Input.readInt("DIgite um numero: ");
        
        
        calculapar(x);
    }
        
    
}
