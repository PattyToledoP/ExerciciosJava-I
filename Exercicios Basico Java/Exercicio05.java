public class Exercicio05 {
	public static void main(String[] args) {
		double salBase, gratif, imposto, salReceber;
		
		System.out.println("\nEste programa realiza o calculo do salário a receber por um funcionário a partir de seu salário base, considerando que ele deve receber 5% de gratificacao e pagar 7% de impostos.\n");
		
		System.out.print("Digite o salario base do funcionario: ");
		salBase = Double.parseDouble(System.console().readLine());
				
		gratif = salBase * 5 / 100;
		imposto = salBase * 7 / 100;
		salReceber = salBase + gratif - imposto;
		
		System.out.printf("SALARIO A RECEBER = R$ %.2f\n", salReceber);
	}
}