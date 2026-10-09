public class swap2element{
    public static void main(String[] args) {
        int [] arr = { 10, 20, 30, 40, 50};
        int i= 1;
        int j= 4;

        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        for(int k=0; k < arr.length; k++){
            System.out.println(arr[k]);
        }
    }
}