public class Bit_Manupilation
{
    public static void main(String[] args)
    {
        // GET BIT (AND OPERATION)
        int n = 5; // 0101
        int pos = 2; // 0-p1, 1-p2, 0-p3, 1-p4;
        int bitMask = 1<<pos;
        if((bitMask & n)==0)
            System.out.println("Bit at position "+pos+" is 0");
        else
            System.out.println("Bit at position "+pos+" is 1");

        // SET BIT (OR OPERATION)
        // n = 0 1 0 1
        // bitMask2 = 0001 << 0010
        // Or will be 0101 OR 0010 = 0111(7)
        int bitMask2 = 1<<1;
        int newNumber = bitMask2 | n;
        System.out.println("After setting the bit: "+newNumber);

        // CLEAR BIT (AND & NOT OPERATION)
        int bitMask3 = 1<<pos; // 0001
        //After left shift it will be 0100
        //Now perform Not operation
        bitMask3 = ~bitMask3;
        // Now perform AND operation
        // 0100 & 0101 = 0001 , So our answer should be 1.
        int newNumber3 = bitMask3 & n;
        System.out.println("After clearing bit answer is: "+newNumber3);

        //UPDATE BIT
        // TO Update bit as 0 use AND Operation
        int bitMask4 = 1<<pos;  // 0001 << 0100
        bitMask4 = ~bitMask4;   // NOT (1011)

        int newNumber4 = bitMask4 & n; // (1011 & 0101 = 0001)
        System.out.println("Updated bit as 0 is : "+newNumber4); // Answer will be 1

        // To Update bit as 1;
        int bitMask5 = 1<<pos+1;
        int newNumber5 = bitMask5 | n;
        System.out.println("Updated bit as 1 is : "+newNumber5);
    }
}
