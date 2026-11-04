//Find the maximum average of a subarray of size k
public class minAverage {
   public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,7,8,9,9};
    int k = 3;
    int sum = 0;
    for(int i= 0; i<k; i++){
        sum = sum + arr[i];
    } 
    int minSum = sum;
    for(int i = k; i<arr.length; i++){
        sum = sum + arr[i] - arr[i-k];
        if(sum< minSum){
            minSum = sum;
        }
    }
    double average = (double)minSum/k;
    System.out.println(average);
   } 
}
