package TreinandoSwitch;

public class Exercicio04 {
    /* 🧠 DESAFIO — Sistema Bancário Simplificado

    Crie um programa que simule operações bancárias.
    Opções:
    1 → Consultar saldo
    2 → Depositar
    3 → Sacar
    4 → Sair */
    public static void main(String[] args) {

        int opcao = 6;
        int saldo = 1000;
        String resultado;

        switch (opcao) {

            case 1:
                resultado = "Seu saldo é: " + saldo;
                break;

            case 2:
                saldo += 500;
                resultado = "Depósito realizado. Novo saldo: ";
                break;

            case 3:
                if (saldo < 300) {
                    resultado = "Saldo Insuficiente";
                } else {
                    saldo -= 300;
                    resultado = "Saque realizado. Novo saldo: " + saldo;
                }
                break;

            case 4:
                resultado = "Encerrando sistema...";
                break;

            default:
                resultado = "Opção inválida";
        }
        System.out.println(resultado);
    }
}
