/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

/**
 *
 * @author Matheus
 */
public class questao1 {

    public static int Matricula(int matricula[], int posi) {

        matricula[posi] = Input.readInt("Matricula: ");
        return matricula[posi];
    }

    public static String Nome(String nome[], int posi) {
        nome[posi] = Input.readString("Nome: ");
        return nome[posi];
    }

    public static int Departamento(int departamento[], int posi) {
        departamento[posi] = Input.readInt("Departamento: ");
        return departamento[posi];
    }

    public static Double Salario(Double salario[], int posi) {
        salario[posi] = Input.readDouble("Salario: ");
        return salario[posi];
    }

    public static String Cargo(String cargo[], int posi) {
        cargo[posi] = Input.readString("cargo: ");
        return cargo[posi];

    }

    public static void Imprimir(String nome[], Double salario[], String cargo[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("");
            System.out.println("nome : " + (nome[i]) + " ,salario: " + (salario[i]) + " ,cargo: " + cargo[i]);
        }

    }

    public static void SomaT(Double salario[], int n) {
        double somat = 0;
        for (int i = 0; i < n; i++) {
            somat = somat + salario[i];
        }
        System.out.println("Valor total da folha de pagamento: " + somat);

    }

    public static void MaiorS(Double salario[], String nome[], int n) {

        double maiors = 0;
        int maior = 0;
        for (int i = 0; i < n; i++) {
            if (salario[i] > maiors) {
                maiors = salario[i];
                maior = i;
            }
        }
        System.out.println("Maior salario: " + maiors + " do trabalador: " + nome[maior]);
    }

    public static void MenorS(Double salario[], String nome[], int n) {

        double menors = salario[0];
        int menor = 0;
        for (int i = 0; i < n; i++) {

            if (salario[i] < menors) {
                menors = salario[i];
                menor = i;
            }
        }
        System.out.println("Maior salario: " + menors + " do trabalador: " + nome[menor]);
    }

    public static void FaixaS(Double salario[], String nome[], int n) {

        Double x, y, aux;

        x = Input.readDouble("Digite o primeiro valor: ");
        y = Input.readDouble("Digite o Segundo valor: ");

        if (x > y) {

            aux = x;
            x = y;
            y = aux;
        }

        for (int i = 0; i < n; i++) {

            if (x < salario[i] && y > salario[i]) {
                System.out.println("Nome: " + nome[i] + " salario: " + salario[i]);
            }
        }

    }

    public static void DepNome(Double salario[], String nome[], int departamento[], String cargo[], int n) {

        int dep;

        dep = Input.readInt("numero do departamento: ");

        for (int i = 0; i < n; i++) {
            if (dep == departamento[i]) {
                System.out.println("nome: " + nome[i] + " cargo: " + cargo[i] + " salario: " + salario[i]);
            }

        }

        //método que possa receber como parâmetro o número de um determinado departamento e mostrar o nome, o cargo e
        //salário de todos
        //os funcionários daquele departamento;
    }

    public static void NomeCargo(String cargo[], String nome[], int n) {

        String no;

        no = Input.readString("Cargo a ser procurado: ");
        for (int i = 0; i < n; i++) {

            if (no == cargo[i]) {
                System.out.println("nome: " + nome[i]);
            }

        }

    }

    public static void Menu() {

        System.out.println("1 - adicionar funcionários ");
        System.out.println("2-atualizar as informações do funcionário ");
        System.out.println("3-imprimir a folha de pagamento  ");
        System.out.println("4- valor total da folha de pagamento; ");
        System.out.println("5- funcionário que recebe o maior salário");
        System.out.println("6-funcionário que recebe o menor salário;: ");
        System.out.println("7-funcionários que recebam salários em uma faixa de valor estipulada ");
        System.out.println("8-nome, o cargo e salário de todos os funcionários daquele departamento");
        System.out.println("9-cargo e posteriormente imprimir o nome de todas as pessoas que o exercem.");
        System.out.println("10-sair ");
        System.out.println(" ");
    }

    public static void main(String args[]) {
        int n, op, posi;

        n = Input.readInt("Numero de funcionarios: ");

        int matricula[] = new int[n];
        String nome[] = new String[n];
        int departamento[] = new int[n];
        Double salario[] = new Double[n];
        String cargo[] = new String[n];

        Menu();
        op = Input.readInt("ESCOLHA UMA OPÇÃO: ");

        while (op != 10) {
            if (op == 1) {

                do {
                    posi = Input.readInt("Qual o numero do funcionario de 1 a " + n + ": ");
                } while (posi > n || posi < 1);

                --posi;
                matricula[posi] = Matricula(matricula, posi);
                nome[posi] = Nome(nome, posi);
                departamento[posi] = Departamento(matricula, posi);
                salario[posi] = Salario(salario, posi);
                cargo[posi] = Cargo(cargo, posi);

            }

            if (op == 2) {
                posi = Input.readInt("Qual o numero do funcionario de 1 a " + n + ": ");
                --posi;
                int op2;
                do {

                    System.out.println("1 - matricula ");
                    System.out.println("2-nome ");
                    System.out.println("3-departamento  ");
                    System.out.println("4- salario ");
                    System.out.println("5- cargo");
                    op2 = Input.readInt("Escolha a opção deseja atualizar: ");
                } while (op2 > 5 || op2 < 2);
                if (op2 == 1) {
                    matricula[posi] = Matricula(matricula, posi);
                }
                if (op2 == 2) {
                    nome[posi] = Nome(nome, posi);
                }
                if (op2 == 3) {
                    departamento[posi] = Departamento(matricula, posi);
                }
                if (op2 == 4) {
                    salario[posi] = Salario(salario, posi);
                }
                if (op2 == 5) {
                    cargo[posi] = Cargo(cargo, posi);
                }

            }

            if (op == 3) {/*  nome   salários e cargos;*/
                Imprimir(nome, salario, cargo, n);
            }
            if (op == 4) { //método que possa retornar o valor total da folha de pagamento;
                SomaT(salario, n);

            }

            if (op == 5) {
                MaiorS(salario, nome, n);

            }
            if (op == 6) {

                MenorS(salario, nome, n);
            }

            if (op == 7) {

                FaixaS(salario, nome, n);
            }

            if (op == 8) {
                DepNome(salario, nome, departamento, cargo, n);

            }

            if (op == 9) {

                NomeCargo(cargo, nome, n);
            }
            Menu();
            op = Input.readInt("ESCOLHA UMA OPÇÃO: ");
            //################################
        }
    }

}
