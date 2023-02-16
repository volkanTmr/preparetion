package Preparetion1;

public class Constractor {

    // object ürettiğinde constructer method otomatik harekete geçer , parametreli olabilir

    public Constractor(){

        System.out.println(" I am constructor ");
    }

    public Constractor(boolean a){
        System.out.println("mfhmf"+a);

    }

    public Constractor(int a,int b){

        System.out.println(" I am paramatrised constr  "+ (a+b));
    }

    public Constractor(String d){

        System.out.println(" I am constructor " + d );
    }

    public void getData(){

        System.out.println(" data alırım ");

    }

    public static void main(String[] args) {

        Constractor con = new Constractor();
        Constractor cons = new Constractor(3,5);
        Constractor co = new Constractor("constrrumm");
    }
}
