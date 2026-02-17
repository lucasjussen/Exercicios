package ProjetoLucas.Introducao;

public class AquecimentoIfElse03 {
    public static void main(String[] args) {
        // Receba uma nota de 0 a 10.
        // Sistema de notas
        // Nota >= 7 → Aprovado
        // Nota entre 5 e 6.9 → Recuperação
        // Nota < 5 → Reprovado
        double nota = 10;
        String StatusAluno;

        if(nota >= 7){
            StatusAluno = "Aprovado";
        }else if(nota >= 5 && nota <= 6.9){
            StatusAluno = "Recuperação";
        }else {
            StatusAluno = "Reprovado";
        }
        System.out.println(StatusAluno);
    }
}
