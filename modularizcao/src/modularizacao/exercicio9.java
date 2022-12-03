
import modularizacao2.Input;


/*
 9) Problema:
Deseja-se armazenar, de uma turma composta de 30 alunos, o nome e a
média de cada aluno. Para isso serão informados o nome, a nota da
primeira prova, a nota da segunda prova e os pontos extras de
participação de cada aluno. A média deve ser calculada sobre as duas
primeiras notas. Os pontos de participação serão somados na média
final mas sempre obedecendo o limite máximo de 10 para a média.
Após a entrada de dados deve-se exibir a relação de alunos com os
seus nomes e médias. (Sugestão de métodos solicitaNota,
calculaMedia, exibeAluno e finalizaPrograma).

 */
/**
 *
 * @author Matheus
 *
 */

class Registro {

    String aluno;
    double media;
    int PE, P1, P2;

    public void calculaMedia() {
        media = ((P1 + P2)/2)+PE;
            if(media >10)
                media = 10;
           // System.out.println("media do aluno "+media);
    }
}

public class exercicio9 {

    public static void main(String args[]) {

        Registro vet[] = new Registro[3];
        

        for (int i = 0; i < 3 ; i++) {
            vet[i] = new Registro();
            vet[i].aluno = Input.readString("Nome do aluno: ");
            vet[i].P1 = Input.readInt("Nota P1: ");
            vet[i].P2 = Input.readInt("Nota P2: ");
            vet[i].PE = Input.readInt("Nota PE: ");
            System.out.println("");
            
            vet[i].calculaMedia();

        }
        for (int i = 0; i < 3 ; i++)
            System.out.println("Média do aluno "+vet[i].aluno+": "+vet[i].media);

    }

}


