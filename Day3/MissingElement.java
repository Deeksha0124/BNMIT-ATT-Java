package Day3;
public class MissingElement {
    public static int findMissingElement(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] != mid + 1){
                //go to the LHS
                //perform the checks as well
                if(mid == 0 || arr[mid - 1] == mid){
                    return mid + 1;
                }
                e = mid - 1;
            }
            else if(arr[mid] == mid + 1){
                //go to the RHS
                s = mid + 1;
            }
        }
        return arr.length + 1;
    }
    public static void main(String[] args){
        int[] arr = {100,101,102,103};
        System.out.println(findMissingElement(arr));
    }
}
