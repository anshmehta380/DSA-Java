public class Print_Subsequences_Recursion
{
    public static void subsequences(String str,int idx,String newString)
    {
        if(idx==str.length()) {
            System.out.println("New String is: "+newString);
            return;
        }
        //if curr character wants to be in the newString
        char currChar = str.charAt(idx);
        subsequences(str,idx+1,newString+currChar);
        subsequences(str,idx+1,newString);
    }
    public static void main(String[] args)
    {
        subsequences("abc",0,"");
    }
}
