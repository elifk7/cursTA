package tema4;

public class ex2 {
    int val = 9;
    int nr1;
    int nr2;

    public void fibonacciFor(){
        nr1 = 0;
        nr2 = 1;
        System.out.println("Seria Fibonacci pentru " + val + " numere:");
        for(int i = 0; i < val; i++) {
            System.out.println(nr1);
            int urmNr = nr1 + nr2;
            nr1 = nr2;
            nr2 = urmNr;
        }
    }
    public void fibonacciWhile(){
        nr1 = 0;
        nr2 = 1;
        System.out.println("Seria Fibonacci pentru " + val + " numere:");
        int i = 0;
        while(i < val) {
            System.out.println(nr1);
            int urmNr = nr1 + nr2;
            nr1 = nr2;
            nr2 = urmNr;
            i++;
        }
    }
    public static void main(String[] args) {
        ex2 obj = new ex2();
        obj.fibonacciFor();
        obj.fibonacciWhile();
    }
}
