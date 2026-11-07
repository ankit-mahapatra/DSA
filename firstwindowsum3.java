// 8. Find the first window with sum equal to a given target
public class firstwindowsum3 {
   public static void main(String[] args) {
    int [] arr = {1,2,3,4, 5,6 ,7 ,8 ,9,0};
    int k = 3;
    int sum = 0;
    int target = 10;
     boolean found = true;
  for(int i  = 0; i < k; i++){
            sum = sum + arr[i];
            if (sum  == target){
                System.out.println("we found from index 0 to " + (k-1));
                found = true;
            }
        }
        for(int i = k; i< arr.length; i++){
            sum = sum + arr[i] - arr[i-k];
            if(sum == target){
                System.out.println("Window found from index "+ (i-k+1)+ " to "+ i);
                found = true;
            }
        }
        if(!found){
        System.out.println("Not found!");
        }
    }
}
