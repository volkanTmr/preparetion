package Preparetion1;

public class This {

    int a = 5;

    // this global yani class bazındaki değişkenlere refere eder

    public void getData(){

        int a = 9;

        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {

        This th= new This();
        th.getData();
    }
}
