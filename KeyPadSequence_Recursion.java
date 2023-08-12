public class KeyPadSequence_Recursion
{
    public static String[] keypad ={".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printComb(String str,int idx,String Combination)
    {
        if(idx==str.length())
        {
            System.out.println(Combination);
            return;
        }
        // Taking the first digit of the user char
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];
        for(int i=0; i<mapping.length(); i++){
            printComb(str,idx+1,Combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args)
    {
        printComb("23",0,"");
    }
}
