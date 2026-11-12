//Find the first window whose sum equals a given target.
public class windowSumTarget {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        int sum = 0;
        int target = 10;
        for(int i = 0; i< k; i++){
            sum = sum + arr[i];
        }
    }
}
