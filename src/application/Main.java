package application;

import java.util.Locale;
import java.util.Scanner;

import util.Conversao;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double dolar,tax;
		
		System.out.print("What is the dollar price? ");
		tax = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		dolar = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f",Conversao.conv(dolar,tax));
		sc.close();
	}

}
