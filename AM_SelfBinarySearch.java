public class AM_SelfBinarySearch
{
    public static void main(String[] args) {
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        int low = arr2[0];
        int high =  arr2.length-1;
        int mid = (low+high)/2;
        while(arr2[mid] != target){
            if(target > mid){
                low = mid+1;
                mid = (low+high)/2;
            }
            if(target < mid){
                high = mid-1;
                mid = (low+high)/2;
            }
        }
        System.out.println("Target found at index: "+mid);
    }
}
