package tema4;

import java.util.Scanner;

public class ex1 {
    String user;
    int password;
    Scanner scan  =  new Scanner(System.in);

    public void getUsername() {
        System.out.println("Enter a user:");
        user = scan.next();
    }

    public void getPassword() {
        System.out.println("Enter a password:");
        password = scan.nextInt();
    }

    public void checkUserPass() {
        int i = 0;
        do {
            boolean valid = true;
            getUsername();
            getPassword();
            if(!user.equals("TestUser")) {
                valid = false;
            }
            if(password != 1234) {
                valid = false;
            }
            if(valid == true) {
                System.out.println("Login Successful");
                break;
            }
            i++;
            System.out.println("Login Error");
        } while (i < 3);
        if(i == 3) {
            System.out.println("Maximum attempts reached. User blocked");
        }
    }

    public static void main(String[] args) {
        ex1 obj = new ex1();
        obj.checkUserPass();
    }

}