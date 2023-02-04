package Preparetion1;

public class Instances {

    String name; // instance variable
    String address;
    static String city ;  // class variable , objeden bağımsızdır
    static int i;
    static{

        city="Çorum";
        i=0;
    }

    Instances(String name, String address){

        this.name= name;
        this.address= address;
        i++;
        System.out.println(i);

    }
    public void getAddress(){

        System.out.println(address+" "+city);
    }

    public static void getCity(){

        // static method sadece statik variable kabul eder

        System.out.println(city);
    }

    public static void main(String[] args) {

        Instances ins= new Instances("kamil","merter");
        Instances ins2= new Instances("roni","merter");
        Instances ins3= new Instances("roni","merter");
        ins.getAddress();
        ins2.getAddress();
        Instances.getCity();
        Instances.i=4; // constructer yardımı ile değer verebiliriz
        ins.address="Trabzon";
    }
}
