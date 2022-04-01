public class Exercicio02 {
	public static void main(String[] args) {
		double num1, num2, divisao;
		
		System.out.println("\nEste programa realiza a divisao de dois numeros.\n");
		
		System.out.print("Digite o primeiro numero.: ");
		num1 = Double.parseDouble(System.console().readLine());
		
		System.out.print("Digite o segundo numero..: ");
		num2 = Double.parseDouble(System.console().readLine());
		
		divisao = num1 / num2;
		
		System.out.printf("RESULTADO = %f\n", divisao);
	}
}