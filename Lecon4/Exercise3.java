package Lecon4;

public class Exercise3 {
    public static void main(String[] args) {
        String [] [] tableau = {
            {"Eleve       ", "Quiz 1","Test 1","Quiz 2","Test 2","Note Finale"},
            {"Julie Uno   ", "67    ", "89   ", "56   ", "78   ", ""},
            {"Martin Dos  ", "89    ", "90   ", "90   ", "72   ", ""},
            {"Henri Tres  ", "55    ", "45   ", "68   ", "90   ", ""},
            {"Lucie Cuatro", "100   ", "34   ", "77   ", "80   ", ""}, 
        };

        int moyenneUno = (67+89+56+78)/4;
        int moyenneDos = (89+90+90+72)/4;
        int moyenneTres = (55+45+68+90)/4;
        int moyenneCuatro = (100+34+77+80)/4;

        String uno = Integer.toString(moyenneCuatro);
        String dos = Integer.toString(moyenneDos);
        String tres = Integer.toString(moyenneTres);
        String cuatro = Integer.toString(moyenneUno);

        tableau [1] [5] = uno;
        tableau [2] [5] = dos;
        tableau [3] [5] = tres;
        tableau [4] [5] = cuatro;
        
        for (String [] tab : tableau) {
            for (String s: tab) {
                System.out.print(s + "\t");
            }
            System.out.println("\n");
        }
    }
}
