import java.util.*;
public class AM_Hashmap {
    // HashMaps are Unordered
    public static void main(String[] args) {
        // HashMap<(key Datatype),(Value datatype)> var_name = new HashMap<>();
        HashMap<String,Integer> map = new HashMap<>();

        // Insertion
        map.put("India",120);
        map.put("USA",30);
        map.put("China",150);

        System.out.println(map);
        map.put("China",180);
        System.out.println(map);

        // Search - Checking Keys,
        if(map.containsKey("China"))
            System.out.println("Key is Present in map");
        else
            System.out.println("Key is not Present in the map");

        // To get the Values - You can access values  using keys same as dictionary
        System.out.println(map.get("China")); // Key exists
        System.out.println(map.get("Indonesia")); // Key doesnt exists

        // Iterating in HashMap's using for loop
        // for(int val: arr)
        System.out.println("\nUsing Entry Set: ");
        for(Map.Entry<String, Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println("\nTaking all the keys in a set and then Iterating: ");
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        // Deleting
        map.remove("China");
        System.out.println(map);
    }
}
