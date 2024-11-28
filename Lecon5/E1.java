package Lecon5;

public class E1 {
    public static void main(String [] args) {
        season(3);
        season(4);
        season(6);
        season(9);
        season(10);


    }
    public static void season(int season) {
        switch (season) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
            case 9: 
                System.out.println("Fall");
            case 10:
                System.out.println("Fall");
                break;
            case 11:
                System.out.println("Fall");
                break;
            case 12:
                System.out.println("Winter");
            default:
            break;
            
        }
    }
}
