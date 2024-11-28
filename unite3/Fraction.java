
import java.util.Scanner;

public class Fraction {

    // Attributs
    private int num;
    private int denom;

    // Constructeur
    Fraction(int num, int denom) {
        this.num = num;
        this.denom = denom;
        simplifie(); // simplifie automatiquement la fraction
    }

    // Methode pour obtenir le numerateur
    public int getNum() {
        return num;
    }

    // Methode pour definir le numerateur
    public void setNum(int num) {
        this.num = num;
        simplifie(); // simplifie apres modification
    }

    // Methode pour obtenir le denominateur
    public int getDenom() {
        return denom;
    }

    // Methode pour definir le denominateur
    public void setDenom(int denom) {
        this.denom = denom;
        simplifie(); // simplifie apres modification
    }

    // Methode pour simplifier la fraction
    private void simplifie() {
        int gcd = pgcd(Math.abs(num), Math.abs(denom));
        num /= gcd;
        denom /= gcd;
        // Assure que le denominateur est positif
        if (denom < 0) {
            num = -num;
            denom = -denom;
        }
    }

    // Calcul du plus grand commun diviseur (PGCD) https://www.mycompiler.io/view/5dgzbtBSAwu
    private int pgcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Methode toString pour afficher la fraction
    public String toString() {
        if (denom == 1) {
            return "Fraction = " + num;
        } else {
            return "Fraction = " + num + "/" + denom;
        }
    }

    // Methode pour additionner deux fractions
    public Fraction additionne(Fraction f) {
        int numA = this.num * f.denom + f.num * this.denom;
        int denomA = this.denom * f.denom;
        return new Fraction(numA, denomA);
    }

    // Methode pour soustraire deux fractions
    public Fraction soustrais(Fraction f) {
        int numS = this.num * f.denom - f.num * this.denom;
        int denomS = this.denom * f.denom;
        return new Fraction(numS, denomS);
    }

    // Methode pour multiplier deux fractions
    public Fraction multiplie(Fraction f) {
        int numM = this.num * f.num;
        int denomM = this.denom * f.denom;
        return new Fraction(numM, denomM);
    }

    // Methode pour diviser deux fractions
    public Fraction divise(Fraction f) {
        int numD = this.num * f.denom;
        int denomD = this.denom * f.num;
        return new Fraction(numD, denomD);
    }

    // Methode pour comparer deux fractions
    // Retourne 1 si this > f, -1 si this < f, et 0 si elles sont egales
    public int compare(Fraction f) {
        int diff = this.num * f.denom - f.num * this.denom;
        if (diff > 0) {
            return 1; 
        }else if (diff < 0) {
            return -1; 
        }else {
            return 0;
        }
    }

    // Methode main pour tester toutes les methodes
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande pour la premiere fraction
        System.out.print("Entrez le numerateur de la premiere fraction: ");
        int num1 = scanner.nextInt();
        System.out.print("Entrez le denominateur de la premiere fraction: ");
        int denom1 = scanner.nextInt();
        Fraction f1 = new Fraction(num1, denom1);

        // Demande pour la deuxieme fraction
        System.out.print("Entrez le numerateur de la deuxieme fraction: ");
        int num2 = scanner.nextInt();
        System.out.print("Entrez le denominateur de la deuxieme fraction: ");
        int denom2 = scanner.nextInt();
        Fraction f2 = new Fraction(num2, denom2);

        // Affichage des fractions et des resultats des operations
        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);

        System.out.println("Addition: " + f1.additionne(f2));
        System.out.println("Soustraction: " + f1.soustrais(f2));
        System.out.println("Multiplication: " + f1.multiplie(f2));
        System.out.println("Division: " + f1.divise(f2));

        int comparaison = f1.compare(f2);
        if (comparaison > 0) {
            System.out.println("f1 est plus grand que f2"); 
        }else if (comparaison < 0) {
            System.out.println("f1 est plus petit que f2"); 
        }else {
            System.out.println("f1 est egal a f2");
        }

        scanner.close();
    }
}
