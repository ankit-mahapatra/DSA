public class moveallZero {
    public static void main(String[] args) {
        int [] arr = {1, 0, 2, 4, 0, 6, 7, 8, 0,5, 4};
        int index = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        while(index< arr.length){
                arr[index] = 0;
                index++;
        }
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
