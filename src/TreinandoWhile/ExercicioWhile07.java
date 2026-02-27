package TreinandoWhile;

public class ExercicioWhile07 {
    // Condição:
    // Parcela mínima = 1500 / max 36 ** Imprima: Quantas parcelas são possíveis, O valor de cada parcela
    // Pare quando: valor da parcela < 1500 OU parcela > 36
    public static void main(String[] args) {
        double valorProduto = 45000;
        double valorParcela;

        for (int i = 1; i <= 36; i++) {
            valorParcela = valorProduto / i;
            System.out.println(valorParcela);
            if(valorParcela < 1500) {
                System.out.println("A partir de " + i + " parcelas o valor fica abaixo do permitido.");
                break;


        }
        }
    }
}
