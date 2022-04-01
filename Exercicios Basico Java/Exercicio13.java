public class Exercicio13 {
	public static void main(String[] args) {
		double numHorasTrab, salMin, valHoraTrab, salBruto, imposto, salReceber;
		
		System.out.println("\nEste programa realiza o calculo do salario a receber por um funcionario que trabalha por hora, onde o valor da hora eh de 1/10 do salario minimo e este funcionario paga 3% de imposto.\n");
		
		System.out.print("Numero de horas trabalhadas: ");
		numHorasTrab = Double.parseDouble(System.console().readLine());
		System.out.print("Valor do salario minimo: ");
		salMin = Double.parseDouble(System.console().readLine());
		
		valHoraTrab = salMin / 10;
		salBruto = numHorasTrab * valHoraTrab;
		imposto = salBruto * 3 / 100;
		salReceber = salBruto - imposto;
		
		System.out.printf("SALARIO A RECEBER = R$ %.2f\n", salReceber);
	}
}