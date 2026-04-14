package TreinandoArraysForeach;

public class Exercicio03 {
    public static void main(String[] args) {
        String[] nomes = {"joao" , "maria", "jose", "Lucas"};

        for (String nome : nomes) {
            System.out.println(nome + " tem " + nome.length() + " letras ") ;
        }
    }
}
