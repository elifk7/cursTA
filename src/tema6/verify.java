package tema6;

import java.util.Scanner;

public class verify {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Course: ");
        String curs = scan.nextLine();

        System.out.println("ExperienceYears: ");
        int experienta = scan.nextInt();

        scan.nextLine();

        System.out.println("Schedule: ");
        String program = scan.nextLine();

        Qualification qualify = new Qualification(curs, experienta, program);

        qualify.verify();
    }
}
