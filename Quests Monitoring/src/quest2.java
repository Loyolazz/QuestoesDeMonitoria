import java.util.Scanner;

public class quest2 {
    public static void main(String[] args) {
        
        int n;
		Scanner leitor = new Scanner(System.in);
		for (int i = 0; i < 3; i = i + 1) {
			System.out.println("Digite N" + (i + 1) + ":");

			n = leitor.nextInt();
			if (n >= 10 && n <= 20 ) {
                System.out.println("O número: " + n + " está no intervalo.");
			}
            else {
                System.out.println("O número: " + n + " não está no intervalo.");
            }
		}
		leitor.close();
    }
}