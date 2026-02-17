package TreinandoSwitch;

public class Exercicio03 {
    public static void main(String[] args) {
        /* EXERCÍCIO 4 — Classificação de nota (nível médio)
        Nota de 0 a 10 (inteiro).
        Use switch para imprimir:
        10 → Excelente
        9 ou 8 → Muito bom
        7 → Bom
        6 ou 5 → Regular
        4 até 0 → Reprovado */

        int nota = 1;
        String resultado;

        switch (nota) {

            case 10:
                resultado = "Excelente";
            break;

            case 9:
            case 8:
                resultado = "Muito bom";
            break;

            case 7:
                resultado = "Bom";
            break;

            case 6:
            case 5:
                resultado = "Regular";
            break;

            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                resultado = "Reprovado";
                break;
            default:
                resultado = "Nota inválida";

        }

        System.out.println(resultado);
    }
}
