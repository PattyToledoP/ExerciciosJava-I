public class Exercicio12 {
	public static void main(String[] args) {
		double precoFabr, percLucro, percImp, lucroDistr, valorImp, precoFinal;
		
		System.out.println("\nEste programa realiza o calculo do preco final de um produto, baseado em seu preco de fabricacao, percentual de lucro do distribuidor e percentual de impostos.\n");
		
		System.out.print("Digite o preco de fabricacao do produto: ");
		precoFabr = Double.parseDouble(System.console().readLine());
		System.out.print("Digite o percentual de lucro do distribuidor: ");
		percLucro = Double.parseDouble(System.console().readLine());
		System.out.print("Digite o percentual de impostos do produto: ");
		percImp = Double.parseDouble(System.console().readLine());
		
		lucroDistr = precoFabr * percLucro / 100;
		valorImp = precoFabr * percImp / 100;
		precoFinal = precoFabr + lucroDistr + valorImp;
		
		System.out.printf("LUCRO DO DISTRIBUIDOR = R$ %.2f\n", lucroDistr);
		System.out.printf("VALOR EM IMPOSTOS = R$ %.2f\n", valorImp);
		System.out.printf("PRECO FINAL = R$ %.2f\n", precoFinal);
	}
}