import java.util.Scanner;

public class quest5 {

    public static void main(String[] args) {

        int n = 0;
        int maior = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite n: ");
        n = leitor.nextInt();

        while (n != 0) {
            if (n > maior){
                System.out.println( n + " é maior que " + maior);
                maior = n;
            }
            else{
            System.out.println( n + " é menor que " + maior);
            }
            System.out.println("Digite N: ");
            n = leitor.nextInt();
        }
        leitor.close();
    }
}