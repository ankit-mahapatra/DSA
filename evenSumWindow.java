//Count subarrays of size k having even sum

public class evenSumWindow {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        int sum = 0;
        int count=0;
        for(int i = 0; i<k; i++){
            sum = sum + arr[i];
        }
        if(sum % 2 == 0){
            count ++;
        }
        for(int i=k; i<arr.length;i++){
            sum = sum + arr[i] - arr[i-k];
            if(sum % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
