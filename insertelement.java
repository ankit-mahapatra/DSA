public class insertelement{
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 6};
        int element = 5;
        int position = 5;
        int[] newArr = new int[arr.length + 1];
        for(int i = 0; i< position-1; i++ ){
            newArr[i] = arr[i];
         };
         newArr[position-1] = element;
         for(int i = position; i< newArr.length; i++){
            newArr[i]= arr[i-1];
         }
        for(int i  = 0; i< newArr.length; i++)
            System.out.println(newArr[i]);
    }
}