import java.util.HashSet;

public class UniqueElementsString_Recursion
{
    public static void Uni(String str, int idx, HashSet<String> set)
    {
        if(idx==str.length())
        {
            System.out.println("Set is: "+set);
            return;
        }
        char currChar = str.charAt(idx);
        String d = "" + currChar;
        set.add(d);
        Uni(str,idx+1,set);
    }
    public static void main(String[] args)
    {
        HashSet<String> set = new HashSet<>();
        Uni("aaa",0,set);
    }
}
