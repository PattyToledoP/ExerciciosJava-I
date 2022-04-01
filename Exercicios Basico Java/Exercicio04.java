public class Exercicio04 {
	public static void main(String[] args) {
		double preco, desconto, novoPreco;
		
		System.out.println("\nEste programa realiza o calculo do preco de um produto com desconto de 10%.\n");
		
		System.out.print("Digite o preco do produto: ");
		preco = Double.parseDouble(System.console().readLine());
				
		desconto  = preco * 10 / 100;
		novoPreco = preco - desconto;
		
		System.out.printf("NOVO PRECO = R$ %.2f\n", novoPreco);
	}
}