
import modularizacao2.Input;

/*
  Elaborar um programa para efetuar o cálculo e a apresentação do
valor de uma prestação em atraso, utilizando a fórmula: PRESTACAO <-
VALOR + (VALOR * (TAXA / 100) * TEMPO). 
 */

/**
 *
 * @author Matheus
 */
public class exercicio5 {

    public static void Prestação(double V, double T, double TA) {
        double P;

        P = V + (V * (TA / 100) * T);
        System.out.println("Prestção: " + P);

    }

    public static void main(String args[]) {
        double valor, tempo, taxa;

        valor = Input.readInt("Valor: ");
        tempo = Input.readInt("Tempo: ");
        taxa = Input.readInt("Taxa: ");

        Prestação(valor, tempo, taxa);

    }
}
