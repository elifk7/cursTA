package tema5;

import java.util.Scanner;

public class exSwitch {
    public static void main(String[] args) {
        int anVechime;
        int valoareVanzari;
        int luna;

        Scanner scan = new Scanner(System.in);
        System.out.println("Anul de vechime in firma:");
        anVechime = scan.nextInt();
        System.out.println("Valoarea vanzarilor efectuate:");
        valoareVanzari = scan.nextInt();
        System.out.println("Luna in care a efectuat vanzarile:");
        luna = scan.nextInt();
        switch (anVechime) {
            case 1:
                System.out.println("Bonus: 100");
                break;
            case 2:
                System.out.println("Bonus: 200");
                break;
            case 3:
            {
                if(valoareVanzari <= 5000)
                    System.out.println("Bonus: 600");
                else if(valoareVanzari <= 10000 && luna >= 1 && luna <= 6)
                    System.out.println("Bonus: 800");
                else if(valoareVanzari <= 10000 && luna >= 7 && luna <= 11)
                    System.out.println("Bonus: 1000");
                else if(valoareVanzari <= 10000 && luna == 12)
                    System.out.println("Bonus: 900 \nIn decembrie se vand singure!");
                else if(valoareVanzari > 10000)
                    System.out.println("Bonus: 1200");
            }
        }
    }
}