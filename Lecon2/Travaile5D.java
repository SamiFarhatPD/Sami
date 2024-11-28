package Lecon2;
import java.util.Scanner;

public class Travaile5D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the message to decrypt: ");
        String message = scanner.nextLine();
        String decryptedMessage;


        char letter1 = message.charAt(message.length() - 3);

        decryptedMessage = letter1+message.substring(0, message.length() - 3);

        System.out.println("Decrypted message: " + decryptedMessage);
        scanner.close();

    }
}
