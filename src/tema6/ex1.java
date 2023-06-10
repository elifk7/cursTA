package tema6;

import java.util.Random;
import java.util.Scanner;

public class ex1 {
    public int length;

    public static void main(String[] args) {
        ex1 obj = new ex1();
        obj.reverseArrayFor(obj.generateArray());
        obj.reverseArrayWhile(obj.generateArray());
    }

    public int[] generateArray() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Cate elemente trebuie sa aiba array-ul?");
        length = scan.nextInt();

        int[] array = new int[length];
        int index = 0;
        while (index < length) {
            array[index] = random.nextInt(10);
            index++;
        }

        index = 0;
        while (index < length) {
            System.out.print(array[index] + "  ");
            index++;
        }
        return array;
    }
    public int[] reverseArrayFor(int[] array){
        int index;
        int[] rArray = new int[length];
        for(index = 0; index < length; index++) {
            rArray[index] = array[length-index-1];
        }

        index = 0;
        System.out.println(" ");
        while (index < length) {
            System.out.print(rArray[index] + "  ");
            index++;
        }
        System.out.println(" ");
        return rArray;
    }
    public int[] reverseArrayWhile(int[] array){
        int index = 0;
        int[] rArray = new int[length];
        while (index < length) {
            rArray[index] = array[length-index-1];
            index++;
        }

        index = 0;
        System.out.println(" ");
        while (index < length) {
            System.out.print(rArray[index] + "  ");
            index++;
        }
        System.out.println(" ");
        return rArray;
    }
}