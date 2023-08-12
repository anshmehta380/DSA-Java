// Find all the way in a maze from (0,0) to (n,m)
// Two rules :: You can go Down & Right only (DIAGONAL NOT ALLOWED)
public class FindPathsInMaze_Recursion
{
    // In this maze we can move DOWN & RIGHT it means (i+1,j)-->DOWN & (i,j+1)-->RIGHT
    // So down traverse all the DOWN paths then Traverese all the Right Paths when you and add them both
    public static int countPath(int i, int j, int n, int m) {
        // if i > 3 it means there is no path
        // suppose 3x3 then i can go till (2,0) now if i becomes (3,0) which never existed therefore there is no path bro go back return 0
        // return 0 Because there is no path.
        if(i==n || j==m) {
            return 0;
        }
        // suppose n,m is 3x3 therefore if you reach (2,2) it means you reached the destination successfully Return 1 path.
        if( i==n-1 && j ==n-1) {
            return 1;
        }
        int downPaths = countPath(i+1,j,n,m);
        int rightPaths = countPath(i,j+1,n,m);
        return downPaths + rightPaths;
    }
    public static void main(String[] args)
    {
        int n=3,m=3;
        int total = countPath(0,0,n,m);
        System.out.println(total);
    }
}
