package aula05;

import java.util.Scanner;

public class GraduaçoesNotas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua nota");
        double nota = scan.nextDouble();
        //A 80 B 70 C 60 D 0

        if(nota >= 8){
            System.out.println("Graduação A");
        } else if (nota<8 && nota>= 7){
            System.out.println("Graduação B");
        } else if (nota < 7 && nota >= 6){
            System.out.println("Graduação C");
        }else if (nota < 6 && nota >= 0){
            System.out.println("Graduação D");
        } else {
            System.out.println("Nota inválida");
        }

    }
}
