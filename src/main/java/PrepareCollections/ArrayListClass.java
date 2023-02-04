package PrepareCollections;

import java.util.ArrayList;

public class ArrayListClass {

    // tekrarı kabul eder ArrayList,LinkedList,vector hepsi kabul eder
    // array sabittir artmaz azalmaz ama ArrayList dinamiktir sil ekle
    // tüm indexlere erişebilirsin value ya değiştirebilirsin

    public static void main(String[] args) {

        ArrayList<String> arl=new ArrayList<String>();
        arl.add("java");
        arl.add("kursu");
        arl.add("java");
        System.out.println(arl);
        arl.add(0,"student");
        System.out.println(arl);
        //arl.remove(1);
        System.out.println(arl);
        System.out.println(arl.get(2));
        System.out.println(arl.contains("java"));
        System.out.println(arl.indexOf("kursu"));
        System.out.println(arl.size());
        System.out.println(arl.isEmpty());

    }
}
