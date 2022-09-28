package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AlturaPessoa;

public class Vector02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o tamanho do vetor: ");
		int n = sc.nextInt();
		AlturaPessoa[] vect = new AlturaPessoa[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Nome " + i + " : ");
			String nome = sc.nextLine();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new AlturaPessoa(nome, altura);
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i].getAltura();
		}

		double avg = sum / n;
		System.out.printf("AVERAGE : %.2f%n", avg);
		sc.close();

	}
}