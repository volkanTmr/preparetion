package Preparetion1;

public class TryCatchException {

    public static void main(String[] args) {

        int a =5;
        int b =0;

    try {
        int k = a / b;
        System.out.println(k);

    }catch (ArithmeticException et){
        System.out.println(" l catched Aritmetic ");
    }
    catch (Exception e){

        System.out.println("I catched exception ");
    }

    finally {
        System.out.println(" l will execute fianlly ");
    }
    }
}
