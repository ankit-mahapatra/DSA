public class moveszero2 {
    public static void main(String[] args) {
        int [] arr = {1,3,4,0, 0, 8, 0};
        int j = 0;
        for( int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for( int i=0; i< arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
