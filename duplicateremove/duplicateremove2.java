package duplicateremove;

public class duplicateremove2 {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 2, 4, 5, 6, 7, 8, 9,3};
        
        for(int i = 0; i<arr.length; i++){
             boolean duplicate  = false;
        for(int j = 0; j < i; j++){
            if (arr[i] == arr[j]){
                duplicate = true;
                break;
            }
        }
            if(!duplicate){
                System.out.println(arr[i]);
            }
        }
    }
}
