package TreinandoAntesDeComecarPOO;

public class TreinandoTiposPrimitivos03 {
    public static void main(String[] args) {
        String nome = "Lucas";
        int idade = 20;
        double nota1 = 8.0;
        double nota2 = 6.5;
        float frequencia = 80.0F;

        double media = (nota1 + nota2) / 2.0;
        String situacao;

        if (frequencia < 75) {
            situacao = "Reprovado por falta";
        } else if (media >= 7) {
            situacao = "Aprovado";
        } else if (media >= 5) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }

        System.out.println("Nome: " + nome +
                " Idade: " + idade +
                " Notas: " + nota1 + ", " + nota2 +
                " Frequência: " + frequencia);

        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }
}