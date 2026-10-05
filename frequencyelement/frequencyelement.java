package frequencyelement;

public class frequencyelement {
    public static void main(String[] args) {
    int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 6, 34, 3, 7, 8, 0,6 ,6 };
    for( int i  = 0; i< arr.length; i++){
        int count = 0;
        for(int j = 0; j< arr.length; j ++){
            if (arr[i] == arr[j]){
                count++;
            }
        }
            System.out.println(arr[i] + " = " + count);
    }
}
}