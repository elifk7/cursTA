package tema9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Catalog {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<String, Double> catalogul;

        catalogul = new HashMap<>();

            catalogul.put("Alina", 9.5);
            catalogul.put("Mihnea", 7.0);
            catalogul.put("Robert", 10.0);
            catalogul.put("Andra", 6.3);
            catalogul.put("Maria", 8.4);
            catalogul.put("Catalin", 4.0);


        System.out.println("Nume elev:");
        String nume = scan.nextLine();
        System.out.println("Nota elev:");
        Double nota = scan.nextDouble();

        if(catalogul.containsKey(nume)) {
            for (Map.Entry<String, Double> entry : catalogul.entrySet()) {
                if (entry.getKey().equals(nume)) {
                    if (entry.getValue().equals(nota) || entry.getValue() > nota) {
                        System.out.println("Nu ai nevoie de alta nota");
                        System.out.println("Catalog:");
                        System.out.println(catalogul);
                    } else if (entry.getValue() < nota) {
                        catalogul.put(nume, nota);
                        System.out.println("Update nota");
                        System.out.println("Catalog:");
                        System.out.println(catalogul);
                    }
                }
            }
        }
        else {
            catalogul.put(nume, nota);
            System.out.println("Nu aveai nota, ti-am trecut acum!");
            System.out.println("Catalog:");
            System.out.println(catalogul);
        }
    }
}