package br.com.bansen.menu.inicial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeiroMenu {

	public static void main(String[] args) {

		int operacaoInicial = 0;

		try {
			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\n*******************************");
			System.out.println("\n   BANSEN - Agência Bancária\n");
			System.out.println("*******************************");
			System.out.println();
			System.out.println("1) Criação e população do banco de dados");
			System.out.println("2) Acessar conta");
			System.out.println("3) Sair do sistema");
			operacaoInicial = Integer.parseInt(teclado.readLine());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		do {
			switch (operacaoInicial) {
			case 1:
				System.out.println("Criar e popular banco de dados automaticamente");
				break;
			case 2:
				System.out.println("logando na conta...");
				break;
			case 3:
				System.out.println("Saindo do sistema... Volte sempre!");
				break;
			default:
				break;
			}
		} while (operacaoInicial != 3);
	}
}
