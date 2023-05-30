package aula04;

public class PraiaAlgoritmo {
    public static void main(String[] args){

    boolean fimDeSemana = true;
    //as variaveis são escritas seguindo o camelCase
    boolean fazendoSol = true;
    boolean vamosAPraia = fimDeSemana && fazendoSol;

    System.out.println(vamosAPraia);

    String msg = fimDeSemana ? "é fim de semana" : "Não é fim de semana";
    System.out.println(msg);
}

}
