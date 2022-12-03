/*
2) Crie um programa para descrever restaurantes. O programa deve armazenar
o nome, o endereço, o preço médio e o tipo de comida.
a) Crie um método que inicialize os dados com zero e outro que inicialize os
dados com um valor fixo.
b) Crie um método para solicitar os dados para o usuário.
c) Crie uma função para imprimir os dados de um restaurante.
d) Escreva um programa com vários restaurantes e solicite a entrada dos
dados pelo usuário. Em seguida, o programa pergunta o tipo de comida ao
usuário (e o preço máximo que ele aceita gastar) e lista todos os restaurantes
que a oferecem. A lista de restaurantes deve ser apresentada de forma
completa, com nome, endereço e preço médio.
 */
package modularizacao2;

class Restaurant {

    String nome;
    String endereco;
    Double preco;
    String comida;
}

public class exercicio2 {

    public static Restaurant Predefinido(Restaurant m[], int x) {

        m[x] = new Restaurant();

        m[x].nome ="res"+x;
        m[x].endereco = "Endereço: " + x;
        m[x].preco = 50.0 + x;
        m[x].comida = "Hamburguer tipo " + x;

        return m[x];

    }
    public static Restaurant Tudozero(Restaurant m[], int x) {

        m[x] = new Restaurant();

        m[x].nome = "VOID";
        m[x].endereco = "VOID";
        m[x].preco = 0.0;
        m[x].comida = "VOID";

        return m[x];

    }
    public static void EscrevaRestaurant(Restaurant v[], int x) {

        //System.out.println("RESTAURANTE" + (x+1));
        System.out.println(v[x].nome);
        System.out.println(v[x].endereco);
        System.out.println("Preço medio: " + v[x].preco);
        System.out.println(v[x].comida);
        System.out.println("");

    }
    public static void Buscanome(String n, int x, Restaurant v[]) {
        int i;
        for (i = 0; i < x; i++) {
            if (n.equals(v[i].nome)) {

                System.out.println("Restaurante " + i + " encontrado!!!");
                
                System.out.println(v[i].nome);
                System.out.println(v[i].endereco);
                System.out.println("Preço medio: " + v[i].preco);
                System.out.println(v[i].comida);
                System.out.println("");

            }
            
            
        }
    }
    public static void main(String args[]) {

        Restaurant vet[];
        int i, op, x;
        String pesquisa;

        x = Input.readInt("Quantos restaurantes: ");
        op = 0;
        vet = new Restaurant[x];
        for (i = 0; i < x; i++) {
            vet[i] = new Restaurant();
        }
        while (op > 2 || op < 1) {
            op = Input.readInt("Digite 1 para inicializar tudo com zero ou 2 para valores pre definidos:");
            System.out.println("");
        }

        if (op == 1) {
            for (i = 0; i < x; i++) {
                vet[i] = Tudozero(vet, i);
                EscrevaRestaurant(vet, i);
            }

        }
        if (op == 2) {
            for (i = 0; i < x; i++) {
                vet[i] = Predefinido(vet, i);
                EscrevaRestaurant(vet, i);
            }

        }

        pesquisa = Input.readString("Digite o nome  ser procurado: ");

        Buscanome(pesquisa, x, vet);

    }
}
