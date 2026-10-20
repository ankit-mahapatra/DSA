public class duplicateElement3 {
    public static void main(String[] args) {
        int []arr =  { 1,2, 3, 4, 5,6 , 6, 2,3 ,4 ,6,};
        boolean duplicate = true;
        for(int i= 0; i< arr.length; i++){
            for(int j = i+1;j< arr.length; i++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate Aray Element is: "+ arr[i]);
                    break;
                }
            }
        }
    }
}
