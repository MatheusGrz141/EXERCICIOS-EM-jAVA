
import modularizacao2.Input;


/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class exercicio1 {

    /*Desenvolva um algoritmo para ler uma temperatura em graus Celsius
e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão
é: F <- (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C
a temperatura em Celsius.*/
    public static double Fahrenheit(double c) {

        double f;

        f = (9 * c + 160) / 5;
        return f;

    }

    public static void main(String[] args) {
        double cel, far;

        cel = Input.readDouble("Temperatura em Celcius:");

        far = Fahrenheit(cel);

        System.out.println("Fahrenheit: " + far);
    }

}
