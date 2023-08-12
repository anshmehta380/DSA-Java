import org.w3c.dom.ls.LSOutput;

public class Recursion
{
    public static void Math(int x)
    {
        System.out.print(" "+x);
       if(x>=10)
       {
           return;
       }
       Math(x+1);
    }
    // Print Sum
    public static void PrintSum(int i,int n,int sum)
    {
        sum +=i;
        if(i==n)
        {
            System.out.print("Your sum is: "+sum);
            return;
        }
        PrintSum(i+1,n,sum);
    }
    // Factorial

    public static void factorial(int i,int n,int ans)
    {
        ans *= i;
        if(i==n)
        {
            System.out.print("Factorial is: "+ans);
            return;
        }
        factorial(i+1,n,ans);
    }
    public static void fibonnaciBolte(int i,int n,int sum)
    {

        if(sum==0)
            return;

        int c = i+n;
        System.out.print(" "+c);
        fibonnaciBolte(n,c,sum-1);
    }
    public static void power(int x,int oldX,int n)
    {
        if(n==1)
        {
            System.out.println("Power total is : "+oldX);
            return;
        }
        oldX = x*oldX;
        power(x,oldX,n-1);
    }
    public static void main(String[] args)
    {
        PrintSum(1,10,0);
        System.out.println();
        Math(1);
        System.out.println();
        factorial(1,5,1);
        System.out.println();
        fibonnaciBolte(0,1,5);
        System.out.println();
        power(2,2,4);
        System.out.println();
    }
}
