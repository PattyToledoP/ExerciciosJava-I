public class Exercicio11 {
	public static void main(String[] args) {
		int anoNasc, anoAtual, idadeAnos, idadeMeses, idadeDias, idadeSemanas;
		
		System.out.println("\nEste programa realiza o calculo da idade atual de uma pessoa em anos, meses, dias e semanas.\n");
		
		System.out.print("Digite o ano de nascimento da pessoa: ");
		anoNasc = Integer.parseInt(System.console().readLine());
		System.out.print("Digite o ano atual: ");
		anoAtual = Integer.parseInt(System.console().readLine());
		
		idadeAnos = anoAtual - anoNasc;
		idadeMeses = idadeAnos * 12;
		idadeDias = idadeAnos * 365;
		idadeSemanas = idadeAnos * 52;
		
		System.out.printf("IDADE EM ANOS = %d\n", idadeAnos);
		System.out.printf("IDADE EM MESES = %d\n", idadeMeses);
		System.out.printf("IDADE EM DIAS = %d\n", idadeDias);
		System.out.printf("IDADE EM SEMANAS = %d\n", idadeSemanas);
	}
}