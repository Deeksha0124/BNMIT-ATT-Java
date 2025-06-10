package Day6.Backtracking;

import java.util.Scanner;

public class ratInMaze {
    static boolean isPathSafe(int[][] arr, int x, int y, int n){
        return (x < n && y < n && arr[x][y] == 1);
    }
    static boolean ratInMaze(int[][] arr, int x, int y, int n, int[][] resultantArray){
        //base case
        //if the rat has reached the destination [n-1][n-1]
        if(x == n-1 && y == n-1){
            resultantArray[x][y] = 1;
            return true;
        }
        //check if the rat can stand at the current position / cell (x,y)
        if(isPathSafe(arr, x, y, n)){
            resultantArray[x][y] = 1;
            //move forward to find a path
            if(ratInMaze(arr, x+1, y, n, resultantArray)){
                return true;
            }
            //move downward find a path
            if(ratInMaze(arr, x, y+1, n, resultantArray)){
                return true;
            }
            //we couldn't find a path, so we backtrack
            resultantArray[x][y] = 0; //backtracking
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        //input array (Maze) n x n
        int[][] arr = new int[n][n];
        System.out.println("Enter the Maze Array values: (0 and 1)");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //take the resultant array (n x n) initialized with 0s
        int[][] resultantArray = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                resultantArray[i][j] = 0;
            }
        }
        if(ratInMaze(arr, 0, 0, n,  resultantArray)){
            // a path exists, it is in the resultant array
            System.out.println("\nPath found: ");
            System.out.println();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(resultantArray[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("No path found for the rat.");
        }
    }
}
