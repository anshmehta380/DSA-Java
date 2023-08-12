// Program - We will remove duplicates from a string using recursion
public class RemoveDuplicates_Recursion
{
    public static void removeDup(String str,int idx,String newString)
    {
        if(idx==str.length()-1)
        {
            System.out.println(newString);
            return;
        }
        //Take currentCharacter
        char currChar = str.charAt(idx);
        String a = ""+ currChar;
        if(!(newString.contains(a)))
        {
            newString+=currChar;
            removeDup(str,idx+1,newString);
        }
        else
        {
            removeDup(str,idx+1,newString);
        }

    }
    public static void main(String[] args)
    {
        String str = "abbccda";
        removeDup(str,0,"");
    }
}
