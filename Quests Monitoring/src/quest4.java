import java.util.Scanner;

public class quest4 {

    public static void main(String[] args) {

        int eleitores = 0;
        int nVotosBrancos = 0;
        int nVotosNulos = 0;
        int nVotosValidos = 0;
        

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o n�mero de eleitores: ");
        eleitores = leitor.nextInt();

        System.out.println("Digite o n�mero de votos em Branco: ");
        nVotosBrancos = leitor.nextInt();

        System.out.println("Digite o n�mero de votos Nulos: ");
        nVotosNulos = leitor.nextInt();

        System.out.println("Digite o n�mero de votos V�lidos: ");
        nVotosValidos = leitor.nextInt();
       
        System.out.println("% de votos em Brancos: ~" + ((nVotosBrancos * 100)/eleitores) + " % ");
        System.out.println("% de votos Nulos: ~" + ((nVotosNulos * 100)/eleitores) + " % ");
        System.out.println("% de votos V�lidos: ~" + ((nVotosValidos * 100)/eleitores) + " % ");

        leitor.close();
    }

}