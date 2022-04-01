public class Exercicio09 {
	public static void main(String[] args) {
		double lado, area;
		
		System.out.println("\nEste programa realiza o calculo da area de um quadrado.\n");
		
		System.out.print("Digite a medida do lado do quadrado: ");
		lado = Double.parseDouble(System.console().readLine());
		
		area = lado * lado;
		
		System.out.printf("AREA = %f\n", area);
	}
}