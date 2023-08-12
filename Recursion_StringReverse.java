import java.util.Scanner;

public class Recursion_StringReverse
{
    public static void stringRecursion(String str,int index)
    {
        if(index==0)
        {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        stringRecursion(str,index-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string and i will reverse it using recursion");
        String s = sc.nextLine();
        stringRecursion(s,s.length()-1);
    }
}
