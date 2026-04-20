package TreinandoAntesDeComecarPOO;

public class ExercicioTiposPrimitivos02 {
    public static void main(String[] args) {
        int idade = 25;
        double salario = 2500.0;
        byte filhos = 2;
        float altura = 1.75F;
        boolean empregado = true;
        double salarioAumento;
        double filhoGasto;

        salarioAumento = salario * 1.10;
        filhoGasto = salario / filhos;

        System.out.println("idade: " + idade + " Salário: " + salario + " filhos: " + filhos +" Altura: " + altura+ " Empregado: "+empregado);

        System.out.println("Salário com aumento: " + salarioAumento);
        System.out.println("Gasto por filho: " + filhoGasto);

    }
}
