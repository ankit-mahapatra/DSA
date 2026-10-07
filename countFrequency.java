public class countFrequency {
    public static void main(String[] args) {
        int [] arr = {1, 3, 4, 6, 6, 7, 7, 755, 5, 6, 7, 75, 78, 6, 4, 74, 6};
        int num = 7;
        int count = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == num){
                count++;
            }
        }
     System.out.println("The number of Frequency is: "+ count);
    }
}
