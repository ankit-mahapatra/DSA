public class numberisplusminus {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, -1, 8, -9,5};
        int positive = 0;
        int negative = 0;
        for(int i = 0; i< arr.length; i++){
            if( arr[i]>0){
                 positive++;
            }
            else{
                negative++;
            }
        }
        System.out.println("The count of positive number is: "+ positive);
        System.out.println("The count of negative number is: "+ negative);
    }
}
