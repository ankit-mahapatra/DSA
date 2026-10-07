public class searchanelement{
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 34, 2, 7, 9, 9 , 9, 95,0};
        int searchElement = 9095;
        boolean found = false;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == searchElement){
                found = true;
                break;
            }
        }
        if(found){
        System.out.println("Element found");
        }
        else
            {
            System.out.println("Element not found");
        }
    }
}