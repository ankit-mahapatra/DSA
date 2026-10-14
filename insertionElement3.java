public class insertionElement3 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int position = 3;
        int element = 33;
        int [] newArr = new int[arr.length + 1];
        for(int i=0 ; i<position-1; i++){
             newArr[i] = arr[i];
        };
        newArr[position-1] = element; 
        for(int i = position; i< newArr.length; i++){
           newArr[i] =  arr[i-1];
        };
        for(int i=0; i< newArr.length; i++){
            System.out.println(newArr[i]);
        }
    }
}
