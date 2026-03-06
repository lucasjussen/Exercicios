package TreinandoWhile;

public class ExercicioWhile12 {
    public static void main(String[] args) {
        double valorInicial = 1000;
        double taxa = 0.03;
        int meses = 0;

        while (valorInicial < 2000) {
            valorInicial += valorInicial * taxa;
            meses++;


        }
        System.out.println("Foram necessários: "+meses+", para chegar em valor final de: " + valorInicial);

    }
}
