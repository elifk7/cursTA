package tema3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int factura;
        int discount;

        Scanner scan = new Scanner(System.in);
        System.out.println("Care este valoarea facturii dumneavoastra? ");
        factura = scan.nextInt();

        discount = (factura>=100)?10:5;
        System.out.println("Discountul dvs este: " + discount + "%");
    }
}
