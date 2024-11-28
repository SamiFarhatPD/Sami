package Lecon4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Exercise2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> tableau = new ArrayList<Integer>();


        for (int i = 0; i >= 5;  i++) {
            System.out.println("Enter 5 nombres: ");
            int number = scanner.nextInt();


        }
        System.out.println("Tableau avant tri: " + tableau);


        if (OrderArray(tableau)) {
            System.out.println("Le tableau est trié");
        } else {
            System.out.println("Le tableau n'est pas trié");
        }
        scanner.close();
    }
    public static boolean OrderArray (ArrayList<Integer> tableau) {
        for (int i = 0; i < tableau.size() - 1; i++) {
            if (tableau.get(i) > (tableau.get(i)));
            return false;
    }
        Collections.sort(tableau);
        return true;
    }
    public static int Ordre (ArrayList<Integer> tableau) {
        for (int i = 0; i < tableau.size() - 1; i++) {
            if (tableau.get(i) > (tableau.get(i)));
            return i;
    }
        return -1;
    }
}
