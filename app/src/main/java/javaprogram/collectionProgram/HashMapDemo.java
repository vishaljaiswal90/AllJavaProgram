
package javaprogram.collectionProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String [] args){
        HashMap map= new HashMap();
        map.put("v","vishal");
        map.put("v","vishl");
        map.put("s","sapna");
        map.put("v","vikas");
        map.put(null,null);
        map.put(null,"akash");
        map.put("sp","sapan");
        map.put("p","parmu");
        map.put("1",null);
        map.put("2",null);
        System.out.println(map);

        Set s= map.entrySet();
        Iterator iterator = s.iterator();



        while (iterator.hasNext()){
            Map.Entry mapEntry = (Map.Entry)iterator.next();

            System.out.println(mapEntry.getKey() +"  "+ mapEntry.getValue());
        }
    }
}
