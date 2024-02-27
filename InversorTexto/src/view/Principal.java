package view;

import controller.InversorTexto;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args)
	{
		String original, invertido;
		InversorTexto it = new InversorTexto();
		Scanner s = new Scanner(System.in);

		System.out.println("Escreva um texto para inverter: ");
		original = s.nextLine();
		s.close();
		invertido = it.inverteTexto(original);
		System.out.println("O texto invertido é:\n" + invertido);
	}
}