/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularização3;

/**
 *
 * @author Matheus
 */
public class exercicio2 {
    
    public static int palindro(char vet[], int x ,int i) {
        int z = x+i;
        
        if (i < z) {
            if (vet[x-1] == vet[i]) {
                //System.out.print("");
                
                palindro(vet , (--x),(++i));
                
               // System.out.println("é palindroma"); 
            }
            else 
              return 0; // System.out.println("não é palindroma");
        }
       return 1;
    }
    
    public static void main(String args[]) {
        
        char vet[];
        int i, x,z;
        
        x = Input.readInt("Digite o tamanho da palavra: ");
        
        
        vet = new char[x];
        
        for (i = 0; i < x; i++) {
            vet[i] = Input.readChar(": ");
            
        }
        i=0;
     z = palindro(vet , x ,i); 
     if(z == 0 )
     System.out.println("Não é palindromo ");
    
    if(z == 1 )
     System.out.println("é palindromo ");
    
    
    }
    
}
