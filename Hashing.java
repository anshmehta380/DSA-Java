import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        // Time Complexities
        // Insert/Add - O(1)
        // Search/Contains - O(1)
        // Delete/Remove - O(1)
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Search
        if(set.contains(1))
            System.out.println("Set contains 1");
        if(!set.contains(6))
            System.out.println("Set does not contain 6");

        // Delete
        set.remove(1);
        if(!set.contains(1))
            System.out.println("We deleted 1");
        // set.size()
        System.out.println("Set size :"+set.size());

        // printing all set elements
        System.out.println("Your set is: "+set);

        // Iterator in set - you cannot iterate set using for loops and all like set(i) and all
        // set.iterator() is a method which returns an Iterator for the set to traverse it
        Iterator it = set.iterator();

        // Iterator has 2 functions - hasNext; next
        System.out.println(it.hasNext());
        // Set are unordered
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());
    }
}
