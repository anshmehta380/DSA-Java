public class PrintAllPermutation_recursion
{
    public static void PrintPermu(String str,String permutation) {
        if(str.length()==0) {
            System.out.println(permutation);
            return;
        }
        // for loop is used to make all the char sit at first place each time
        // in the next call we will send those char's which are to be sitted next
        // we will continue till the end and in each call we will add our CurrentCharacter in the PERMUTATION
        for(int i=0;i<str.length();i++) {
            char currChar = str.charAt(i);
            // This thing here is used for passing the next string
            // Suppose you have the first char as "b" in "abc" -->Your i is at "b" making it the first char
            // so your (0,i) = "a" + (i+1,till the end) = "c" --> newStr = "ac"
            String newStr = str.substring(0,i) + str.substring(i+1);
            PrintPermu(newStr,permutation+currChar);
        }
    }
    public static void main(String[] args) {
        PrintPermu("abc","");
    }
}
