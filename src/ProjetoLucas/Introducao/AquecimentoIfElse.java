package ProjetoLucas.Introducao;

public class AquecimentoIfElse {
    public static void main(String[] args) {
        int idade = 25;
        String categoriaIdade;

        if(idade <= 17){
            categoriaIdade = "Menor de idade";
        }else if(idade >= 18 && idade <= 59){
            categoriaIdade = "Adulto";
        }else{
            categoriaIdade = "idoso";
        }
        System.out.println(categoriaIdade);


    }
}
