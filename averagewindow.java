public class averagewindow {
    public static void main(String[] args) {
        int [] arr  =  {1, 2,3 ,43 ,4 ,8,9,0};
        int k= 3;
        int sum  = 0;
        for(int i=0; i< k; i++){
            sum  = sum + arr[i];
        }
        System.out.println((double)sum/k);
        for(int i=k;i< arr.length; i++){
            sum = sum + arr[i] - arr[i-k];
        double average = (double)sum/k;
        System.out.println(average);
        }
    }
}
