public class SquareRootBinarySearch {
    static int sqRoot(int n){
        int s = 0;
        int e = n;
        int ans = 0;
        while(e>0){
            int mid = s + (e-s)/2;
            int square = mid * mid;
            if(square == n){
                return mid;
            } else if (square < n){
                //store the ans and move to the right
                ans = mid;
                s = mid + 1;
            }else{
                //we are out of range, so go to the left to find the answer
                e = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sqRoot(36));
        System.out.println(sqRoot(49));
        System.out.println(sqRoot(50));
    }
}
