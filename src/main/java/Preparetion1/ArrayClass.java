package Preparetion1;

public class ArrayClass {

    public static void main(String[] args) {

        int a[] = new int[5];
        a[0]= 2;
        a[1]=6;
        a[2]=1;
        a[3]=9;
        a[4]=12;

        int b[] ={9,8,7,6};
        for (int j : a) {
            System.out.println(j);
        }

    }
}
