package ProjetoLucas.Introducao;

public class AquecimentoIfElse02 {
    public static void main(String[] args) {
        // Produto = R$ 200
        // Cliente pagar à vista - 10% de desconto
        // Se parcelar - sem desconto
        //Mostre o valor final a pagar
        double produto = 200;
        double valorFinal;
        int formaPagamento = 1;

        if(formaPagamento == 1){
            valorFinal = produto - (produto*0.10);
        }else {
            valorFinal = produto;
        }
        System.out.println("valorFinal: "+valorFinal);

        }
    }
