import java.util.*;
public class AM_Hashmap_self {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // Insertion
        map.put("Name","Ansh");
        map.put("Age","20");
        map.put("College","Nirma University");

        if(map.containsKey("Name"))
            System.out.println(map.get("Name"));
        map.put("Name","ansh");
        System.out.println(map);
        System.out.println("Map returns null value when the key is not found: "+map.get("valueNotPresent"));

        // Traversing an map using entry set
        for(Map.Entry<String,String> e:map.entrySet()){
            System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
            System.out.println(e.hashCode());
            e.setValue("An");
        }
        // Hashcode will be same do matter how many time you use it.
        for(Map.Entry<String,String> e:map.entrySet()){
            System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
            System.out.println(e.hashCode());

        }

        // Methods of Hashmap Entry

    }
}
