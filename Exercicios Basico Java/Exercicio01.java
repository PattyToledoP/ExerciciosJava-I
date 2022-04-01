public class Exercicio01 {
	public static void main(String[] args) {
		int num1, num2, subtr;
		
		// A linha abaixo mostra apenas uma mensagem para que o usuário saiba do que o programa se trata.
		// Lembre-se que \n indica uma quebra de linha. Abaixo é utilizado para incluir duas linhas em branco, 
		// uma antes e outra depois do texto mostrado.
		System.out.println("\nEste programa realiza a subtracao de um numero por outro.\n");
		
		System.out.print("Digite o primeiro numero.: ");
		num1 = Integer.parseInt(System.console().readLine());
		
		System.out.print("Digite o segundo numero..: ");
		num2 = Integer.parseInt(System.console().readLine());
		
		subtr = num1 - num2;
		
		System.out.printf("RESULTADO = %d\n", subtr);
	}
}