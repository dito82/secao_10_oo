package application;

import java.util.Locale;
import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o tamanho do vetor: ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Altura " + i + " : ");
			vect[i] = sc.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}

		double avg = sum / n;
		System.out.printf("AVERAGE : %.2f%n", avg);
		sc.close();

	}

}
