package tema3;

public class ex2 {
    public static void main(String[] args) {
        int comision = 0 ;
        int vanzari = 3500;

       if(vanzari > 2500){
           comision = vanzari * 5/100;
       }
       else comision = 0;
       System.out.println("Comisionul tau este: " + comision);
    }
}
