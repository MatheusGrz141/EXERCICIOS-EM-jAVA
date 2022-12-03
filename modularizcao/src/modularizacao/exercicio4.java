
import modularizacao2.Input;

/*
 Elaborar um programa para efetuar o cálculo da quantidade de
litros de combustível gasta em uma viagem, utilizando um automóvel
que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer
o tempo gasto e a velocidade média durante a viagem. Desta forma,
será possível obter a distância percorrida com a fórmula DISTANCIA
<- TEMPO * VELOCIDADE. Tendo o valor da distância, basta calcular a
quantidade de litros de combustível utilizada na viagem com a
fórmula: LITROS_USADOS <- DISTANCIA / 12. O programa deve apresentar
os valores da velocidade média, tempo gasto na viagem, a distância
percorrida e a quantidade de litros utilizada na viagem.*/

public class exercicio4 {

    public static void Litros(double T, double V) {
        double D, LU;
        D = T * V;
        LU = D / 12;
        System.out.println("Distancia: " + D);
        System.out.println("Litros usados: " + LU);

    }

    public static void main(String Args[]) {

        double tempo, velocidade;

        tempo = Input.readDouble("Tempo: ");
        velocidade = Input.readDouble("Velocidade media: ");

        Litros(tempo, velocidade);

    }

}
