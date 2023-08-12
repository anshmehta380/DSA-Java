// Find the 1st and Last Occurence of a Character in the string
public class FirstLastOccurenceString_Recursion
{
    public static int first = -1;
    public static int last = -1;
    public static void Occurence(String str,int index,char element)
    {
        if(str.length()-1==index)
        {
            System.out.println("First occurence is: "+first);
            System.out.println("Last occurence is: "+last);
            return;
        }
        char currElement = str.charAt(index);
        if(currElement == element)
        {
            // First is used to check whether the element has occurred one time or not if not than initialize it with 0.
            if(first==-1){
                first = index;
                // or else initialize the last with the index where currElement == element
            }else{
                last = index;
            }
        }
        // index+1 to Traverse the string
        Occurence(str,index+1,element);
    }
    public static void main(String[] args)
    {
        Occurence("bbabaacdaefaah",0,'a');
    }
}
