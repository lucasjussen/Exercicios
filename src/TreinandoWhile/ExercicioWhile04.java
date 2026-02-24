package TreinandoWhile;

public class ExercicioWhile04 {
    public static void main(String[] args) {
        int numero = 7;
        int contador = 1;

        while (contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        }
    }
}