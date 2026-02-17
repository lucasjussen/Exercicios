package TreinandoSwitch;

public class Exercicio02 {
    public static void main(String[] args) {
        /*Crie um programa com as opções:
        1 → Hambúrguer
        2 → Pizza
        3 → Sushi
        4 → Salada
        Imprima:
            "Você escolheu: X"
Se for outro número → "Opção inválida" */

        byte opcaoCliente = 1;
        String menu;

        switch (opcaoCliente) {

            case 1:
                menu = "Hamburguer";
                break;

            case 2:
                menu = "Pizza";
                break;

            case 3:
                menu = "Sushi";
                break;

            case 4:
                menu = "Salada";
                break;

            default:
                menu = "Opção inválida";
        }
                System.out.println(menu);

    }
}
