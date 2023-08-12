// In a party you can call a guest single or in pairs the number of guests is n. Find total no. of ways you can invite with
public class Find_Guest_Single_or_pairs
{
    public static int CallingGuests(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        //Single
        int way1=CallingGuests(n-1);
        //In pairs
        int way2 = (n-1) *CallingGuests(n-2);
        return way1+way2;
    }

    public static void main(String[] args) {
        System.out.println(CallingGuests(3));
    }
}
