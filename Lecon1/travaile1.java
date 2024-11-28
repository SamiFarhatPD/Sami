import java.util.Scanner;


public class travaile1 {
    public static void main(String[] args) {
        int anneeActuelle = 2024;
        int jourActuel = 24;
        int moisActuel = 9;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre année de naissance: ");
        int anneeNaissance = scanner.nextInt();

       
        System.out.println("Entrez votre mois de naissance: ");
        int moisNaissance = scanner.nextInt();

        System.out.println("Entrez votre jour de naissance: ");
        int jourNaissance = scanner.nextInt();

        scanner.close();

        int age = anneeActuelle - anneeNaissance;
        int moisRestants = moisActuel - moisNaissance;
        int joursRestants = jourActuel - jourNaissance;

        int totalJours = age * 365 + moisRestants * 30 + joursRestants;
        int heureDormis = (totalJours * 8);

        System.out.println("Votre age actuele est : " + totalJours + " jours");
        System.out.println("Votre heure de sommeil actuelle est : " + heureDormis + " heures");
         
    }
}