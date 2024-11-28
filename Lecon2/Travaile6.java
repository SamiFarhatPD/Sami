package Lecon2;
import java.util.Scanner;

public class Travaile6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une phrase: ");
        String sentence = scanner.nextLine();

        String message = sentence.replaceAll(" ", "");

        char letterchoisi = message.toCharArray()[(int) (Math.random() * message.length())];

        System.out.println("La lettre choisie au hasard est : " + letterchoisi);
        scanner.close();
    }
}
