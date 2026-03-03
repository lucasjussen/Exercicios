package TreinandoWhile;

public class ExercicioWhile08 {
    public static void main(String[] args) {
        double valorInicial = 10000;
        double taxa = 0.02; // 2% ao mês
        int meses = 0;

        while (valorInicial < 20000) {
            valorInicial += valorInicial * taxa;
            meses++;

        }
        System.out.println("foram necessários: " + meses +"para pagar:" + valorInicial);
    }
}







