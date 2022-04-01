public class Exercicio08 {
	public static void main(String[] args) {
		double base, altura, area;
		
		System.out.println("\nEste programa realiza o calculo da area de um triangulo.\n");
		
		System.out.print("Digite a medida da base do triangulo: ");
		base = Double.parseDouble(System.console().readLine());
		System.out.print("Digite a medida da altura do triangulo: ");
		altura = Double.parseDouble(System.console().readLine());
		
		area = (base * altura) / 2;
		
		System.out.printf("AREA = %f\n", area);
	}
}