package Lecon2;
import java.util.Scanner;

public class Travaile5 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a message to encrypt:  ");
        String message = scanner.nextLine();

        String ecryptedMessage;

        char letter1 = message.charAt(0);

        ecryptedMessage = message.substring(1, message.length()) + letter1 + "\u00E9" + "\u0068";

        System.out.println("Encrypted message: " + ecryptedMessage);
        scanner.close();
    }
}
