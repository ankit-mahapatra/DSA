public class largestelement{
    public static void main(String[] args) {
        int [] arr={2,3, 5, 6, 6, 7, 3,6 ,3,6,9009871,864322,9865431,98765321,};
        int largest = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}