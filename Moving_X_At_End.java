// Program - We will move all the 'X' at the end of the String using recursion
public class Moving_X_At_End
{
    public static void moveAllX(String str,int idx,int count, String newString)
    {
        if(idx==str.length())
        {
            for(int i=0;i<count;i++)
                newString += 'x';
            System.out.println(newString);
            return;
        }
        // Take the current Character
        char currChar = str.charAt(idx);
        if(currChar=='x')
        {
            count++;
            moveAllX(str,idx+1,count,newString);
        }
        else
        {
            newString += currChar;
            moveAllX(str,idx+1,count,newString);
        }
    }
    public static void main(String[] args)
    {
        String str = "abilbcsxvxxsduedibux";
        moveAllX(str,0,0,"");
    }
}
