package Lecon2;
import java.util.Scanner;

public class Travaile4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entrez une phrase: ");
        String phrase = input.nextLine();

        int gamme1;
        int gamme2;

        while (true) {

        System.out.println("Entrez gamme1: ");
        gamme1 = input.nextInt();

        System.out.println("Entrez gamme2: ");
        gamme2 = input.nextInt();
        if (gamme1 <= gamme2 && gamme1>0 && gamme2<=phrase.length() ) {
            break;
        }else {
            System.out.println("Erreur: gamme incorrecte.");
            continue;
        }

        }
        System.out.println(phrase.substring(gamme1-1, gamme2));
        input.close();

    }
}
