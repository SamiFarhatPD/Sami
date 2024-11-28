import java.util.Scanner;

public class rectangle {

    private int b;
    private int h;

    rectangle() {
        this.b = 6;
        this.h = 6;
    }

    rectangle(int b, int h) {
        if (b <= 0) {
            System.out.println("La base ne peut pas etre egale a 0");
        } else {
            this.b = b;
        }
        if (h <= 0) {
            System.out.println("La hauteur ne peut pas etre egale a 0");
        } else {
            this.h = h;
        }
    }

    public int aire() {
        return b * h;
    }

    public int perimetre() {
        return (b * h) * 2;
    }

    public int getBase() {
        return b;
    }

    public void setBase(int b) {
        this.b = b;
    }

    public int getHauteur() {
        return h;
    }

    public void setHauteur(int h) {
        this.h = h;
    }

    public boolean equals(rectangle r) {

        if (r.getBase() == this.b && r.getHauteur() == this.h) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(rectangle r) {

        if (r.equals(this)) {
            return 0;
        } else if (r.aire() > this.aire()) {
            return -1;
        } else {
            return 1;
        }
    }

    public void sousRectangle() {
        // Method pour determiner le plus grand carre possible qui peut etre enleve de la surface du rectangle
        int gcd = pgcd(Math.abs(b), Math.abs(h));
        int sousRectangleBase = b / gcd;
        int sousRectangleHauteur = h / gcd;
        int dimensions = sousRectangleHauteur * sousRectangleBase;
        System.out.println("Les rest du sous rectangle est " + dimensions);
    }

    private int pgcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

    public String toString() {
        return "base=" + b + ", hauteur=" + h;
    }

    public boolean estCarree(rectangle r) {
        if (this.h == this.b) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        rectangle rect1 = new rectangle();
        System.out.println("Les dimensions de ton rectangle sont " + rect1);

        System.out.println("L'aire de ton rectangle est " + rect1.aire());

        System.out.println("La base est " + rect1.getBase());

        Scanner in = new Scanner(System.in);

        System.out.print("\nQuelle est la base du nouveau rectangle? ");
        int newBase = in.nextInt();
        in.nextLine();

        System.out.print("Quelle est la hauteur du nouveau rectangle? ");
        int newHauteur = in.nextInt();
        in.nextLine();

        rectangle rect2 = new rectangle(newBase, newHauteur);
        System.out.println("Les dimensions de ton nouveau rectangle sont " + rect2);
        System.out.println("L'aire de ton nouveau rectangle est " + rect2.aire());

        if (rect1.equals(rect2)) {
            System.out.println("\nLes deux rectangles sont égaux.");
        } else {
            System.out.println("Les deux rectangles ne sont pas égaux.");
        }
        
        // Verifier si le rectangle est un caree
        if (rect2.estCarree(rect2)) {
            System.out.println("Le rectangle est un carré.");
        } else {
            System.out.println("Le rectangle n'est pas un carré.");
        }

        // Sous rectangles 
        rect2.sousRectangle();

        System.out.print("\nInsère une base?");
        newBase = in.nextInt();
        in.nextLine();
        rect2.setBase(newBase);

        System.out.println("Les nouvelles dimensions de ton rectangle sont " + rect2);
    }  //fin méthode main
} //fin classe TestRectangle