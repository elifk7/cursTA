package tema3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma = 0;

        for(int i = 1; i<=10; i++) {
            System.out.println("Please enter number " + i + ": ");
            int number = scan.nextInt();
            suma += number;
        }
        System.out.println("The sum of numbers is: " + suma);
    }
}
