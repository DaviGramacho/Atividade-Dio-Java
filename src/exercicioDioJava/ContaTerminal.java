package exercicioDioJava;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		String nomeUsuario, numeroAgencia;
		int numeroConta;
		double saldoConta;
		
		System.out.println("Por favor, digite o seu nome !");
		nomeUsuario = sc.next();
		
		System.out.println("Por favor, digite o número da Agência !");
		numeroAgencia = sc.next();
		
		System.out.println("Por favor, digite o número da Conta !");
		numeroConta = sc.nextInt();
		
		System.out.println("Por favor, digite o seu saldo em conta !");
		saldoConta = sc.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeUsuario, numeroAgencia, numeroConta, saldoConta );
	}
}
