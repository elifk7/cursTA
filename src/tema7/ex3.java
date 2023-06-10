package tema7;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("FOR (1) sau WHILE (2)?");
        int choice = scan.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Caz FOR. Introduceti 10 numere: ");

                int length = 10;
                int index = 0;
                int[] array = new int[length];

                for (index = 0; index < length; index++) {
                    array[index] = scan.nextInt();
                }

                System.out.println("Numerele pare: ");
                for (index = 0; index < length; index++) {
                    if (array[index] % 2 == 0)
                        System.out.println(array[index]);
                }
            }
            break;
            case 2: {
                System.out.println("Caz WHILE. Introduceti 10 numere: ");

                int length = 10;
                int index = 0;
                int[] array = new int[length];

                while(index < length) {
                    array[index] = scan.nextInt();
                    index++;
                }

                System.out.println("Numerele pare: ");
                index = 0;
                while(index < length) {
                    if (array[index] % 2 == 0)
                        System.out.println(array[index]);
                    index++;
                }

            }
            break;
        }
    }
}