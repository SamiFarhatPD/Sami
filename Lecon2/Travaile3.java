package Lecon2;
import java.util.Scanner;

public class Travaile3 {
    public static void main(String[] args) {
        // Demander un mot jusqu'à ce que l'utilisateur entre "fini"
        Scanner scanner = new Scanner(System.in);
        String word;
        int length = 0;
        // Boucler tant que l'utilisateur ne tape pas "fini"
        while (true) {
            System.out.println("Entrez un mot:");
            word = scanner.nextLine();
            length = word.length();
            if (word.equals("fini")) {
                break;
            }
            System.out.println("Longueur du mot: " + length);
        }
        scanner.close();
    }
}