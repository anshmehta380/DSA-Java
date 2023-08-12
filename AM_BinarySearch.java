public class AM_BinarySearch {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        arr[0][0] = 1;
        arr[0][1] = 3;
        arr[0][2] = 5;
        arr[0][3] = 7;
        arr[1][0] = 10;
        arr[1][1] = 11;
        arr[1][2] = 16;
        arr[1][3] = 20;
        arr[2][0] = 23;
        arr[2][1] = 30;
        arr[2][2] = 34;
        arr[2][3] = 60;
        int target = 34;
        int n = arr.length;
        int m = arr[0].length;
        int low = 0;
        int high = (n*m)-1;
        int idx1 = 0;
        int idx2 = 0;
        while(low <= high){
            int mid = (low+high)/2;
            // when you divide the number of coloums with middle value you get the row index
            // when you modulo the number of coloums with middle value you get the coloum index
            if(arr[mid/m][mid%m] == target){
                idx1 = mid/m;
                idx2 = mid%m;
                break;
            }
            if(arr[mid/m][mid%m] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.println(arr[idx1][idx2]);
    }
}
