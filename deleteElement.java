public class deleteElement {
    public static void main(String[] args) {
        int[] arr =  {1,2, 3, 4, 5, 6 ,7 ,8, 9, 0};
        int position = 4;
        int [] newArr = new int[arr.length-1];
        for(int i= 0; i< position-1; i++){
            newArr[i] = arr[i];
        };
        for(int i= position-1; i< newArr.length; i++){
            newArr[i] = arr[i+1];
        };
        for(int i = 0; i< newArr.length; i++){
            System.out.println(newArr[i]);
        }
    }
}
