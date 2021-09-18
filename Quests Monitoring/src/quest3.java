import java.util.Scanner;

public class quest3 {
    public static void main(String[] args) {

        int n;
        int total = 0;
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < 3; i = i + 1) {
            System.out.println("Digite N" + (i + 1) + ":");
            n = leitor.nextInt();
            total = total + n;
        }
        System.out.println("A média é : " + total / 3.0);
        leitor.close();
    }
}