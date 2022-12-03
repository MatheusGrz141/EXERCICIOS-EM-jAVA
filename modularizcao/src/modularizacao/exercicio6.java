
import modularizacao2.Input;

/*
Implemente o cálculo de potência: dada uma base e o expoente,
retornar a base elevada ao expoente(Exponencial). Passe por
parâmetro a base e o expoente. Não utilizar a função pow.

 */

/**
 *
 * @author Matheus
 */
public class exercicio6 {

    public static void potenc(int B, int E) {
        int i, R =1;
        
        for (i = 0; i < E; i++) {
            R = R * B;
        }
        System.out.println("Resultado: " + R);

    }

    public static void main(String args[]) {

        int base, expoente;

        base = Input.readInt("base: ");
        expoente = Input.readInt("expoente: ");

        potenc(base, expoente);
    }

}
