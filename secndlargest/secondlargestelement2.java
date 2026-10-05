package secndlargest;

public class secondlargestelement2 {
    public static void main(String[] args) {
        int [] arr = {12, 23, 54, 86549, 5759940, 3537849, 3638093, 3647950, 47457};
        int largest = arr[0];


        for ( int i = 1; i< arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int secondlargest = arr[0];
        for(int i = 1; i< arr.length ; i++){
            if(arr[i]> secondlargest && arr[i]!= largest){
                secondlargest = arr[i];
            }
        }
        System.out.println("Largest number is: "+ largest);
        System.out.println(" Second Largest number is: "+ secondlargest);
    }
}
