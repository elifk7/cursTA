package tema3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int punctaj;

        Scanner scan = new Scanner(System.in);
        System.out.println("Punctaj?");
        punctaj = scan.nextInt();

        int y = (punctaj>=90)?0:(punctaj>=80?1:2);
        switch (y)
        {
            case 0:
                System.out.println("Ai primit : FoarteBine");
                break;
            case 1:
                System.out.println("Ai primit : Bine");
                break;
            case 2:
                System.out.println("Ai primit : Suficient");
                break;
        }
    }
}