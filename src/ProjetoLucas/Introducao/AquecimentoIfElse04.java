package ProjetoLucas.Introducao;

public class AquecimentoIfElse04 {
    public static void main(String[] args) {
        int idade = 20;
        double salario = 5000;
        String resultado;
        if(idade >= 18 && salario >= 3000){
            resultado = "Pode Financiar";
        }else{
            resultado = "Não pode financiar";
        }
        System.out.println(resultado);
    }
}
