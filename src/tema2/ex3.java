package tema2;

import java.util.Scanner;

public class ex3 {
    int zi;
    public void interogareZi(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ce zi este azi?");
        zi = scan.nextInt();
    }
    public void comparareZi() {
        interogareZi();
        if(zi == 1) {
            System.out.println("Astazi este luni");
        }
        else if(zi == 2) {
            System.out.println("Astazi este marti");
        }
        else if(zi == 3) {
            System.out.println("Astazi este miercuri");
        }
        else if(zi == 4) {
            System.out.println("Astazi este joi");
        }
        else if(zi == 5) {
            System.out.println("Astazi este vineri");
        }
        else if(zi == 6) {
            System.out.println("Astazi este sambata");
        }
        else if(zi == 7) {
            System.out.println("Astazi este duminica");
        }
        else {
            System.out.println("Saptamana are doar 7 zile te rog sa introduci un numar valid");
        }
    }
}
