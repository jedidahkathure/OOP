package Maps;

import java.util.Hashtable;

import static jdk.internal.org.jline.keymap.KeyMap.key;
import static sun.tools.jstat.Alignment.keySet;

public class HashTables {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10);
        table.put(100, "Brian");
        table.put(200, "Mary");
        table.put(555, "Josie");
        table.put(777, "Kellie");
        for(Integer key : table.keySet()) {
            System.out.println(key + "\t" + table.get(key()));
        }
        //System.out.println(table.get(100));


    }
}
