public class smallestElement{
    public static void main(String[] args) {
        int [] arr= {1, 3, 2, 4, 5, 6, 7, 8, 9, 3};
        int smallest = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smalle Element in Array is: "+ smallest);
    }
}