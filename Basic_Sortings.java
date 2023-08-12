
public class Basic_Sortings
{
    public static void printArray(int[] arr)
    {
        int[] ar =arr;
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(" "+ar[i]);
        }
    }
    public static void main(String[] args)
    {
        // Bubble Sort
        int[] arr = {7,8,3,1,2};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //Accessing Array
        printArray(arr);

        // Selection Sort
        int[] arr2 = {7,8,3,1,2};
        for(int i=0;i<arr2.length-1;i++)
        {
            // Select the smallest element
            int min=i;
            for(int j=i+1;j<arr2.length;j++)
            {
                // If the value of smaller becomes greater then next element
                // then make the next element smallest
               if(arr2[min]>arr2[j])
               {
                  min = j;
               }
            }
            // swap the greatest with smallest.
            int temp = arr2[min];
            arr2[min]=arr2[i];
            arr2[i] = temp;
        }
        System.out.println();
       printArray(arr2);

        // Insertion Sort
        int[] a= {7,8,3,1,2};
        for(int i=0;i<a.length;i++)
        {
            int curr = a[i];
            int j = i-1;
            while(j>=0 && curr < a[j])
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=curr;
        }
        System.out.println();
       printArray(a);
    }
}
