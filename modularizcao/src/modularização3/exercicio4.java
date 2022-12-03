/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularização3;

/**
 * 4) Implemente o método de Fibonacci utilizando recursividade.
 *
 * @author Matheus
 */
public class exercicio4 {

    public static int fibo(int x) {

        if (x <= 2)// {

            return 1;

       // } else {
            //System.out.print(" " + fibo(x));
            return (fibo(x - 1) + fibo(x - 2));

        //}

    }
    public static void lista(  int x ){
    int r  ;   
    if(x>0){
       r= fibo (x);
       System.out.print ((" "+r));
       lista(x=x-1);
    }
}

    public static void main(String args[]) {

        int x, resp;
        x = Input.readInt("Digite o valor : ");

        
        
        lista(fibo(x));

    }
}
