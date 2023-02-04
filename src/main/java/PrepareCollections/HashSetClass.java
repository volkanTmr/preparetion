package PrepareCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass<S> {

    public static void main(String[] args) {

        // hashset,treeset,linkedhashset en çok hashset kullanılır
        // tekarr kabul etmez
        // sıra yoktur , karma depolar

        HashSet<String> hs= new HashSet<>();
        hs.add("USA");
        hs.add("GERMANY");
        hs.add("UK");
        hs.add("TURKEY");
        hs.add("TURKEY");
        System.out.println(hs);
        System.out.println(hs.remove("UK"));
        System.out.println(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());

        Iterator<String> i = hs.iterator();
       /* System.out.println(i.next());
        System.out.println(i.next()); */

        while(i.hasNext()){

            System.out.println(i.next());
        }

    }
}
