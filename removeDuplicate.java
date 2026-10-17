public class removeDuplicate {
    public static void main(String[] args) {
        int [] arr= {1,1,2,3,4,5,6,7,8};
        int j = 0;
        for(int i=1;i< arr.length; i++){
            if(arr[i] != arr[j] ){
                j++;
                arr[j]  = arr[i];
            }
        }
        for(int i = 0; i<=j;i++){
            System.out.print(arr[i]);
        }
        System.out.println("\nUnique elements: " + (j + 1));
    }
}
