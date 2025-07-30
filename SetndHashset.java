import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetndHashset {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("walter");
        names.add("white");
        names.add("skyler");
        names.add("amore");
        names.add("jesse");
        names.add("pinkman");
        names.remove("jesse");

        for (String string : names) {
            System.out.println(string); // Print each name in the set
            
        }

        names.forEach(System.out::println); // Print each name using forEach
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
                System.out.println(iterator.next()); // Print each name using an iterator
            
        }
            System.out.println(names);
            System.out.println("Size of the set: " + names.size());
            System.out.println(names.isEmpty());
                names.clear();
                System.out.println(names);   
                
       
    }
}
