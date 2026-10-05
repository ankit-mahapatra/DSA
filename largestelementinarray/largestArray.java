package largestelementinarray;

public class largestArray {
    public static void main(String[] args) {
        int [] arr = {12,13,14,15,345,89,98};
        int  largest = arr[0];

        for (int i = 1; i < arr.length;i++){
            if( arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
