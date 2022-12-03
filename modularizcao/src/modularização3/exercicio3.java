/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularização3;

/**
 * Faça a multiplicação de dois números sem utilizar o operador * e de maneira
 * recursiva.
 *
 * @author Matheus
 */
public class exercicio3 {

    public static int multiplica(int x, int y) {
        int resp = 0;
        if ( x>0 ) {
            

            resp = multiplica((x=x-1), y);
            resp = resp + y;
        }

        return resp;
    }

    public static void main(String args[]) {
        int i, x, y, z;
        i = 0;
        z = 0;
        x = Input.readInt("Valor de X: ");
        y = Input.readInt("Valor de Y: ");

        z = multiplica(x, y);
        System.out.println(z);

    }

}
