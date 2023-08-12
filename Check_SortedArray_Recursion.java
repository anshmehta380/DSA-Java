// Program - Check Whether the given integer array is sorted or not using recursion
public class Check_SortedArray_Recursion
{
    public static void SortedOrNot(int[] arr,int index)
    {
        if(index==arr.length)
        {
            System.out.println("Array is sorted");
            return;
        }
        if(arr[index-1]<arr[index])
            SortedOrNot(arr,index+1);
        else
        {
            System.out.println("Array is not sorted");
            return;
        }
    }
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,0};
        SortedOrNot(a,1);
    }
}
