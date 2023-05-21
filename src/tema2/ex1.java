package tema2;

import java.util.Scanner;

public class ex1 {
    int varsta;
    public void interogareVarsta(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ce varsta aveti?");
        varsta = scan.nextInt();
    }
    public void comparareVarsta() {
        interogareVarsta();
        if(varsta < 18) {
            System.out.println("Esti minor");
        }
        else if(varsta >= 18 && varsta <= 65) {
            System.out.println("Esti adult");
        }
        else if(varsta > 65) {
            System.out.println("Esti batran");
        }
    }
}
