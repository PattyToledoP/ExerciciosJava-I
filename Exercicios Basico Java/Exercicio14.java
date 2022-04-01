public class Exercicio14 {
	public static void main(String[] args) {
		double salarioMin, quantKW, valorKW, valorAPagar, desconto, valorComDesc;
		
		System.out.println("\nEste programa realiza o calculo do valor a ser pago por energia em uma residencia, considerando que o valor do KW é igual a 1/5 do salario minimo.\n");
		
		System.out.print("Valor do salario minimo: ");
		salarioMin = Double.parseDouble(System.console().readLine());
		System.out.print("Quantidade de KW consumidas pela residencia: ");
		quantKW = Double.parseDouble(System.console().readLine());
		
		valorKW = salarioMin / 5;
		valorAPagar = valorKW * quantKW;
		desconto = valorAPagar * 15 / 100;
		valorComDesc = valorAPagar - desconto;
		
		System.out.printf("VALOR DO KW = R$ %.2f\n", valorKW);
		System.out.printf("VALOR A PAGAR = R$ %.2f\n", valorAPagar);
		System.out.printf("VALOR A PAGAR COM 15%% DE DESCONTO = R$ %.2f\n", valorComDesc);
	}
}