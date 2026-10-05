public class Sum{
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        int sum = 0;
        for(int i  = 0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum of Array is: " + sum);
    }
}