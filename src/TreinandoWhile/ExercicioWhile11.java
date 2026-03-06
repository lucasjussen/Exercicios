package TreinandoWhile;

public class ExercicioWhile11 {
    public static void main(String[] args) {
        int numero = 3;
        int quantidade = 0;

        while(numero < 5000) {
            numero *= 2;
            quantidade++;

        }
        System.out.println("Valor final: "+numero+". Quantidade de vezes que dobrou: " + quantidade);
    }
}
