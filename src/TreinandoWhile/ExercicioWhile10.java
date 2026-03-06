package TreinandoWhile;

public class ExercicioWhile10 {
    public static void main(String[] args) {
        int numero = 1;
        int quantidade = 0;

        while(numero < 1000) {
            numero *= 2;
            quantidade++;
        }
        System.out.println("Quantidade de vezes que dobrou: "+quantidade+", Valor final: "+numero);
    }
}
