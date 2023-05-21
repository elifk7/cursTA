package tema2;

import java.util.Scanner;

public class ex2 {
    int punctaj;
    public void interogarePunctaj(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ce zi aveti?");
        punctaj = scan.nextInt();
    }
    public void compararePunctaj() {
        interogarePunctaj();
        if(punctaj >=0 && punctaj <= 65) {
            System.out.println("Ai picat. Mai incearca");
        }
        else if(punctaj >= 66) {
            System.out.println("Felicitari, Ai trecut");
        }
    }
}
