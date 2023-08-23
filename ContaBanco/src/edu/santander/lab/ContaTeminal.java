package edu.santander.lab;
import java.util.Scanner;

public class ContaTeminal {
	
	public static void main (String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		Integer numero;
		String agencia;
		String nomeCliente;
		Double saldo;
		
		System.out.println("Por favor, digite seu numero da conta: \n Ex: 1021 \n ");
		numero = s.nextInt();
		
		System.out.println("Por favor, digite a agencia de sua conta: \n Ex: 067-8 \n ");
		agencia = s.next();
		
		System.out.println("Por favor, digite seu nome: \n Ex: Caio \n ");
		nomeCliente = s.next();
		
		System.out.println("Por favor, digite seu saldo: \n Ex: 200,10 ,com virgula \n");
		saldo = s.nextDouble();
		
		s.close();
		
		System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", e conta " + numero + " . Seu saldo de R$ " + saldo + " ,ja esta disponivel para saque.");
		
		
		
		
		
		
		
		
		
		
	}

}
