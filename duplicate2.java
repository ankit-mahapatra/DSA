public class duplicate2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1,2,3,7,8,8,9};
        for(int i = 0; i< arr.length; i++){
            boolean duplicate = false;
          for(int j=0; j<i; j++){
             if(arr[j] == arr[i]){
                duplicate = true;
                break;
             }
          }
          if(!duplicate){
            System.out.print(arr[i]+" ");
          }
    }
}
}