package Preparetion1;

public class FirstClass {

    int a =4 ;
    int b =5 ;

    public void getData(){

        System.out.println("I am in method" );
    }

    public static void main(String[] args) {

        FirstClass fc = new FirstClass();
        SecondClass sc = new SecondClass();
        sc.setData();
        fc.getData();
        System.out.println(fc.a);
        System.out.println("ali gel");
    }
}
