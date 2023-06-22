package tema9;

import java.util.ArrayList;
import java.util.List;

public class arrayCompare {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> result = new ArrayList<>();

        list1.add("Product1");
        list1.add("Product2");
        list1.add("Product3");
        list1.add("Product4");
        list1.add("Product5");

        list2.add("Product1");
        list2.add("Product2");
        list2.add("Product6");
        list2.add("Product4");
        list2.add("Product8");

        for(int i = 0; i < list1.size(); i++){
            if( list1.get(i).equals(list2.get(i))){
                result.add("Yes");
            }
            else{
                result.add("No");
            }
        }
        System.out.println(result);
    }

}