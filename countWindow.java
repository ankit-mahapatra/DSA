//Count windows having sum greater than a given number give a hint

public class countWindow {
    public static void main(String[] args) {
        int [] arr  = {1, 2, 3, 4, 5, 6, 7, 8, 8, 9};
        int k = 3;
        int target = 10;
        int sum = 0;
        int count=0;
        for(int i = 0; i < k; i++){
            sum  = sum + arr[i];
             if(sum > target){
            count++;
        }
        }
        for(int i = k; i<arr.length;i++){
            sum = sum + arr[i] - arr[i-k];
             if(sum > target){
            count++;
            }
        }
        System.out.println(count);
    }
}