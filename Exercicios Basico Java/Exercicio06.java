public class Exercicio06 {
	public static void main(String[] args) {
		double salFixo, valVendas, comissao, salFinal;
		
		System.out.println("\nEste programa realiza o calculo do salário a receber por um funcionário a partir de seu salário fixo e valor em vendas, considerando que ele deve receber 4% de comissao sobre suas vendas.\n");
		
		System.out.print("Digite o salario fixo do funcionario: ");
		salFixo = Double.parseDouble(System.console().readLine());
		System.out.print("Valor vendido pelo funcionario: ");
		valVendas = Double.parseDouble(System.console().readLine());
				
		comissao = valVendas * 4 / 100;
		salFinal = salFixo + comissao;
		
		System.out.printf("COMISSAO A RECEBER = R$ %.2f\n", comissao);
		System.out.printf("SALARIO FINAL = R$ %.2f\n", salFinal);
	}
}