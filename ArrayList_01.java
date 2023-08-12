import java.util.ArrayList;
import java.util.Collections;


// Learning ArrayList
public class ArrayList_01 {
    public static void main(String[] args) {
        /*
         1. ArrayList always takes object
         2. Primitive data types requires pre-assigned memory while objects are allocated memory at time of initialization
         3. ArrayList kind of link take the objects and link them together
         4. So if we want to use a primitive data type we will have to use its Object instead of the actual primitive data type
         5. Ex :- For int we can use Integer Class
         6. ArrayList are not of fixed size unlike arrays

         ------------------------------OPERATIONS ON ARRAY LIST------------------------------------
         1. Add
         2. Get
         3. Modify
         4. Delete/Remove
         5. Iteration
         */

        /*
         SYNTAX:-  ArrayList<Object> nameOfList = new ArrayList<>();
                            OR
         SYNTAX:- ArrayList<Object> nameOfLise = new ArrayList<Object>();
                              (BOTH ARE SIMILAR)
        */
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        ArrayList<Float> list4 = new ArrayList<>();

        // Adding elements
        list.add(0);
        list.add(2);
        list.add(3);

        // Printing list
        System.out.println(list);

        // Get - Get function takes the index of the element you want
        int a = list.get(0);
        System.out.println(a);

        // Adding Elements in between
        // In .add() function all the elements are added in the end you cant add in between
        // To add Between elements add(Index,element) - is used.
        list.add(1,1);
        System.out.println(list);

        // Set elements - Changing those elements that already exists in the list
        list.set(0,5);
        System.out.println(list);

        // Delete Element
        // remove() - is used to delete an element it takes Index OR Value as parameter remove(Index),remove(Value)
        list.remove(3);
        System.out.println(list);

        // Finding the size of ArrayList
        // Size will return the Size of ArrayList
        System.out.println(list.size());

        // Iteration in ArrayList
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // Sorting in ArrayList
        // Collections.sort() - this function will sort List
        // Collections.sort() - can sort Any DataStructure which it inherits
        Collections.sort(list);
        System.out.println(list);
    }
}