// Program - Place 1xM tiles into a NxM block
// FIND HOW MANY WAY YOU CAN PLACE THE TILES
// If all horizontally OR Vertically means 1 way
public class PlaceTiles_Recursion
{
    public static int placeTiles(int n,int m) {
        if(n == m) {
            // if 3x3 and 1x3 is the size you want to fit then either you can put All tiles Horizontally or Vertically
            return 2;
        }
        if(n < m)
        {
            // if 2x3 and 1x3 than it means you can only fit the tile Horizontally it means 1 way then return 1.
            return 1;
        }
        // for else cases
        int verticalTiles = placeTiles(n-m,m);
        int horizontalTiles = placeTiles(n-1,m);
        return verticalTiles + horizontalTiles;
    }
    public static void main(String[] args) {
    // Give the size of floor
        int ways = placeTiles(4,2);
        System.out.println(ways);
    }
}
