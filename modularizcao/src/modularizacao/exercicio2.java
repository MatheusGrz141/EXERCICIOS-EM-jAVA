
import modularizacao2.Input;


public class exercicio2 {

    /* Desenvolva um algoritmo para ler uma temperatura em graus
Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de
conversão é: C <- (F - 32) * (5 / 9), sendo F a temperatura em
Fahrenheit e C a temperatura em Celsius.*/
    public static double Celcius(double F) {
        double C;
        C = (F - 32) * 5 / 9;
        // C= C * 5/9;
        return C;
    }

    public static void main(String args[]) {
        double far, cel;
        far = Input.readDouble("Fahrenheit: ");

        cel = Celcius(far);

        System.out.println("Valor em Celcius: " + cel);

    }

}
