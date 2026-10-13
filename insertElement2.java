public class insertElement2 {
    public static void main(String[] args) {
        int [] arr = {1,2, 3, 4, 5, 6, 7, 8, 9, 0};
        int element = 22;
        int position = 2;
        int[] newArr = new int[arr.length + 1];
        for(int i = 0; i< position-1; i++){
            newArr[i] = arr[i]; 
        };
        newArr[position-1] = element;
        for(int i= position; i< newArr.length;i++){
           newArr[i] = arr[i-1];
        };
        for(int i= 0; i< newArr.length; i++){
            System.out.println(newArr[i]);
        }
    }
}
