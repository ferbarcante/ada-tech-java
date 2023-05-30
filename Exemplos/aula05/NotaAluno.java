package aula05;

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua nota");
        double nota = scan.nextDouble();

        if (nota>=7){
            System.out.println("O aluno foi aprovado");
        } else {
            System.out.println("Não aprovado");
        }

    }
}
