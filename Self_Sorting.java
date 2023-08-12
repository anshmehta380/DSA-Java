public class Self_Sorting
{
    public static void printArray(int[] arr)
    {
        for (int i : arr)
            System.out.print(" " + i);
    }
    public static void main(String[] args)
    {
        // BUBBLE SORT TOH CHUTIYE KARTE HAI
        // Selection Sort
        // in this sort we select the the minimun element and push it at the first place
        int[] arr = {4,8,9,2,7,10,1,12,13,6,5,100};
        for(int i=0;i<arr.length-1;i++)
        {
            int min = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min]=temp;
        }
        printArray(arr);
        System.out.println();

        // Insertion Sort
        int[] a = {10,9,7,6,8,3,5,4,1,2,11,19,22,34,53,32,122,30,26,35};
        for(int i=1;i< a.length;i++)
        {
            int curr = a[i];
            int j = i-1;
            while(j>=0 && curr<a[j])
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=curr;
        }
        printArray(a);
    }
}
