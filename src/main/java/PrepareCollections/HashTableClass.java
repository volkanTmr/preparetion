package PrepareCollections;

import java.util.*;

public class HashTableClass {

    // çok sorualan soru hashmap ve table farkı
    // hashtable trade safe değil yani birden fazla kullanıcı bağlanamaz ama hashmap a bağlanabilir
    // null value veya key olamaz
    // hashmap iterator ile taranabilir , hashtable enumarator gerekli, gerisi aynı

    public static void main(String[] args) {

        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
        hm.put(0, "hello");
        hm.put(1, "goodbye");
        hm.put(42, "morning");
        hm.put(3, "evening");
        hm.put(5,"");
        System.out.println(hm.get(42));
        hm.remove(42);
        System.out.println(hm.get(42));
        Set sn = hm.entrySet();
        Iterator it = sn.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
         //   Map.Entry mp = (Map.Entry) it.next();
         //   System.out.println(mp.getKey());
         //   System.out.println(mp.getValue());

        Hashtable<String,String> ht=new Hashtable<>();
        ht.put("pencil","kalem");
        ht.put("go","git");
        ht.put("table","masa");
            System.out.println(ht.get("pencil"));
            ht.remove("pencil");
        }
    }
}