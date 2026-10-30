public class maxsum2 {
    public static void main(String[] args) {
        int [] arr = {1,2, 3,4, 5,6,7,7,9,9,9};
        int k = 3;
        int sum  = 0;
        for(int i = 0; i<k; i++){
            sum = sum+ arr[i];
        }
        int maxSum = sum;
        for(int i = k; i< arr.length; i++){
            sum = sum + arr[i] - arr[i-k];
            if(maxSum < sum){
                maxSum = sum;
            }
        }
        System.out.println(maxSum);

    }
}
