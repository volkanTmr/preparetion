package PrepInheritance;

public class Overloading {

    public void getData(String a){

        System.out.println(a);

    }

    public void getData(int a){

        System.out.println(a);

    }

    public void getData(int a,int b){

        System.out.println(a+b);

    }

    public static void main(String[] args) {

        Overloading ol= new Overloading();
        ol.getData(2);
        ol.getData("red");
        ol.getData(259,626);

    }
}
