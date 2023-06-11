package tema7;

public class InsuficientFundsException extends Exception{
    public InsuficientFundsException(String mesaj) {
        super(mesaj);
        printStackTrace();
    }
}
