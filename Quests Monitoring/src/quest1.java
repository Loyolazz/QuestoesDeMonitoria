import java.util.Scanner;

public class quest1 {

	public static void main(String[] args) {

		int n;
		int maior = 0;
		Scanner leitor = new Scanner(System.in);
		for (int i = 0; i < 10; i = i + 1) {
			System.out.println("Digite N" + (i + 1) + ":");

			n = leitor.nextInt();
			if (n > maior) {
				maior = n;
			}

		}
		leitor.close();
		System.out.println("Maior:" + maior);
	}
}