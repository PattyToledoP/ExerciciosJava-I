public class Exercicio07 {
	public static void main(String[] args) {
		double n1, n2, n3, p1, p2, p3, media;
		
		System.out.println("\nEste programa realiza o calculo da media ponderada de tres notas de um estudante.\n");
		
		System.out.print("Digite a primeira nota do estudante.: ");
		n1 = Double.parseDouble(System.console().readLine());
		System.out.print("Digite a segunda nota do estudante..: ");
		n2 = Double.parseDouble(System.console().readLine());
		System.out.print("Digite a terceira nota do estudante.: ");
		n3 = Double.parseDouble(System.console().readLine());
		
		System.out.print("Digite o peso da primeira nota.: ");
		p1 = Double.parseDouble(System.console().readLine());
		System.out.print("Digite o peso da segunda nota..: ");
		p2 = Double.parseDouble(System.console().readLine());
		System.out.print("Digite o peso da terceira nota.: ");
		p3 = Double.parseDouble(System.console().readLine());
				
		media = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);
		
		System.out.printf("MEDIA = %.1f\n", media);
	}
}