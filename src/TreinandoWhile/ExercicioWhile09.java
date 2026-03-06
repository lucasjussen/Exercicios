package TreinandoWhile;

public class ExercicioWhile09 {
    public static void main(String[] args) {
        double valor = 5000;
        double taxa = 0.05;
        int meses = 0;

        while (valor > 3000) {
            valor -= valor * taxa;
            meses++;

        }

        System.out.println("Quantos meses levou para cair abaixo de 3000: " + meses);
    }
}
