
import modularizacao2.Input;

/*
 Elaborar um programa para calcular e apresentar o valor do volume
de uma lata de óleo, utilizando a fórmula: VOLUME <- 3.14159 * R ^
2 * ALTURA

 */

/**
 *
 * @author Matheus
 */
public class exercicio3 {

    public static double VolumeCilindro(double R, double A) {
        double V;

        V = R * R * A * (3.14159);

        return V;

    }

    public static void main(String args[]) {

        double raio, altura, volume;
        raio = Input.readInt("Raio: ");
        altura = Input.readInt("ALtura: ");

        volume = VolumeCilindro(raio, altura);

        System.out.println("Volume: " + volume);

    }
}
