package hashset;

import java.util.*;

public class hashInput {

     public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");

        // Check if element exists
        System.out.println(set.contains("Banana")); // true

        // Remove element
        set.remove("Apple");

        // Size of the set
        System.out.println(set.size()); // 2

        // Iterate over the set
        Iterator<String> it = set.iterator();
        while (it.hasNext()) 

        {
            System.out.println(it.next());
        }

        // Convert to array 
        Object[] arr = set.toArray();
        System.out.println("Array length: " + arr.length);

        // Clear the set
        set.clear();
        System.out.println(set.isEmpty());  // true 
    }
    
}
