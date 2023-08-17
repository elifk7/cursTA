package tema10;

import java.util.Arrays;

public class ex2 {

    public static void main(String[] args) {

        String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
        Integer[] intArray = {100, 500, 300, 400, 200};
        Character[] charArray = {'a', 'b', 'd', 'c'};

        System.out.println(Arrays.toString(textArray));
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(charArray));

        sortArray(textArray, intArray, charArray);

        System.out.println(Arrays.toString(textArray));
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(charArray));


    }

    public static void sortArray(String[] textArray, Integer[] intArray, Character[] charArray) {
        Arrays.sort(textArray);
        Arrays.sort(intArray);
        Arrays.sort(charArray);
    }
}