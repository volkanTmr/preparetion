package PrepareCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapClass { // hashmap i set e çevir elemanları bas

    public static void main(String[] args) {


        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(0,"hello");
        hm.put(1,"goodbye");
        hm.put(42,"morning");
        hm.put(3,"evening");
        hm.put(4,null);

        HashMap<String,String> klm=new HashMap<>();
        klm.put("pencil","kalem");
        System.out.println(klm.get("pencil"));

        System.out.println(hm.get(42));
        hm.remove(42);
        System.out.println(hm.get(42));
        Set sn=hm.entrySet();
        Iterator it=sn.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
         //   Map.Entry mp=(Map.Entry) it.next();
         //   System.out.println(mp.getKey());
         //   System.out.println(mp.getValue());

        }

    }
}
