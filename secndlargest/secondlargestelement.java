package secndlargest;

public class secondlargestelement {
    public static void main(String[] args) {
        int [] arr  = {12, 34, 56, 78, 89, 13, 890, 678};
         int largest = arr[0];
         for( int i = 1 ; i < arr.length ; i ++){
        
            if(arr[i] > largest){
                largest = arr[i];
            }
         }
         int secndlargest = arr[0];
        for( int i = 1; i< arr.length; i++){
            if(arr[i]> secndlargest && arr[i] != largest){
                 secndlargest = arr[i];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second largest: " + secndlargest);
    }
}
