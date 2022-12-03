
import modularizacao2.Input;

/*
 8) Crie o algoritmo CALCULADORA que apresente o menu abaixo e permita
que o usuário efetue quantas e quais operações desejar com dois
números lidos na opção 1 - Entrada de Dados. Ou seja, o usuário deve
poder escolher a opção 1, digitar dois números e, em seguida, voltar
ao menu para escolher qualquer das 4 operações. Após o usuário
efetuar a escolha da operação, mostre o resultado e volte ao menu
para que uma nova operação possa ser escolhida ou uma nova entrada
de dados possa ser feita.
1 - Entrada de dados
2 - Adição
3 - Subtração
4 - Multiplicação
5 - Divisão
6 - Encerrar
Escolha uma das operações:
Para mostrar o menu de opções use uma função.
Use funções para implementar as opções 2, 3, 4 e 5. Em cada função
use como parâmetros os dois valores numéricos lidos na opção 1; os
quais serão usados nas operações de adição, subtração, multiplicação
ou divisão, dependendo da operação realizada pela função. Cada função
deve retornar o resultado da operação realizada.
Na operação de divisão o denominador não pode ser nulo. Use uma
função para verificar este fato antes de efetuar a divisão. Esta
função deve ter como parâmetro o denominador da divisão e retornar
verdadeiro caso o denominador seja nulo e falso caso contrário.

 */
/**
 *
 * @author Matheus1
 */
public class exercicio8 {

    public static void escreva() {
        System.out.println("1 - Entrada de dados");
        System.out.println("2 - Adição");
        System.out.println("3 - Subtração");
        System.out.println("4 - Multiplicação");
        System.out.println("5 - Divisão");
        System.out.println("6 - Encerrar");
    }

    public static double soma(int n1, int n2) {
        int resultado;
        resultado = n1 + n2;
        return resultado;
    }

    public static double subtracao(int n1, int n2) {
        int resultado;
        resultado = n1 - n2;
        return resultado;
    }

    public static double multiplicacao(int n1, int n2) {
        int resultado;
        resultado = n1 * n2;
        return resultado;
    }

    public static double divisao(int n1, int n2) {
        double resultado =0;
        
        if (n2 != 0) {
            resultado = (n1 / n2);
            
        } 
            
        return resultado;
    }

    public static void calculadora(int n1, int n2) {
        int op;
        double resultado = 0;
        op = Input.readInt("Escolha uma opção : ");

        while (op != 6) {

            op = Input.readInt("Escolha uma opção: ");
            //while(op>6 || op<1){
            //    System.out.println("Valor invalido!!!");
            //   op = Input.readInt("Escolha uma opção: ");
            //}

            if (op == 1) {
                n1 = Input.readInt("n1:");
                n2 = Input.readInt("n2:");

            }
            if (op == 2) {
                resultado = n1 + n2;
                System.out.println("Resultado: " + resultado);

            }
            if (op == 3) {
                resultado = n1 - n2;
                System.out.println("Resultado: " + resultado);
            }
            if (op == 4) {
                resultado = n1 * n2;
                System.out.println("Resultado: " + resultado);
            }
            if (op == 5) {
                if (n2 != 0) {
                    resultado = (n1 / n2);
                } else {
                    System.out.println("Denominador inválido!!!");
                }
            }

            if (op < 1 || op > 6) {
                System.out.print("");
            } else if (n2 == 0 && op == 5) {
                System.out.println(" Resultado Impossivel!!!");
            } else {
                System.out.println("Resultado: " + resultado);
            }
        }

        if (op == 6) {
            System.out.println("FIm da execução!!!");
        }

    }

    public static void main(String args[]) {

        int n1 = 0, n2 = 0, op = 1;

        double resultado;
        escreva();

        while (op != 6) {
            op = Input.readInt("escolha uma opção! : ");
            if (op == 1) {
                n1 = Input.readInt("n1:");
                n2 = Input.readInt("n2:");

            }
            if (op == 2) {
                resultado = soma(n1, n2);
                System.out.println("Resultado: " + resultado);
            }
            if (op == 3) {
                resultado = subtracao(n1, n2);
                System.out.println("Resultado: " + resultado);
            }
            if (op == 4) {
                resultado = multiplicacao(n1, n2);
                System.out.println("Resultado: " + resultado);
            }
            if (op == 5) {
               resultado = divisao(n1, n2);
               if(resultado == 0 && n2 ==0)
                   System.out.println("OPeraçao invalida");
                           else
               System.out.println("Resultado: " + resultado);

            }

        }

        if (op == 6) {
            System.out.println("FIm da execução!!!");
        }

    }
}
